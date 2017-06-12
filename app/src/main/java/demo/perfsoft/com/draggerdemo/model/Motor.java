package demo.perfsoft.com.draggerdemo.model;

/**
 * Created by Tong Hung on 09-May-17.
 * Copyright (C) SFR Software.
 */

public class Motor {
    private int rpm;

    public Motor() {
        this.rpm = 7;
    }

    public void accelerate(int value){
        rpm = rpm + value;
    }

    public void brake(){
        rpm = 0;
    }

    public int getRpm(){
        return rpm;
    }
}
