package com.wipro.java.adapters.round;

public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg rpeg) {
        boolean result;
        result = (this.getRadius() >= rpeg.getRadius());
        return result;
    }
}
