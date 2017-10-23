package com.mchlslwnsk;


public class Vehicle {

    private String type;
    private int weight;

    private int currentVelocity;
    private int currentDirection;


    public Vehicle(String type, int weight) {

        this.type = type;
        this.weight = weight;

        this.currentDirection = 0;
        this.currentVelocity = 0;

    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.handSteering() called.  Hand steering in: " + currentDirection);

    }

    public void move(int velocity, int direction) {
        currentDirection = direction;
        currentVelocity = velocity;
        System.out.println("Vehicle.moving() called. Moving at: " + currentVelocity + " in direction " + currentDirection);

    }

    public void stop() {
        this.currentVelocity = 0;
    }

    public int getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}


