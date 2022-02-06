package com.company;

public class FriedPotatoes extends JinkFood implements Printable{
    private String tastyOfPotatoes;

    public FriedPotatoes(String name, String size, int price, String tastyOfPotatoes) {
        super(name, size, price);
        this.tastyOfPotatoes = tastyOfPotatoes;
    }

    public String getTastyOfPotatoes() {
        return tastyOfPotatoes;
    }

    public void setTastyOfPotatoes(String tastyOfPotatoes) {
        this.tastyOfPotatoes = tastyOfPotatoes;
    }

    @Override
    public void print() {
        System.out.println("Name:" + getName() +  " " + "Size:" + getSize() + " " + "Price:" +
                getPrice() + " " +"Tasty:" + getTastyOfPotatoes());
    }
}
