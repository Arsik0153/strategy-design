package com.company;

public class Motorcycle extends Vehicle{
    public Motorcycle(){
        this.driveBehavior = new DriveTwoWheels();
        this.soundBehavior = new SmallEngineSound();
        this.soundType = SoundType.Quiet;
    }

    public void upgradeEngine() {
        if (this.soundType == SoundType.Quiet) {
            this.setSoundBehavior(new BigEngineSound());
            this.soundType = SoundType.Loud;

            System.out.println("**UPGRADE**");
        }
    }
}
