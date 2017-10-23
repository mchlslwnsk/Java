package com.mchlslwnsk;

import java.lang.reflect.AccessibleObject;

public class Main {

    public static void main(String[] args) {

//        BankAccount bank = new BankAccount("123123", 1000, "Nowak", "nowak@o2.pl", "666999000");
////        bank.setAccountNumber("213123131");
////        bank.setBalance(1000);
////        bank.setCustomerName("Nowak");
////        bank.setEmail("nowak@o2.pl");
////        bank.setPhoneNumber(666000777);
////System.out.println(bank.getCustomerName());
//        bank.displayCustomer();
//
//        System.out.println("*********************************");
//        bank.setDepositFunds(100);
//        bank.getWithdrawFunds(1100);
//
//        bank.setDepositFunds(100);
//        bank.getWithdrawFunds(800);
//
//        System.out.println("******************************************");
//        //Called default constructor from constructor
//        //BankAccount bang = new BankAccount();
//        // bang.displayCustomer();
//
//        BankAccount myAccount = new BankAccount("Michal", "michal@michal.pl", "69696969");
//        System.out.println(myAccount.getAccountNumber()+" name " + myAccount.getCustomerName());
//

        VipCustomer vipDefault = new VipCustomer();
        System.out.println("Name: "+vipDefault.getName()+ "\nLimit: "+vipDefault.getCrediLimit()+ "\nEmail: "+vipDefault.getEmail());

        System.out.println("///////////////////////");

        VipCustomer myVip = new VipCustomer("Michal", 20d);
        System.out.println("Name: " + myVip.getName() + "\nCredit limit: " + myVip.getCrediLimit()+ "\nemail: " +myVip.getEmail());

        System.out.println("///////////////////////");

        VipCustomer vipTotal = new VipCustomer("John", 23d, "watson@watson.pl");
        System.out.println("Name: " + vipTotal.getName() + "\nCredit limit: " + vipTotal.getCrediLimit() + "\nEmail: " +vipTotal.getEmail());





    }
}
