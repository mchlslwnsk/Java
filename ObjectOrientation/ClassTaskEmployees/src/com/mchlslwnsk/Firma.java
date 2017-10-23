package com.mchlslwnsk;

public class Firma {

    public static void main(String[] args) {

//   1. Napisz klase pracownik ktora przechowuje pola: imie, nazwisko, wiek.
//      2. Następnie utwórz klasę Firma, w której wykorzystasz klasę pracownik do
//      utworzenia dwóch obiektów przechowujących dane pracowników
//      (wymyśl sobie jakieś) i później wyświetlasz je na ekran.
//      2.2 Zmodyfikuj powyższy program tak, aby utworzyć trzech pracowników, a odpowiednie
//      pola zainicjuj wartościami z wcześniej utworzonych tablic (dowolne dane) przy użyciu pętli.

        Employee employee = new Employee();

        {
            employee.setDane("Jan", "Kowalski", 30);
            System.out.println("Dane: " + employee.getImie() + ", "
                    +employee.getNazwisko()+ ", " + employee.getWiek());

        }
    }
}





