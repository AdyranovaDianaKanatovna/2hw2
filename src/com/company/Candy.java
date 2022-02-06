package com.company;

public class Candy extends Sweets implements Printable{
    private int amountOfCandy;

    public Candy(String name, String size, int price, int amountOfCandy) {
        super(name, size, price);
        this.amountOfCandy = amountOfCandy;
    }

    public int getAmountOfCandy() {
        return amountOfCandy;
    }

    public void setAmountOfCandy(int amountOfCandy) {
        this.amountOfCandy = amountOfCandy;
    }

    @Override
    public void print() {
        System.out.println("Name:" + getName() +  " " + "Size:" + getSize() + " " + "Price:" +
                getPrice() + " " +"Amount:" + getAmountOfCandy());
    }
}
