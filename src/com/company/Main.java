package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	Cake cake = new Cake("choko","big",650,"delicious");
    Candy candy = new Candy("truffle","small",150,30);
    Lollipop lollipop = new Lollipop("Rainbow", "medium",25,"read and white");
    Burger burger = new Burger("Big Jack","extra big",270,"beef");
    Pizza pizza = new Pizza("Poperony","big",560,"four type of cheese");
    FriedPotatoes friedPotatoes = new FriedPotatoes("Potatoes","small",100,
            "salty");
    Printable[] printables ={cake,candy,lollipop,burger,pizza,friedPotatoes};
           int orderedFood =4;
           switch (orderedFood){
            case 1:
                System.out.println(cake.getName());
                break;
            case 2:
                System.out.println(candy.getName());
                break;
            case 3:
                System.out.println(lollipop.getName());
                break;
        case 4:
            System.out.println(burger.getName());
            break;
        case 5:
            System.out.println(pizza.getName());
            break;
        case 6:
            System.out.println(friedPotatoes.getName());
            break;

                    }
        System.out.println("__________________");
        for (int i = 0; i < printables.length; i++) {
         if (printables[i]instanceof JinkFood){
             System.out.println(((JinkFood) printables[i]).getName() + " " + "price:" +
                     (((JinkFood) printables[i]).getPrice()));
         }
         if (printables[i] instanceof Sweets){
             System.out.println((((Sweets) printables[i]).getName() + " " + "price:"+
                     (((Sweets) printables[i]).getPrice())));
         }
            printables[i].print();
        }

    }
}
