package org.example.decorator;

public class Essence extends SoapDecorator{

    private int ml;
    private String name;

    public int getMl() {
        return ml;
    }

    public void setMl(int ml) {
        this.ml = ml;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Essence(Soap soap, int ml, String name){
        super(soap);
        setMl(ml);
        setName(name);
    }

    @Override
    public double getPercentagePriceIncrease() {
        return 80 * ((double)this.ml/10);
    }

    @Override
    public String getStructureName() {
        return this.ml+"ml-" + name + " Essence";
    }
}
