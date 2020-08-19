package com.example.json;

public class Address {
    private String strees;
    private String city;

    public Address() {
    }

    public Address(String strees, String city) {
        this.strees = strees;
        this.city = city;
    }

    public String getStrees() {
        return strees;
    }

    public void setStrees(String strees) {
        this.strees = strees;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "strees='" + strees + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
