package com.company;

public class Main {

    public static void main(String[] args) {
//	Cake cake = new Cake("choko","big",650,"delicious");
//    Candy candy = new Candy("truffle","small",150,30);
//    Lollipop lollipop = new Lollipop("Rainbow", "medium",25,"read and white");
//    Burger burger = new Burger("Big Jack","extra big",270,"beef");
//    Pizza pizza = new Pizza("Poperony","big",560,"four type of cheese");
//    FriedPotatoes friedPotatoes = new FriedPotatoes("Potatoes","small",100,
//            "salty");
//    Printable[] printables ={cake,candy,lollipop,burger,pizza,friedPotatoes};
        Printable[] printables1 = {createObject("candy"), createObject("burger"),
                createObject("cake"), createObject("lollipop")
                , createObject("pizza"),
                createObject("friedPotatoes")};
        for (Printable printable : printables1) {
            printable.print();
        }
//                   for (int i = 0; i < printables.length; i++) {
//         if (printables[i]instanceof JinkFood){
//             System.out.println(((JinkFood) printables[i]).getName() + " " + "price:" +
//                     (((JinkFood) printables[i]).getPrice()));
//         }
//         if (printables[i] instanceof Sweets){
//             System.out.println((((Sweets) printables[i]).getName() + " " + "price:"+
//                     (((Sweets) printables[i]).getPrice())));
//         }
//            printables[i].print();
//        }

    }

    public static Printable createObject(String className) {
        Printable printable = null;
        switch (className) {
            case "candy":
                printable = new Candy("truffle", "small", 150, 30);
                break;
            case "burger":
                printable = new Burger("Big Jack", "extra big", 270, "beef");
                break;
            case "cake":
                printable = new Cake("choko", "big", 650, "delicious");
                break;
            case "lollipop":
                printable = new Lollipop("Rainbow", "medium", 25,
                        "read and white");
                break;
            case "pizza":
                printable = new Pizza("Poperony", "big", 560, "four type of cheese");
                break;
            case "friedPotatoes":
                printable = new FriedPotatoes("Potatoes", "small", 100,
                        "salty");
                break;
        }
        return printable;
    }

}
