package com.example.parcialpractico.Controller;

import com.example.parcialpractico.Model.Client;
import com.example.parcialpractico.Services.DrugStore;
import com.example.parcialpractico.Services.ModelFactoryControllerService;

import java.util.ArrayList;

public class ModelFactoryController implements ModelFactoryControllerService {
    DrugStore drugStore;



    private static class SingletonHolder {
        private final static ModelFactoryController eINSTANCE = new ModelFactoryController();
    }
    public static ModelFactoryController getInstance() {
        return SingletonHolder.eINSTANCE;
    }
    public ModelFactoryController() {
        drugStore = new DrugStore();
    }
    @Override
    public void createClient(String name, String age) {
        drugStore.getClientService().createClient(name,age);
    }

    @Override
    public ArrayList<Client> getClientList() {
        return drugStore.getClientService().getClientList();
    }

    @Override
    public Client searchClient(String name) {
        return drugStore.getClientService().searchClient(name);
    }

}
