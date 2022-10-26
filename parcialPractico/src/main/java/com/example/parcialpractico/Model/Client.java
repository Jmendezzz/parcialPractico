package com.example.parcialpractico.Model;

public class Client extends  Person{
    private  String streetAdress;

    public Client(String name, String id, String cellphone, String email, String streetAdress) {
        super(name, id, cellphone, email);
        this.streetAdress = streetAdress;
    }
    public Client (String name, int age){
        super(name,age);
    }

    public String getStreetAdress() {
        return streetAdress;
    }

    public void setStreetAdress(String streetAdress) {
        this.streetAdress = streetAdress;
    }
}
