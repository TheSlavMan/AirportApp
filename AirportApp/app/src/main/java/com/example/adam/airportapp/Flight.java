package com.example.adam.airportapp;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by aronm on 12/5/2017.
 */

public class Flight {

    Plane plane;
    Pilot pilot;
    ArrayList passengers = new ArrayList(200);
    int range, departuretime, arrivaltime;
    String status;

    public Flight(Plane p, Pilot pi, ArrayList pass, int ra, int depart, int arrive) {
        plane = p;
        pilot = pi;
        passengers = pass;
        range = ra;
        departuretime = depart;
        arrivaltime = arrive;
        status = "active";
    }

}
