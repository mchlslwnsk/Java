package com.mchlslwnsk;

public class Hamburger {



    private String name;
    private String breadRollType;
    private String meat;
    private double price;


    //4 variables 4 additionals
    private String add1Name;
    private double add1Price;

    private String add2Name;
    private double add2Price;

    private String add3Name;
    private double add3Price;

    private String add4Name;
    private double add4Price;

    //constructor
    public Hamburger(String name, String breadRollType, String meat, double price) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }

    // add Hamburger additions like tomato etc.
    public void addHamburgerAddition1(String name, double price) {
        this.add1Name = name;
        this.add1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.add2Name = name;
        this.add2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.add3Name = name;
        this.add3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.add4Name = name;
        this.add4Price = price;
    }

    // calculate total price of hamburger with additions
    public double itemizeHamburger() {
        // basic order info
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll with " + this.meat + ", price is " + this.price);

        //compare and assume
        if (this.add1Name != null) {
            hamburgerPrice += this.add1Price;
            System.out.println("Added " + this.add1Name + " for an extra " + this.add1Price);
        }
        if (this.add2Name != null) {
            hamburgerPrice += this.add2Price;
            System.out.println("Added " + this.add2Name + " for an extra " + this.add2Price);
        }
        if (this.add3Name != null) {
            hamburgerPrice += this.add3Price;
            System.out.println("Added " + this.add3Name + " for an extra " + this.add3Price);
        }
        if (this.add4Name != null) {
            hamburgerPrice += this.add4Price;
            System.out.println("Added " + this.add4Name + " for an extra " + this.add4Price);
        }

        //return the total hamburger price with adds.
        return hamburgerPrice;
    }


}
