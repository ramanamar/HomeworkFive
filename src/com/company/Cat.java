package com.company;

/**
 * Created by Raman Kryvasheyeu on 10.09.16.
 */

public class Cat extends Animal {
    public Cat(String name) {
        this.name = name;
        this.species = "Cat";
        this.maxSwimDistance = 0.0f;
        this.maxJumpHeight = 2.0f;
        this.maxRunDistance = 200.0f;
        onTrail = true;
    }
}
