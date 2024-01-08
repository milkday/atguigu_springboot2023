package com.zzf.ioc_03;


public class DefaultServiceLocator {
    private static ClientServiceImpl cLientService = new ClientServiceImpl();

    public ClientServiceImpl createClientServiceInstance() {
        return cLientService;
    }
}


