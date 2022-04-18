/**
 * generated by Xtext 2.12.0
 */
package org.polarsys.chess.iot.runtimeDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.polarsys.chess.iot.runtimeDsl.RuntimeDslFactory
 * @model kind="package"
 * @generated
 */
public interface RuntimeDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "runtimeDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.polarsys.org/chess/iot/RuntimeDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "runtimeDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RuntimeDslPackage eINSTANCE = org.polarsys.chess.iot.runtimeDsl.impl.RuntimeDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.polarsys.chess.iot.runtimeDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.polarsys.chess.iot.runtimeDsl.impl.ModelImpl
   * @see org.polarsys.chess.iot.runtimeDsl.impl.RuntimeDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Module</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__MODULE = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.polarsys.chess.iot.runtimeDsl.impl.ModuleImpl <em>Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.polarsys.chess.iot.runtimeDsl.impl.ModuleImpl
   * @see org.polarsys.chess.iot.runtimeDsl.impl.RuntimeDslPackageImpl#getModule()
   * @generated
   */
  int MODULE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__NAME = 0;

  /**
   * The feature id for the '<em><b>Uses</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__USES = 1;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__ACTION = 2;

  /**
   * The number of structural features of the '<em>Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.polarsys.chess.iot.runtimeDsl.impl.startImpl <em>start</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.polarsys.chess.iot.runtimeDsl.impl.startImpl
   * @see org.polarsys.chess.iot.runtimeDsl.impl.RuntimeDslPackageImpl#getstart()
   * @generated
   */
  int START = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START__NAME = 0;

  /**
   * The number of structural features of the '<em>start</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.polarsys.chess.iot.runtimeDsl.impl.stopImpl <em>stop</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.polarsys.chess.iot.runtimeDsl.impl.stopImpl
   * @see org.polarsys.chess.iot.runtimeDsl.impl.RuntimeDslPackageImpl#getstop()
   * @generated
   */
  int STOP = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STOP__NAME = 0;

  /**
   * The number of structural features of the '<em>stop</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STOP_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.polarsys.chess.iot.runtimeDsl.impl.restartImpl <em>restart</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.polarsys.chess.iot.runtimeDsl.impl.restartImpl
   * @see org.polarsys.chess.iot.runtimeDsl.impl.RuntimeDslPackageImpl#getrestart()
   * @generated
   */
  int RESTART = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESTART__NAME = 0;

  /**
   * The number of structural features of the '<em>restart</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESTART_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.polarsys.chess.iot.runtimeDsl.impl.redeployImpl <em>redeploy</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.polarsys.chess.iot.runtimeDsl.impl.redeployImpl
   * @see org.polarsys.chess.iot.runtimeDsl.impl.RuntimeDslPackageImpl#getredeploy()
   * @generated
   */
  int REDEPLOY = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REDEPLOY__NAME = 0;

  /**
   * The number of structural features of the '<em>redeploy</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REDEPLOY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.polarsys.chess.iot.runtimeDsl.impl.logImpl <em>log</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.polarsys.chess.iot.runtimeDsl.impl.logImpl
   * @see org.polarsys.chess.iot.runtimeDsl.impl.RuntimeDslPackageImpl#getlog()
   * @generated
   */
  int LOG = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOG__NAME = 0;

  /**
   * The number of structural features of the '<em>log</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOG_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.polarsys.chess.iot.runtimeDsl.impl.monitorImpl <em>monitor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.polarsys.chess.iot.runtimeDsl.impl.monitorImpl
   * @see org.polarsys.chess.iot.runtimeDsl.impl.RuntimeDslPackageImpl#getmonitor()
   * @generated
   */
  int MONITOR = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONITOR__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONITOR__VALUE = 1;

  /**
   * The number of structural features of the '<em>monitor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONITOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.polarsys.chess.iot.runtimeDsl.impl.runImpl <em>run</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.polarsys.chess.iot.runtimeDsl.impl.runImpl
   * @see org.polarsys.chess.iot.runtimeDsl.impl.RuntimeDslPackageImpl#getrun()
   * @generated
   */
  int RUN = 8;

  /**
   * The feature id for the '<em><b>Module</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUN__MODULE = 0;

  /**
   * The number of structural features of the '<em>run</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.polarsys.chess.iot.runtimeDsl.impl.UsesImpl <em>Uses</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.polarsys.chess.iot.runtimeDsl.impl.UsesImpl
   * @see org.polarsys.chess.iot.runtimeDsl.impl.RuntimeDslPackageImpl#getUses()
   * @generated
   */
  int USES = 9;

  /**
   * The feature id for the '<em><b>Module</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USES__MODULE = 0;

  /**
   * The number of structural features of the '<em>Uses</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USES_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.polarsys.chess.iot.runtimeDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.polarsys.chess.iot.runtimeDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.runtimeDsl.Model#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.polarsys.chess.iot.runtimeDsl.Model#getName()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.polarsys.chess.iot.runtimeDsl.Model#getModule <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Module</em>'.
   * @see org.polarsys.chess.iot.runtimeDsl.Model#getModule()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Module();

  /**
   * Returns the meta object for class '{@link org.polarsys.chess.iot.runtimeDsl.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module</em>'.
   * @see org.polarsys.chess.iot.runtimeDsl.Module
   * @generated
   */
  EClass getModule();

  /**
   * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.runtimeDsl.Module#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.polarsys.chess.iot.runtimeDsl.Module#getName()
   * @see #getModule()
   * @generated
   */
  EAttribute getModule_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.polarsys.chess.iot.runtimeDsl.Module#getUses <em>Uses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Uses</em>'.
   * @see org.polarsys.chess.iot.runtimeDsl.Module#getUses()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Uses();

  /**
   * Returns the meta object for the containment reference list '{@link org.polarsys.chess.iot.runtimeDsl.Module#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Action</em>'.
   * @see org.polarsys.chess.iot.runtimeDsl.Module#getAction()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Action();

  /**
   * Returns the meta object for class '{@link org.polarsys.chess.iot.runtimeDsl.start <em>start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>start</em>'.
   * @see org.polarsys.chess.iot.runtimeDsl.start
   * @generated
   */
  EClass getstart();

  /**
   * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.runtimeDsl.start#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.polarsys.chess.iot.runtimeDsl.start#getName()
   * @see #getstart()
   * @generated
   */
  EAttribute getstart_Name();

  /**
   * Returns the meta object for class '{@link org.polarsys.chess.iot.runtimeDsl.stop <em>stop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>stop</em>'.
   * @see org.polarsys.chess.iot.runtimeDsl.stop
   * @generated
   */
  EClass getstop();

  /**
   * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.runtimeDsl.stop#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.polarsys.chess.iot.runtimeDsl.stop#getName()
   * @see #getstop()
   * @generated
   */
  EAttribute getstop_Name();

  /**
   * Returns the meta object for class '{@link org.polarsys.chess.iot.runtimeDsl.restart <em>restart</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>restart</em>'.
   * @see org.polarsys.chess.iot.runtimeDsl.restart
   * @generated
   */
  EClass getrestart();

  /**
   * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.runtimeDsl.restart#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.polarsys.chess.iot.runtimeDsl.restart#getName()
   * @see #getrestart()
   * @generated
   */
  EAttribute getrestart_Name();

  /**
   * Returns the meta object for class '{@link org.polarsys.chess.iot.runtimeDsl.redeploy <em>redeploy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>redeploy</em>'.
   * @see org.polarsys.chess.iot.runtimeDsl.redeploy
   * @generated
   */
  EClass getredeploy();

  /**
   * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.runtimeDsl.redeploy#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.polarsys.chess.iot.runtimeDsl.redeploy#getName()
   * @see #getredeploy()
   * @generated
   */
  EAttribute getredeploy_Name();

  /**
   * Returns the meta object for class '{@link org.polarsys.chess.iot.runtimeDsl.log <em>log</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>log</em>'.
   * @see org.polarsys.chess.iot.runtimeDsl.log
   * @generated
   */
  EClass getlog();

  /**
   * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.runtimeDsl.log#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.polarsys.chess.iot.runtimeDsl.log#getName()
   * @see #getlog()
   * @generated
   */
  EAttribute getlog_Name();

  /**
   * Returns the meta object for class '{@link org.polarsys.chess.iot.runtimeDsl.monitor <em>monitor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>monitor</em>'.
   * @see org.polarsys.chess.iot.runtimeDsl.monitor
   * @generated
   */
  EClass getmonitor();

  /**
   * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.runtimeDsl.monitor#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.polarsys.chess.iot.runtimeDsl.monitor#getName()
   * @see #getmonitor()
   * @generated
   */
  EAttribute getmonitor_Name();

  /**
   * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.runtimeDsl.monitor#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.polarsys.chess.iot.runtimeDsl.monitor#getValue()
   * @see #getmonitor()
   * @generated
   */
  EAttribute getmonitor_Value();

  /**
   * Returns the meta object for class '{@link org.polarsys.chess.iot.runtimeDsl.run <em>run</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>run</em>'.
   * @see org.polarsys.chess.iot.runtimeDsl.run
   * @generated
   */
  EClass getrun();

  /**
   * Returns the meta object for the reference '{@link org.polarsys.chess.iot.runtimeDsl.run#getModule <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Module</em>'.
   * @see org.polarsys.chess.iot.runtimeDsl.run#getModule()
   * @see #getrun()
   * @generated
   */
  EReference getrun_Module();

  /**
   * Returns the meta object for class '{@link org.polarsys.chess.iot.runtimeDsl.Uses <em>Uses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Uses</em>'.
   * @see org.polarsys.chess.iot.runtimeDsl.Uses
   * @generated
   */
  EClass getUses();

  /**
   * Returns the meta object for the reference '{@link org.polarsys.chess.iot.runtimeDsl.Uses#getModule <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Module</em>'.
   * @see org.polarsys.chess.iot.runtimeDsl.Uses#getModule()
   * @see #getUses()
   * @generated
   */
  EReference getUses_Module();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RuntimeDslFactory getRuntimeDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.polarsys.chess.iot.runtimeDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.polarsys.chess.iot.runtimeDsl.impl.ModelImpl
     * @see org.polarsys.chess.iot.runtimeDsl.impl.RuntimeDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

    /**
     * The meta object literal for the '<em><b>Module</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__MODULE = eINSTANCE.getModel_Module();

    /**
     * The meta object literal for the '{@link org.polarsys.chess.iot.runtimeDsl.impl.ModuleImpl <em>Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.polarsys.chess.iot.runtimeDsl.impl.ModuleImpl
     * @see org.polarsys.chess.iot.runtimeDsl.impl.RuntimeDslPackageImpl#getModule()
     * @generated
     */
    EClass MODULE = eINSTANCE.getModule();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULE__NAME = eINSTANCE.getModule_Name();

    /**
     * The meta object literal for the '<em><b>Uses</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__USES = eINSTANCE.getModule_Uses();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__ACTION = eINSTANCE.getModule_Action();

    /**
     * The meta object literal for the '{@link org.polarsys.chess.iot.runtimeDsl.impl.startImpl <em>start</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.polarsys.chess.iot.runtimeDsl.impl.startImpl
     * @see org.polarsys.chess.iot.runtimeDsl.impl.RuntimeDslPackageImpl#getstart()
     * @generated
     */
    EClass START = eINSTANCE.getstart();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute START__NAME = eINSTANCE.getstart_Name();

    /**
     * The meta object literal for the '{@link org.polarsys.chess.iot.runtimeDsl.impl.stopImpl <em>stop</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.polarsys.chess.iot.runtimeDsl.impl.stopImpl
     * @see org.polarsys.chess.iot.runtimeDsl.impl.RuntimeDslPackageImpl#getstop()
     * @generated
     */
    EClass STOP = eINSTANCE.getstop();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STOP__NAME = eINSTANCE.getstop_Name();

    /**
     * The meta object literal for the '{@link org.polarsys.chess.iot.runtimeDsl.impl.restartImpl <em>restart</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.polarsys.chess.iot.runtimeDsl.impl.restartImpl
     * @see org.polarsys.chess.iot.runtimeDsl.impl.RuntimeDslPackageImpl#getrestart()
     * @generated
     */
    EClass RESTART = eINSTANCE.getrestart();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESTART__NAME = eINSTANCE.getrestart_Name();

    /**
     * The meta object literal for the '{@link org.polarsys.chess.iot.runtimeDsl.impl.redeployImpl <em>redeploy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.polarsys.chess.iot.runtimeDsl.impl.redeployImpl
     * @see org.polarsys.chess.iot.runtimeDsl.impl.RuntimeDslPackageImpl#getredeploy()
     * @generated
     */
    EClass REDEPLOY = eINSTANCE.getredeploy();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REDEPLOY__NAME = eINSTANCE.getredeploy_Name();

    /**
     * The meta object literal for the '{@link org.polarsys.chess.iot.runtimeDsl.impl.logImpl <em>log</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.polarsys.chess.iot.runtimeDsl.impl.logImpl
     * @see org.polarsys.chess.iot.runtimeDsl.impl.RuntimeDslPackageImpl#getlog()
     * @generated
     */
    EClass LOG = eINSTANCE.getlog();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOG__NAME = eINSTANCE.getlog_Name();

    /**
     * The meta object literal for the '{@link org.polarsys.chess.iot.runtimeDsl.impl.monitorImpl <em>monitor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.polarsys.chess.iot.runtimeDsl.impl.monitorImpl
     * @see org.polarsys.chess.iot.runtimeDsl.impl.RuntimeDslPackageImpl#getmonitor()
     * @generated
     */
    EClass MONITOR = eINSTANCE.getmonitor();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MONITOR__NAME = eINSTANCE.getmonitor_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MONITOR__VALUE = eINSTANCE.getmonitor_Value();

    /**
     * The meta object literal for the '{@link org.polarsys.chess.iot.runtimeDsl.impl.runImpl <em>run</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.polarsys.chess.iot.runtimeDsl.impl.runImpl
     * @see org.polarsys.chess.iot.runtimeDsl.impl.RuntimeDslPackageImpl#getrun()
     * @generated
     */
    EClass RUN = eINSTANCE.getrun();

    /**
     * The meta object literal for the '<em><b>Module</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RUN__MODULE = eINSTANCE.getrun_Module();

    /**
     * The meta object literal for the '{@link org.polarsys.chess.iot.runtimeDsl.impl.UsesImpl <em>Uses</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.polarsys.chess.iot.runtimeDsl.impl.UsesImpl
     * @see org.polarsys.chess.iot.runtimeDsl.impl.RuntimeDslPackageImpl#getUses()
     * @generated
     */
    EClass USES = eINSTANCE.getUses();

    /**
     * The meta object literal for the '<em><b>Module</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USES__MODULE = eINSTANCE.getUses_Module();

  }

} //RuntimeDslPackage
