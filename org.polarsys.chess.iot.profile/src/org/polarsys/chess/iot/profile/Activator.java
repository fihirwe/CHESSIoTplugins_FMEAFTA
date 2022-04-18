package org.polarsys.chess.iot.profile;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator extends AbstractUIPlugin implements BundleActivator {


	// The plug-in ID
	public static final String PLUGIN_ID = "org.polarsys.chess.iot.profile"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;

	/**
	 * The constructor
	 */
	public Activator() {
	}

	@Override
	public void start(BundleContext arg0) throws Exception {
		// TODO Auto-generated method stub
		super.start(arg0);
		plugin = this;

	}

	@Override
	public void stop(BundleContext arg0) throws Exception {
		// TODO Auto-generated method stub
		plugin = null;
		super.stop(arg0);
	}




	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}

	public static void error(String message, Throwable e) {
		String msg = null;
		if (message == null)
			msg = e.getMessage();
		else
			msg = String.format("%s: %s", message, e.getMessage());
		IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, msg, e);
		plugin.getLog().log(status);
	}

	public static void info(String message) {
		IStatus status = new Status(IStatus.INFO, Activator.PLUGIN_ID, message);
		plugin.getLog().log(status);
	}
}
