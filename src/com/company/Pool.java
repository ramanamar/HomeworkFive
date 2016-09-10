package com.company;

/**
 * Created by Raman Kryvasheyeu on 10.09.16.
 */
public class Pool extends Obstacle {
    private float distance;

    public Pool(float distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Animal a) {
        a.swim(distance);
    }
}