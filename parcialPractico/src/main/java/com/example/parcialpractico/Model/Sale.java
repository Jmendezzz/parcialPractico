package com.example.parcialpractico.Model;

import java.time.LocalDate;

public class Sale {
    private int saleNumber;
    private LocalDate date;
    private Client client;
    private SaleDetail saleDetail[];

    public Sale(int saleNumber, LocalDate date, Client client, SaleDetail[] saleDetail) {
        this.saleNumber = saleNumber;
        this.date = date;
        this.client = client;
        this.saleDetail = saleDetail;
    }

    public int getSaleNumber() {
        return saleNumber;
    }

    public void setSaleNumber(int saleNumber) {
        this.saleNumber = saleNumber;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public SaleDetail[] getSaleDetail() {
        return saleDetail;
    }

    public void setSaleDetail(SaleDetail[] saleDetail) {
        this.saleDetail = saleDetail;
    }
}
