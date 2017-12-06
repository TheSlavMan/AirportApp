package com.example.adam.airportapp;

/**
 * Created by aronm on 12/5/2017.
 */

public class Camera {
    int number;
    boolean active;

    public Camera(int num) {
        number = num;
        active = true;
    }

    public boolean ShutDown() {
        active = false;
        return !active;
    }
}
