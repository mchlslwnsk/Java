package com.mchlslwnsk;

public class Point {

    int x;
    int y;

    //  zwiększają wybraną współrzędną o 1
//  zmieniają wybraną zmienną o dowolną wartość
//  zwracają wartość współrzędnych (oddzielne metody)
//  wyświetla wartość współrzędnych
//  Napisz także klasę, w której przetestujesz działanie metod wyświetlając działanie metod na ekranie,

    public void setIncrementX() {
     //   this.x = x;
        x++;
    }

    public void setIncrementY() {
     //   this.y = y;
        y++;
    }

    public void changeY(int number) {
        y += number;
    }

    public int getValueX() {
        return x;
    }

    public int getValueY() {
        return y;
    }

    public void displayXY() {
        System.out.println("Coordinate x: " + x + "\nCoordinate y: " + y);

    }


}
