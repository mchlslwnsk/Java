package com.mchlslwnsk;

public class Main {

    public static void main(String[] args) {

//        Stwórz klasę Punkt2D, która przechowuje informacje na temat punktu na przestrzeni dwuwymiarowej
//         (współrzędne x oraz y). Zawierająca dwa konstruktory: bezparametrowy ustawiający pola na wartość 0,
// oraz przyjmujący dwa argumenty i ustawiający pola obiektu zgodnie z podanymi parametrami.
//
//        Napisz klasę Punkt3D dziedziczącą po Punkt2D, reprezentującą punkt w trójwymiarze (dodatkowe pole z).
//
//          W klasie testowej utwórz obiekty obu klas i przetestuj działanie.

        Point2D punkt2D = new Point2D(2,3);
        System.out.println("XY "+ punkt2D.pointX + " And " + punkt2D.pointY);

        Point3D punkt3D = new Point3D(2,3,4);
        System.out.println("XYZ "+ punkt3D.pointX + " And " + punkt3D.pointY + " and " + punkt3D.pointZ);

    }
}
