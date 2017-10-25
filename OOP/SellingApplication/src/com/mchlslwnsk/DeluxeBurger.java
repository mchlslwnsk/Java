package com.mchlslwnsk;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe", "White", "Bacon & Beef", 15d);
        //two static additions to Deluxe menu
        // no itemize needed
        // if you want to select some type of chips or drink you could
        super.addHamburgerAddition1("Chips", 2.8d);
        super.addHamburgerAddition2("Drink", 2d);

    }


    //override methods prevent before add some additionals
    // no code inside
    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
}
