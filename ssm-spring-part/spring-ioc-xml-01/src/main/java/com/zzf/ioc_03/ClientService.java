package com.zzf.ioc_03;

public class ClientService {
    private static ClientService clientService = new ClientService();

    private ClientService() {
    }

    public static ClientService createInstance() {
        return clientService;
    }
}

