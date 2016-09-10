package com.company;

/**
 * Created by Raman Kryvasheyeu on 10.09.16.
 */

public abstract class Animal {
    protected String name;
    protected String species;

    protected float maxRunDistance;
    protected float maxJumpHeight;
    protected float maxSwimDistance;

    protected boolean onTrail;

    public boolean isOnTrail() {
        return onTrail;
    }

    public void run(float dist) {
        if (dist <= maxRunDistance) {
            System.out.println(species + " " + name + " - distance passed");
        } else {
            System.out.println(species + " " + name + " - run test failed");
            onTrail = false;
        }
    }

    public void jump(float height) {
        if (height <= maxJumpHeight) {
            System.out.println(species + " " + name + " - wall passed");
        } else {
            System.out.println(species + " " + name + " - jump test failed");
            onTrail = false;
        }
    }

    public void swim(float dist) {
        if (maxSwimDistance == 0.0f) {
            System.out.println(species + " " + name + " can't swim");
            onTrail = false;
            return;
        }
        if (dist <= maxSwimDistance) {
            System.out.println(species + " " + name + " - water distance passed");
        } else {
            System.out.println(species + " " + name + " - swim test failed");
            onTrail = false;
        }
    }

    public void showResults() {
        if (onTrail)
            System.out.println(species + " " + name + " - trim trail finished");
        else
            System.out.println(species + " " + name + " - disqualified");
    }
}
