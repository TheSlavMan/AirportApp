package com.example.adam.airportapp;

/**
 * Created by aronm on 12/5/2017.
 */

public class Plane {

    String[] maintenancelog;
    Maintenance maintenance;
    String name;

    public Plane(Maintenance main, String na) {
        name = na;
        maintenance = main;
    }
}
