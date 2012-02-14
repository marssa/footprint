package mise.marssa.footprint;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

    public void start(BundleContext context) throws Exception {
        // TODO add activation code here
    	System.out.println("Activator Started");
    }

    public void stop(BundleContext context) throws Exception {
        // TODO add deactivation code here
    	System.out.println("Activator Stopped");
    }

}
