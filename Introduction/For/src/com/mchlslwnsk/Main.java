package com.mchlslwnsk;

public class Main {

    public static void main(String[] args) {

//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000d, 2d));
//        System.out.println("10,000 at 3% interest = " + calculateInterest(10000d, 3d));
//        System.out.println("10,000 at 4% interest = " + calculateInterest(10000d, 4d));
//
        for (int interestRate = 2; interestRate < 9; interestRate++) {
            System.out.println("10,000 at" + interestRate + "% interest = " + String.format("%.2f", calculateInterest(10000d, interestRate)));
        }

        System.out.println("*******************************");

        for (int i = 8; i > 1; i--) {
            System.out.println("10,000 at" + i + "% interest = " + String.format("%.2f", calculateInterest(10000d, i)));
        }

        System.out.println("*******************************");

        int count = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime");
                count++;
                if (count == 3) {
                    System.out.println("Exit");
                    break;
                }

            }

        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if ((n == 1)) {
            return false;
        }
        //     for (int i = 2; i <= n / 2; i++) {
        //faster method with math.sqrt than n/2. Less loops
        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            System.out.println("looping" + i);
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


}

