package com.company;

/**
 * Created by Raman Kryvasheyeu on 10.09.16.
 */
public class Wall extends Obstacle {
    private float height;

    public Wall(float height) {
        this.height = height;
    }

    @Override
    public void doIt(Animal a) {
        a.jump(height);
    }
}

