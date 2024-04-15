package org.example.decorator;

public class Glycerin extends SoapDecorator{

    private int grams;
    private double glycerinPrice;

    public int getGrams() {
        return grams;
    }
    public void setGrams(int grams) {
        this.grams = grams;
    }
    public double getGlycerinPrice() {return glycerinPrice;}
    public void setGlycerinPrice(double glycerinPrice) {this.glycerinPrice = glycerinPrice;}

    public Glycerin(Soap soap, int grams, double price){
        super(soap);
        setGrams(grams);
        setGlycerinPrice(price);
    }

    @Override
    public double getPercentagePriceIncrease() {
        return 10 * glycerinPrice * ((double)this.grams/100);
    }

    @Override
    public String getStructureName() {
        return this.grams + "g-Glycerin";
    }
}
