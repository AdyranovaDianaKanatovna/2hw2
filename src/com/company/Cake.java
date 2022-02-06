package com.company;

public class Cake extends Sweets implements Printable{
    private String rateOfCake;

    public Cake(String name, String size, int price, String rateOfCake) {
        super(name, size, price);
        this.rateOfCake = rateOfCake;
    }

    public String getRateOfCake() {
        return rateOfCake;
    }

    public void setRateOfCake(String rateOfCake) {
        this.rateOfCake = rateOfCake;
    }

    @Override
    public void print() {
        System.out.println("Name:" + getName() +  " " + "Size:" + getSize() + " " + "Price:" +
                getPrice() + " " +"Rate:" + getRateOfCake());
    }
}
