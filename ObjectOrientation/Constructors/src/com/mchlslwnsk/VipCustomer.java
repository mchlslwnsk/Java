package com.mchlslwnsk;

public class VipCustomer {

    private String name;
    private double crediLimit;
    private String email;

    public VipCustomer() {
        this("Default name",1000d, "Default email");
        System.out.println("Constructor without parameters");
    }

    public VipCustomer(String name, double crediLimit, String email) {
        System.out.println("Constructor with parameters");
        this.name = name;
        this.crediLimit = crediLimit;
        this.email = email;
    }

    public VipCustomer(String name, double crediLimit) {
        this(name,crediLimit, "unknown@default.pl");
    }

    public String getName() {
        return name;
    }

    public double getCrediLimit() {
        return crediLimit;
    }

    public String getEmail() {
        return email;
    }


}
