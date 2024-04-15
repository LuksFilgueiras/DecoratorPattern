package org.example.decorator;

public class Essence extends SoapDecorator{

    private int ml;
    private double essencePrice;
    private String name;

    public int getMl() {
        return ml;
    }
    public void setMl(int ml) {
        this.ml = ml;
    }
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public double getEssencePrice() {return essencePrice;}
    public void setEssencePrice(double essencePrice) {this.essencePrice = essencePrice;}

    public Essence(Soap soap, int ml, String name, double price){
        super(soap);
        setMl(ml);
        setName(name);
        setEssencePrice(price);
    }

    @Override
    public double getPercentagePriceIncrease() {
        return 20 * essencePrice * ((double)this.ml/10);
    }

    @Override
    public String getStructureName() {return this.ml+"ml-" + name + " Essence";}
}
