package com.mchlslwnsk;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        //  public Dog(String name, int brain, int body, int size, int weight) {
        // super(name, brain, body, size, weight);
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chewEat() {
        System.out.println("Dog.chewEat() called");
    }

    //override method from superclass Animal
    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chewEat();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        //move(5);
       //move above is better cuz its directly call even the method is override
        super.move(5);
        // wto create smthg unique for dog class is preferable to use super.
    }

    public void run(){
        System.out.println("Dog.run() called");
        move(10);
    }

    public void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }
    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed); // automatically executed
    }
}
