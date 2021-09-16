package com.company;

import com.company.interfaces.DriveBehavior;

public class DriveTwoWheels implements DriveBehavior {
    public void drive() {
        System.out.println("Driving with two wheels!");
    }
}
