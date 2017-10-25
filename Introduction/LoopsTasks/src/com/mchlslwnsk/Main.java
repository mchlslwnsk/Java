package com.mchlslwnsk;

public class Main {

    public static void main(String[] args) {

// Poza poznanym dzisiaj operatorem ++ istnieje też jego odpowiednik zmniejszający wartość zmiennej o 1. Jest nim --.
// 1. Napisz program, który wypisze na ekranie malejąco wszystkie liczby od 20 do 10.
// 2. Napisz pętlę while, która wypisze na ekranie wszystkie liczby od 10 do 20 włącznie.
// 3. Napisz pętlę for, która wypisze na ekranie wszystkie liczby nieparzyste od -10 do 40.
// 4. Przerob petle z 3 na while

        //displayer();
        // displayWhile();
        //displayOdd();
        // displayOddEven();
        rocketDisplay();
        rocketDisplayLaunched();
    }

    public static void displayer() {
        for (int i = 20; i > 10; i--) {
            System.out.println(i);
        }
    }

    public static void displayWhile() {

        int number = 10;
        while (number >= 10 && number <= 20) {
            System.out.println(number);
            number++;
        }
    }

    public static void displayOdd() {
        for (int i = -10; i < 40; i++) {
            if (i % 2 != 0) {
                System.out.println(i);

            }
        }
    }

    public static void displayOddEven() {
        for (int i = -10; i < 40; i++) {
            while (i % 2 == 0) {
                System.out.println(i);
                i++;
            }

        }
    }

    public static void rocketDisplay() {
        int rocket = 0;
        while (rocket < 2) {
            System.out.println("Checking in progress ");
            rocket++;
        }

    }

    public static void rocketDisplayLaunched() {
        int rocket = 0;
        do {
            rocket++;
            System.out.println("Rocket was launched before whole check");
        } while (rocket == 0);
    }


}




