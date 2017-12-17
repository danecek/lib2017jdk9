package lib2017.business;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

    @Override
    public void start(BundleContext bundleContext) throws Exception {
        FacadeService.setSt(bundleContext);
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {

    }
}
