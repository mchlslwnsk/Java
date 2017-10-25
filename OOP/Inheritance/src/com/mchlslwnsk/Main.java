package com.mchlslwnsk;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Animal", 1, 1, 5, 5);


        Dog dog = new Dog("York", 6, 5, 2, 4, 1, 20, "long silky");
        dog.eat();
       // dog.walk();
        dog.run();

        Fish fish = new Fish("Pike",2, 2,2,2,1);
        fish.move(2);
    }
}
