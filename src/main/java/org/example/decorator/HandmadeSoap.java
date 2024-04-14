package org.example.decorator;

public class HandmadeSoap implements Soap{
    public double price;

    public HandmadeSoap() {
    }

    public HandmadeSoap(double price){
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getStructure() {
        return "Handmade_Soap";
    }
}
