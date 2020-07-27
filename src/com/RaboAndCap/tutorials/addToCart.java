package com.RaboAndCap.tutorials;

import java.util.ArrayList;
import java.util.Scanner;

public class addToCart extends availableItems{
    Scanner scan = new Scanner(System.in);
    ArrayList al = new ArrayList();
    ArrayList alPrice = new ArrayList();
    float cartPrice;


    availableItems items = new availableItems();

    public void itemLoop() {
        for (String productsInStorage : items.products) {
            System.out.println(productsInStorage);;
        }
    }

    public void currentItemsInCart() {
        float cartPrice;

    }


    public void addToCart() {
        System.out.println("Welcome to the best supermarket in the world \n");
        System.out.println("We are not like any other supermarket, we are like the McDonalds");
        System.out.println("Where you order at a machine, rather than a person, because we automate stuff");

        System.out.println("Which of these items would you like to add to your cart? ");
        System.out.println("You can choose from the following products \n");
        System.out.println("Type exit to close the interface");
        itemLoop();

        chooseItems();
    }

    public void chooseItems() {
        boolean quit = false;
        if (al.size() > 3) {
            quit = true;
            System.out.println("We can't handle more than 3 items, please proceed to checkout");

        }
        do {
        String x = scan.next();
        for (float productsInStoragePrice : items.productPrices)
        switch (x) {
            case "Cereals":
                System.out.println("You've added Cereals to your cart");
                al.add(items.products[0]);
                System.out.println();
                System.out.println(al);
                break;
            case "Soap":
                System.out.println("You've added Soap to your cart");
                al.add(items.products[1]);
                alPrice.add(items.productPrices[1]);
                System.out.println(al);
                break;
            case "Vegetables":
                System.out.println("You've added Chinese Vegetables to your cart");
                al.add(items.products[2]);
                System.out.println(al);
                break;
            case "Diapers":
                System.out.println("You've added Diapers to your cart");
                al.add(items.products[3]);
                alPrice.add(items.productPrices[3]);
                break;
            case "Yoghurt":
                System.out.println("You've added Yoghurt to your cart");
                al.add(items.products[4]);
                alPrice.add(items.productPrices[4]);
                break;
            default:
                System.out.println("Please try again");
                break;
            case "Exit":
                quit = true;
        }
        } while (!quit);

    }



}
