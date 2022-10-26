package com.example.parcialpractico.Services;

import com.example.parcialpractico.Services.Impl.ClienteImpl;

public class DrugStore {
    public DrugStore(){

    }
    ClienteImpl clientService = new ClienteImpl() ;

    public ClienteImpl getClientService(){
        return clientService;
    }

}
