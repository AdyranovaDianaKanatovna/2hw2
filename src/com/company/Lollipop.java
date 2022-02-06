package com.company;

public class Lollipop extends Sweets implements Printable{
    private String colorOfLollipop;

    public Lollipop(String name, String size, int price, String colorOfLollipop) {
        super(name, size, price);
        this.colorOfLollipop = colorOfLollipop;
    }

    public String getColorOfLollipop() {
        return colorOfLollipop;
    }

    public void setColorOfLollipop(String colorOfLollipop) {
        this.colorOfLollipop = colorOfLollipop;
    }

    @Override
    public void print() {
        System.out.println("Name:" + getName() +  " " + "Size:" + getSize() + " " + "Price:" +
                getPrice() + " " + "Color:" + getColorOfLollipop());
    }
}
