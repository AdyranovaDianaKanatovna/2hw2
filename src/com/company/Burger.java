package com.company;

public class Burger extends JinkFood implements Printable{
       private String doubleMeat;

    public Burger(String name, String size, int price, String doubleMeat) {
        super(name, size, price);
        this.doubleMeat = doubleMeat;
    }

    public String getDoubleMeat() {
        return doubleMeat;
    }

    public void setDoubleMeat(String doubleMeat) {
        this.doubleMeat = doubleMeat;
    }

    @Override
    public void print() {
        System.out.println("\uD83C\uDF54");
    }
}
