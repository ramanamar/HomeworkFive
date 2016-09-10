package com.company;

/**
 * Created by Raman Kryvasheyeu on 10.09.16.
 */
public class Trail extends Obstacle {
    private float distance;

    public Trail(float distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Animal a) {
        a.run(distance);
    }
}
