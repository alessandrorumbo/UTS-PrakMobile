package com.example.hotelapp;

public class Hotel {
    private String name;
    private String location;
    private String description;
    private String price;
    private int imageResourceId; // Tambahkan atribut ini

    public Hotel(String name, String location, String description, String price, int imageResourceId) {
        this.name = name;
        this.location = location;
        this.description = description;
        this.price = price;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
