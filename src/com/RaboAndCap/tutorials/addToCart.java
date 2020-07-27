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
        System.out.println("The total value of your cart is " + cartPrice + "\n");
        System.out.println("While holding these items in your cart " + "\n" + al);
        System.out.println("Would you like to pay or adjust your cart? \n");
        System.out.println("To pay, type 'Pay'. To adjust your cart type 'Adjust'");
        payOrEdit();
    }


    public void addToCart() {
        System.out.println("Welcome to the best supermarket in the world \n");
        System.out.println("We are not like any other supermarket, we are like the McDonalds");
        System.out.println("Where you order at a machine, rather than a person, because we automate stuff");

        System.out.println("Which of these items would you like to add to your cart? ");
        System.out.println("You can choose from the following products \n");
        System.out.println("Type exit to close the interface");
        System.out.println("Type done to proceed to checkout");
        itemLoop();

        chooseItems();
    }

    public void chooseItems() {
        boolean quit = false;
            do {
                String x = scan.next();
                switch (x) {
                    case "Cereals":
                        System.out.println("You've added Cereals to your cart");
                        al.add(items.products[0]);
                        System.out.println();
                        System.out.println(al);
                        cartPrice = cartPrice + items.productPrices[0];
                        System.out.println(cartPrice);
                        break;
                    case "Soap":
                        System.out.println("You've added Soap to your cart");
                        al.add(items.products[1]);
                        alPrice.add(items.productPrices[1]);
                        System.out.println(al);
                        cartPrice = cartPrice + items.productPrices[1];
                        System.out.println(cartPrice);
                        break;
                    case "Vegetables":
                        System.out.println("You've added Chinese Vegetables to your cart");
                        al.add(items.products[2]);
                        System.out.println(al);
                        cartPrice = cartPrice + items.productPrices[2];
                        System.out.println(cartPrice);
                        break;
                    case "Diapers":
                        System.out.println("You've added Diapers to your cart");
                        al.add(items.products[3]);
                        cartPrice = cartPrice + items.productPrices[3];
                        System.out.println(cartPrice);
                        break;
                    case "Yoghurt":
                        System.out.println("You've added Yoghurt to your cart");
                        al.add(items.products[4]);
                        cartPrice = cartPrice + items.productPrices[4];
                        System.out.println(cartPrice);
                        break;
                    default:
                        System.out.println("Please try again");
                        break;
                    case "Exit":
                        quit = true;
                    case "Done":
                        quit = true;
                        currentItemsInCart();
                }
            } while (!quit);


    }

    public void payOrEdit() {

    }



}
