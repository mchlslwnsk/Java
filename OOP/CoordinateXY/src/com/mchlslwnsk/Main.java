package com.mchlslwnsk;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

// Utwórz klasę Punkt, która przechowuje dwie wartości typu int - współrzędne punktu na powierzchni.
// Napisz w niej także metody które:
//
//  zwiększają wybraną współrzędną o 1
//  zmieniają wybraną zmienną o dowolną wartość
//  zwracają wartość współrzędnych (oddzielne metody)
//  wyświetla wartość współrzędnych
//  Napisz także klasę, w której przetestujesz działanie metod wyświetlając działanie metod na ekranie,

        Point point = new Point();
        point.x = 0;
        point.y = 0;
        point.setIncrementX();
        point.setIncrementY();
        point.displayXY();
        System.out.println("********************");

        point.changeY(3);
        point.displayXY();

        int valueX = point.getValueX();
        int valueY = point.getValueY();
        System.out.println("GetValue: " + valueX + "\nGetValue: " + valueY);


    }
}
