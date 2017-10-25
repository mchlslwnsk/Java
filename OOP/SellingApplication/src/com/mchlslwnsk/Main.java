package com.mchlslwnsk;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "brown", "beef", 3d);
        //base hamburger price
      //  double price = hamburger.itemizeHamburger();

        //add additionals
        hamburger.addHamburgerAddition1("Tomato", 0.2d);
        hamburger.addHamburgerAddition2("Cheese", 1d);
        hamburger.addHamburgerAddition3("Cocumber", 0.5d);
        // hamburger.addHamburgerAddition4("Lettuce", 0.44d);

        //print total price of hamburger
        System.out.println("Total Hamburger price is: " + hamburger.itemizeHamburger());
        System.out.println("///////////////////////////////////////////////");

        // health burger price
        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 4.9d);
        healthyBurger.addHamburgerAddition1("Salade", 1.8d);
        healthyBurger.addHealthAddition1("Spinach", 1d);
       // healthyBurger.itemizeHamburger();
        System.out.println("Total Healthy burger price is: " + healthyBurger.itemizeHamburger());

        System.out.println("///////////////////////////////////////////////");

        // deluxe burger price
        DeluxeBurger deluxe = new DeluxeBurger();
        deluxe.addHamburgerAddition3("TEST", 0d);
        //deluxe.itemizeHamburger();
        System.out.println("Total Deluxe burger price is: " + deluxe.itemizeHamburger());

    }
}
