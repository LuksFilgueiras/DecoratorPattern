package org.example.decorator;

public class Glycerin extends SoapDecorator{

    private int grams;

    public int getGrams() {
        return grams;
    }

    public void setGrams(int grams) {
        this.grams = grams;
    }

    public Glycerin(Soap soap, int grams){
        super(soap);
        setGrams(grams);
    }

    @Override
    public double getPercentagePriceIncrease() {
        return 50.0 * ((double)this.grams/50);
    }

    @Override
    public String getStructureName() {
        return this.grams + "g-Glycerin";
    }
}
