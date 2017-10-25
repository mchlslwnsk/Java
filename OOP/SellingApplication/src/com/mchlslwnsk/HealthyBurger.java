package com.mchlslwnsk;

public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;


    public HealthyBurger(String meat, double price) {
        super("Healthy", "Brown rye", meat, price);

    }

    public void addHealthAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }


    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if (this.healthyExtra1Name != null) {
            hamburgerPrice += healthyExtra1Price;
            System.out.println("Extra add " + this.healthyExtra1Name + " costs " + this.healthyExtra1Price);
        }
        if (healthyExtra2Name != null) {
            hamburgerPrice += healthyExtra1Price;
            System.out.println("Extra add " + this.healthyExtra2Name + " costs " + this.healthyExtra2Price);
        }
        return hamburgerPrice;
    }


//  Scratch / Test
//    public double initiazeHealthy() {
//
//        double healthyBurger = this.price;
//        System.out.println("Name" + this.healthyExtra1Name + " on " + this.breadRollType + " , " +
//                "price is " + this.healthyExtra1Price);
//
//        if (healthyExtra1Name != null) {
//            healthyBurger += healthyExtra1Price;
//            System.out.println("Extra add " + this.healthyExtra1Name + " costs " + this.healthyExtra1Price);
//        }
//
//        if (healthyExtra1Name != null) {
//            healthyBurger += healthyExtra1Price;
//            System.out.println("Extra add " + this.healthyExtra1Name + " costs " + this.healthyExtra1Price);
//        }
//        return healthyBurger;
//    }

}
