package demo.perfsoft.com.draggerdemo.model;

import javax.inject.Inject;

/**
 * Created by Tong Hung on 09-May-17.
 * Copyright (C) SFR Software.
 */

public class Vehicle {
    private Motor motor;

    @Inject
    public Vehicle(Motor motor) {
        this.motor = motor;
    }

    public void increaseSpeed(int value){
        motor.accelerate(value);
    }

    public void stop(){
        motor.brake();
    }

    public int getSpeed(){
        return motor.getRpm();
    }
}
