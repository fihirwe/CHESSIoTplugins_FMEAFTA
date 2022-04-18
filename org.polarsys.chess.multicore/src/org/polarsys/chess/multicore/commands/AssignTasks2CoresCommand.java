/*******************************************************************************
 * Copyright (C) 2020 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 ******************************************************************************/
/*------------------------------------------------------------------------------
  -
  - Copyright (c) 2015-2016 University of Padova, ITALY -  Intecs SpA 
  - All rights reserved. This program and the accompanying materials
  - are made available under the terms of the Eclipse Public License v2.0
  - which accompanies this distribution, and is available at
  - http://www.eclipse.org/legal/epl-v20.html
  -
  - Contributors:
  -
  - Alessandro Zovi azovi@math.unipd.it
  - Stefano Puri stefano.puri@intecs.it
  - Laura Baracchi laura.baracchi@intecs.it
  - Nicholas Pacini nicholas.pacini@intecs.it  
  -
  - Initial API and implementation and/or initial documentation
  ------------------------------------------------------------------------------*/package org.polarsys.chess.multicore.commands;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.Alloc.Assign;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForResource;
import org.eclipse.papyrus.infra.services.labelprovider.service.LabelProviderService;
import org.eclipse.papyrus.infra.widgets.providers.FilteredContentProvider;
import org.eclipse.papyrus.infra.widgets.providers.IStaticContentProvider;
import org.eclipse.papyrus.infra.widgets.providers.StaticContentProvider;
import org.eclipse.papyrus.infra.widgets.selectors.ReferenceSelector;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.polarsys.chess.chessmlprofile.Predictability.DeploymentConfiguration.HardwareBaseline.CH_HwProcessor;
import org.polarsys.chess.core.profiles.CHESSProfileManager;
import org.polarsys.chess.core.util.uml.ModelError;
import org.polarsys.chess.core.util.uml.UMLUtils;
import org.polarsys.chess.multicore.ReferenceSelectorNoDoubleClick;
import org.polarsys.chess.multicore.dialogs.CoreSelectorDialog;
import org.polarsys.chess.multicore.dialogs.SystemSelectionDialog;
import org.polarsys.chess.multicore.model.AbstractCommand;
import org.polarsys.chess.multicore.model.CHCore;
import org.polarsys.chess.multicore.model.CHTask;
import org.polarsys.chess.multicore.utils.GeneratorUtils;
import org.polarsys.chess.multicore.utils.QueryUtils;

/**
 * The Class AssignTasks2CoresCommand.
 */
public class AssignTasks2CoresCommand extends
AbstractCommand {

	/** The tasks. */
	private EList<CHTask> tasks;	
	
	/** The processors map. */
	private Map<Package, EList<InstanceSpecification>> processorsMap =  new HashMap<Package, EList<InstanceSpecification>>();
	
	/** The cores map. */
	private Map<InstanceSpecification, EList<CHCore>> coresMap = new HashMap<InstanceSpecification, EList<CHCore>>();
	
	/** The result. */
	private Map<CHCore, LinkedHashSet<Object>> result;
	
	/** The hw system. */
	private static Component hwSystem;
	
	/** The operation list. */
	private HashMap<CHTask, EList<CHTask>> operationList;
	
	/** The assignments. */
	private EList<Assign> assignments;
	
	/** The hw systems list. */
	private EList<InstanceSpecification> hwSystemsList = new BasicEList<InstanceSpecification>();

	
	/**
	 * Open selector to choose HW system where assign tasks.
	 *
	 * @param umlModel the uml model
	 * @param hwSystemsList the hw systems list
	 * @return the instance specification
	 */
	private static InstanceSpecification openSystemSelector (Model umlModel, 
			EList<InstanceSpecification> hwSystemsList) {

		// First of all show selector to select HwSystem
		List<InstanceSpecification> systemSelection = new ArrayList<InstanceSpecification>();
		for (InstanceSpecification syst : hwSystemsList) {
			systemSelection.add(syst);
		}

		Shell activeShell = Display.getDefault().getActiveShell();
		SystemSelectionDialog systemDialog = new SystemSelectionDialog(activeShell, systemSelection, "Select System where to assign tasks");
		if (systemDialog.open() == Window.OK) {
			String selectedSystemQN = systemDialog.getSystemName();
			EList<Element> allElems = umlModel.allOwnedElements();
			for (Element elem : allElems) {
				InstanceSpecification theSystem;
				if (elem instanceof InstanceSpecification) {
					theSystem = (InstanceSpecification)elem;
					if (theSystem.getQualifiedName()!=null && theSystem.getQualifiedName().equals(selectedSystemQN)) {							
						Classifier classif = theSystem.getClassifiers().get(0);
						hwSystem = (Component)classif;
						return theSystem;
					}				
				}
			}
		}
		return null;
	}


	/**
	 * Open the Wizard window to assign tasks to Cores (for the selected HW System).
	 *
	 * @param tasks the tasks
	 * @param pack the pack
	 * @param cores the cores
	 * @param assignments the assignments
	 * @return the map
	 */
	private static Map<CHCore, LinkedHashSet<Object>> openWizard(
			final EList<CHTask> tasks,
			Package pack,
			EList<CHCore> cores,
			EList<Assign> assignments) {

//		final ServicesRegistry servicesRegistry = ((IMultiDiagramEditor) (PlatformUI
//				.getWorkbench().getActiveWorkbenchWindow().getActivePage()
//				.getActiveEditor())).getServicesRegistry();
		
		ServicesRegistry servicesRegistry = null;
		try {
			servicesRegistry = ServiceUtilsForResource.getInstance().getServiceRegistry(pack.eResource());
		} catch (ServiceException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return null;
		}

		// Look for the tasks that are not assigned to a Processor in this package (deployment)
		EList<CHTask> taskNotYetAssignedToCore = new BasicEList<CHTask>();
		for (CHTask i : tasks) {
			if (!(QueryUtils.isTaskAssigned2Core(i, pack, assignments))) {
				taskNotYetAssignedToCore.add(i);			
			}
		}	
		
		final ReferenceSelector referenceSelector = new ReferenceSelectorNoDoubleClick(
				true, null, taskNotYetAssignedToCore);

		final IStaticContentProvider semanticProvider = new StaticContentProvider(
				tasks.toArray());

		final FilteredContentProvider filteredProvider = new FilteredContentProvider(
				semanticProvider);		
		referenceSelector.setContentProvider(filteredProvider);		

		CoreSelectorDialog dialog = null;

		ILabelProvider serv = null;
		try {
			serv = servicesRegistry.getService(LabelProviderService.class)
					.getLabelProvider();
		} catch (final ServiceException e) {
			// Activator.log.error("LabelProviderServiceNotFound", e);
		}

		referenceSelector.setLabelProvider(serv);
		dialog = new CoreSelectorDialog(Display.getDefault()
				.getActiveShell(), referenceSelector, cores, pack, assignments,
				CoreSelectorDialog.TASKS_TO_CORES,
				"Assign Tasks to Cores");

		dialog.setLabelProvider(serv);
		//dialog.setMessage("Messages.CreateDiagramImage_LifelineDialogMessage");
		//dialog.setTitle("Messages.CreateDiagramImage_LifelineDialogTitle");
		// dialog.setInitialElementSelections(insts2);

		if (dialog.open() == org.eclipse.jface.window.Window.OK) {
			Map<CHCore, LinkedHashSet<Object>> result = dialog
					.getResult();
			if (result != null)
				return result;
		}
		return null;
	}


	/* (non-Javadoc)
	 * @see org.polarsys.chess.multicore.model.AbstractCommand#execute()
	 */
	@Override
	public void execute() throws ModelError {
		queryContent(umlModel);
		printContent();		
		
		int howMany = hwSystemsList.size();
		
		InstanceSpecification theSystem = null;
		if (howMany > 1) {
			theSystem = openSystemSelector(umlModel, hwSystemsList);
		}
		else {
			theSystem = hwSystemsList.get(0);
		}
		
		if (theSystem!=null) {
			Package pack = QueryUtils.getOwnerCHGaResourcePlatformPackage(umlModel, theSystem);
	
			EList<InstanceSpecification> processorList = processorsMap.get(pack);
	
			EList<CHCore> cores =  new BasicEList<CHCore>();
			if (processorList!=null) {						
				for (InstanceSpecification proc : processorList) {
					EList<CHCore> coreList = coresMap.get(proc);
					for (CHCore core : coreList) {
						cores.add(core);
					}
				}
			}
	
			result = openWizard(tasks, pack, cores, assignments);
	
			if (result != null) {
				updateModel();
			}
		}
	}

	
	/**
	 * Prints the content.
	 */
	private void printContent() {
		System.out.println("Tasks:");
		for (CHTask component : tasks) {
			System.out.println(component);
		}		
		Set<Package> packs = processorsMap.keySet();
		for (Package pack: packs) {
			System.out.println("Package: "+pack.getName());
			EList<InstanceSpecification> procList = processorsMap.get(pack);
			for (InstanceSpecification theProc : procList) {
				System.out.println("Processor: "+theProc.getName());				 
				EList<CHCore> coreList = coresMap.get(theProc);
				for (CHCore theCore : coreList) {
					System.out.println("Core: "+theCore.getName());
				}
			}
		}
	}

	
	/**
	 * Update model.
	 */
	private void updateModel() {
		TransactionalEditingDomain editingDomain = TransactionUtil
				.getEditingDomain(umlModel);
		editingDomain.getCommandStack().execute(new Com(editingDomain));
	}

	/**
	 * Get all that is needed from the model.
	 *
	 * @param umlModel the uml model
	 * @throws ModelError the model error
	 */
	private void queryContent(Model umlModel) throws ModelError {
		try{
			hwSystem = UMLUtils.getResourcePlatformComponent(umlModel, CHESSProfileManager.DEPLOYMENT_VIEW);
		}catch (ModelError me){
			ModelError me2 = new ModelError(me.getMessage()+" Be sure that HW root Components in the ComponentView are stereotyped with CHGaResourcePlatorm");
			throw me2;
		}

		// Look for Packages stereotyped as CHGAResourcePlatform in the Deployment View
		EList<Package> packages = QueryUtils.getResourcePlatformPackages(umlModel, CHESSProfileManager.DEPLOYMENT_VIEW);		

		if (packages.size()==0) {
			ModelError me = new ModelError("Error in model: no Package stereotyped as CHGAResourcePlatform in the Deployment View!");
			throw me;
		}
		hwSystemsList = new BasicEList<InstanceSpecification>();
		
 		for(Package pack : packages) {		
			EList<InstanceSpecification> processors = new BasicEList<InstanceSpecification>();
			for (CH_HwProcessor ch_processor : QueryUtils.getAllProcessorInstancesInPackage(pack)) {
				InstanceSpecification instSpec = ch_processor.getBase_InstanceSpecification();
				processors.add(instSpec);				
				EList<CHCore> theCores = QueryUtils.getCores(ch_processor);
				coresMap.put(instSpec, theCores);				
			}
			InstanceSpecification theSystem = UMLUtils.getRootInstanceInPackage(pack);
			hwSystemsList.add(theSystem);
			processorsMap.put(pack, processors);
		}
 		
 		if (hwSystemsList.isEmpty()) {
 			ModelError me = new ModelError("Error in model: no System in the Deployment View!");
			throw me;
 		}

		EList<InstanceSpecification> instances = UMLUtils.getAllComponentInstances(umlModel, true);
		tasks = QueryUtils.getCHTasksList(instances);

		operationList = QueryUtils.getOperationChain(umlModel, tasks);
		assignments = UMLUtils.getTask2CoreAssignments(umlModel, CHESSProfileManager.DEPLOYMENT_VIEW);
	}

	/**
	 * The Class Com.
	 */
	class Com extends RecordingCommand {

		/** The assigned operations. */
		private HashSet<CHTask> assignedOperations;

		/**
		 * Instantiates a new com.
		 *
		 * @param domain the domain
		 */
		public Com(TransactionalEditingDomain domain) {
			super(domain);
		}

		/* (non-Javadoc)
		 * @see org.eclipse.emf.transaction.RecordingCommand#doExecute()
		 */
		@Override
		protected void doExecute() {

			Map<CHCore, LinkedHashSet<Object>> core2chtask = new HashMap<CHCore, LinkedHashSet<Object>>();

			for (CHCore core : result.keySet()) {
				assignedOperations = new HashSet<CHTask>();
				LinkedHashSet<Object> list = new LinkedHashSet<Object>();
				for (Object task : result.get(core)) {
					CHTask owningTask = (CHTask) task;
					list.add(owningTask);
					addRelatedOperations(owningTask, list);
				}
				core2chtask.put(core, list);
			}	

			QueryUtils.deleteTask2CoreAssociations(hwSystem);
			GeneratorUtils.buildTask2CoreAssociations(hwSystem, core2chtask);
		}

		//the related operations of a task are assigned to the same core of the task,
		/**
		 * Adds the related operations.
		 *
		 * @param owningTask the owning task
		 * @param list the list
		 */
		//TODO for now every operation shared by multiple tasks is assigned to the same core of the first task that was processed
		private void addRelatedOperations(CHTask owningTask, LinkedHashSet<Object> list) {
			for (CHTask operation : operationList.get(owningTask)) {
				if(!assignedOperations.contains(operation)) {
					list.add(operation);
					assignedOperations.add(operation);
				}
			}
		}
	}
}