package com.example.parcialpractico.Validator;

import com.example.parcialpractico.Exception.InputException;
import com.example.parcialpractico.Model.Client;

import java.util.ArrayList;

public class InputValidator {

    public void verifyInputs(String name,String age) throws InputException {

        if(name==null || age==null){
            throw new InputException("Debe completar todos los campos");
        }

    }
    public void verifyAgeInput(String age) throws InputException{
       try{
           Integer.parseInt(age);
       }catch (NumberFormatException err ){
           throw new InputException("El campo de edad debe ser completado con campos númericos");
       }

    }
    public void verifyList(ArrayList<Client> clientArrayList) throws InputException{
        if(clientArrayList.size()==0){
            throw new InputException("La lista de clientes esta vacía");

        }
    }
}
