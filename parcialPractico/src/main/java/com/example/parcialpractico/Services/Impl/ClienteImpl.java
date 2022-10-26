package com.example.parcialpractico.Services.Impl;

import com.example.parcialpractico.Model.Client;
import com.example.parcialpractico.Services.ClientService;

import java.util.ArrayList;

public class ClienteImpl implements ClientService {

    private ArrayList<Client> clientList = new ArrayList<>();


    @Override
    public void createClient(String name, String age) {
        clientList.add(new Client(name, Integer.parseInt(age)));
        System.out.println("Client added!");
    }

    @Override
    public ArrayList<Client> getClientList() {
        return clientList;
    }

    @Override
    public Client searchClient(String name) {

        for(Client client : clientList){
            if(client.getName().equals(name) && client.getAge()>18){
                return client;
            }

        }
        return null;
    }

}
