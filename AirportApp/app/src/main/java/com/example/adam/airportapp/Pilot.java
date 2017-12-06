package com.example.adam.airportapp;

/**
 * Created by aronm on 12/5/2017.
 */

public class Pilot extends Employee {
    Flight flight;

    public Pilot(Flight f) {
        flight = f;
        location = "airplane";
    }
}
