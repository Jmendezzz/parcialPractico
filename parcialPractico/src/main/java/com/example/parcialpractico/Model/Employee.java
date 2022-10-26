package com.example.parcialpractico.Model;

public class Employee extends Person{
    private int salary=0;

    public Employee(String name, String id, String cellphone, String email) {
        super(name, id, cellphone, email);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
