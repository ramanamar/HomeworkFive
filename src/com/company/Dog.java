package com.company;

/**
 * Created by Raman Kryvasheyeu on 10.09.16.
 */
public class Dog extends Animal {
    public Dog(String name) {
        this.name = name;
        this.species = "Dog";
        this.maxSwimDistance = 40.0f;
        this.maxJumpHeight = 0.5f;
        this.maxRunDistance = 500.0f;
        onTrail = true;
    }
}