package com.example.parcialpractico.Services;

import com.example.parcialpractico.Model.Client;

import java.util.ArrayList;

public interface ModelFactoryControllerService {
    void createClient(String name, String age);
    ArrayList<Client> getClientList();
    Client searchClient(String name);
}
