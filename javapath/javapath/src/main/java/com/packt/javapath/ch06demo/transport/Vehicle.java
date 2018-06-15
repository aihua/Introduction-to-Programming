package com.packt.javapath.ch06demo.transport;

public class Vehicle {
    private int weightPounds, horsePower;
    public Vehicle(int weightPounds, int horsePower) {
        this.weightPounds = weightPounds;
        this.horsePower = horsePower;
    }
    protected int getWeightPounds(){ return this.weightPounds; }
    protected double getSpeedMph(double timeSec, int weightPounds){
        double v = 2.0 * this.horsePower * 746 * timeSec * 32.174 / weightPounds;
        return Math.round(Math.sqrt(v) * 0.68);
    }
}
