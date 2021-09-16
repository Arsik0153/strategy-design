package com.company;

public class Car extends Vehicle{
    public Car(){
        this.driveBehavior = new DriveFourWheels();
        this.soundBehavior = new BigEngineSound();
    }

    public void downgradeEngine() {
        if (this.soundType == SoundType.Loud) {
            this.setSoundBehavior(new SmallEngineSound());
            this.soundType = SoundType.Quiet;

            System.out.println("**DOWNGRADE**");
        }
    }
}

