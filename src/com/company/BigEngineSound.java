package com.company;

import com.company.interfaces.SoundBehavior;

public class BigEngineSound implements SoundBehavior {
    public void makeSound() {
        System.out.println("VROOM!!!");
    }
}
