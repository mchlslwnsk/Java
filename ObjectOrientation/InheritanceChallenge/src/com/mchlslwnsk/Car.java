package com.mchlslwnsk;

public class Car extends Vehicle {

    private int wheels;
    private int engineCapacity;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;


    public Car(String type, int weight, int wheels, int engineCapacity, int doors, int gears, boolean isManual) {
        super(type, weight);
        this.wheels = wheels;
        this.engineCapacity = engineCapacity;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.changeGear(): Change to " + this.currentGear + " gear");
    }

    public void changeVelocity(int speed, int direction) {
        move(speed, direction);
        System.out.println("Car.changeVelocity: Velocity " + speed + " direction " + direction);
    }

    public int getWheels() {
        return wheels;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public int getDoors() {
        return doors;
    }

    public int getGears() {
        return gears;
    }

    public boolean isManual() {
        return isManual;
    }

    public int getCurrentGear() {
        return currentGear;
    }
}
