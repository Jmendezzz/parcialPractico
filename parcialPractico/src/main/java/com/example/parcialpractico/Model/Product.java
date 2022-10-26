package com.example.parcialpractico.Model;

public class Product {
    private String id;
    private int price;
    private String name;
    private int amount;
    public Product(String id, int price,String name,int amount){
        this.amount=amount;
        this.price=price;
        this.id=id;
        this.name=name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
