package com.company;

/**
 * Created by Raman Kryvasheyeu on 10.09.16.
 */
public class Horse extends Animal{

    public Horse(String name) {
        this.name = name;
        this.species = "Horse";
        this.maxSwimDistance = 20.0f;
        this.maxJumpHeight = 1.5f;
        this.maxRunDistance = 10000.0f;
        onTrail = true;
    }
}