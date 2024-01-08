package org.zzf.ioc_01;


public class DefaultServiceLocator {
    private static ClientServiceImpl cLientService = new ClientServiceImpl();

    public ClientServiceImpl createClientServiceInstance() {
        return cLientService;
    }
}


