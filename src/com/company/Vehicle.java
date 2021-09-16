package com.company;

import com.company.interfaces.DriveBehavior;
import com.company.interfaces.SoundBehavior;

public class Vehicle {
    DriveBehavior driveBehavior;
    SoundBehavior soundBehavior;
    SoundType soundType;

    public void drive(){
        this.driveBehavior.drive();
    }

    public void sound(){
        this.soundBehavior.makeSound();
    }

    public void setDriveBehavior(DriveBehavior driveBehavior) {
        this.driveBehavior = driveBehavior;
    }

    public void setSoundBehavior(SoundBehavior soundBehavior) {
        this.soundBehavior = soundBehavior;
    }

    public Vehicle(){
        this.soundBehavior = new BigEngineSound();
        this.driveBehavior = new DriveFourWheels();
        this.soundType = SoundType.Loud;
    }

    public Vehicle(
            DriveBehavior driveBehavior,
            SoundBehavior soundBehavior,
            SoundType soundType
    ){
        this.soundBehavior = soundBehavior;
        this.driveBehavior = driveBehavior;
        this.soundType = soundType;
    }
}
