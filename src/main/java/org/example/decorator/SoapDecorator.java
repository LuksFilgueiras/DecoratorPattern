package org.example.decorator;

public abstract class SoapDecorator implements Soap {

    private final Soap soap;
    private String structure;

    public SoapDecorator(Soap soap){
        this.soap = soap;
    }

    public abstract double getPercentagePriceIncrease();

    @Override
    public double getPrice() {
        return this.soap.getPrice() * (1 + (this.getPercentagePriceIncrease() / 100));
    }

    public abstract String getStructureName();

    @Override
    public String getStructure() {
        return this.soap.getStructure() + "/" + this.getStructureName();
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }
}
