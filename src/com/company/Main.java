package com.company;

public class Main {

    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.drive();
        motorcycle.sound();

        motorcycle.upgradeEngine();

        motorcycle.drive();
        motorcycle.sound();

        /*Car car = new Car();
        car.drive();
        car.sound();*/
    }
}
