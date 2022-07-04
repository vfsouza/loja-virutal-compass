package com.loja.model;

public class Order {
    private String name;
    private String street;
    private String number;
    private String city;
    private String state;
    private double price;
    private String postalCode;
    private int productId;

    public Order() {
    }

    public Order(String name, String street, String number, String city, String state, double price, String postalCode, int productId) {
        this.name = name;
        this.street = street;
        this.number = number;
        this.city = city;
        this.state = state;
        this.price = price;
        this.postalCode = postalCode;
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
}
