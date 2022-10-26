package com.example.parcialpractico.Model;

public class Person {
    private String name;
    private String id;
    private String cellphone;
    private String Email;

    private int age;

    public Person(String name, String id, String cellphone, String email) {
        this.name = name;
        this.id = id;
        this.cellphone = cellphone;
        Email = email;
    }
    public Person(String name, int age)
    {
        this.name=name;
        this.age=age;
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

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
