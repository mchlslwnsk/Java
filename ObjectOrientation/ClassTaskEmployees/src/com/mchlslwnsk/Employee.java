package com.mchlslwnsk;

public class Employee {

 private String imie;
 private String nazwisko;
 private int wiek;

 public void setDane(String imie, String nazwisko, int wiek){
  this.imie = imie;
  this.nazwisko = nazwisko;
  this.wiek = wiek;
 }

 public String getImie(){
  return imie;
 }
 public  String getNazwisko(){
return nazwisko;
 }
public int getWiek(){
  return wiek;
}
}
