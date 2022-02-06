package com.company;

public class Pizza extends JinkFood implements Printable{
    private String cheese;

    public Pizza(String name, String size, int price, String cheese) {
        super(name, size, price);
        this.cheese = cheese;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    @Override
    public void print() {
        System.out.println("\uD83C\uDF55");
    }
}
