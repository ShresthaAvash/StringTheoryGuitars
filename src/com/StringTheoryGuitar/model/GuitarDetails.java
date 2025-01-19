/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.StringTheoryGuitar.model;

/**
 *
 * @author 23048676 Avash Shrestha
 */

public class GuitarDetails {
    private int sn;
    private String name;
    private String brand;
    private String type;
    private double price;
    private boolean freeService;
    private String stringType;
    private int Quantity;

    // Constructor
    public GuitarDetails(int sn, String name, String brand, String type, double price, boolean freeService, String stringType, int Quantity) {
        this.sn = sn;
        this.name = name;
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.freeService = freeService;
        this.stringType = stringType;
        this.Quantity = Quantity;
    }

    // Getters and Setters
    public int getSn() {
        return sn;
    }

    public void setSn(int sn) {
        this.sn = sn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isFreeService() {
        return freeService;
    }

    public void setFreeService(boolean freeService) {
        this.freeService = freeService;
    }

    public String getStringType() {
        return stringType;
    }

    public void setStringType(String stringType) {
        this.stringType = stringType;
    }
    
    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }
}