package com.example.adam.airportapp;

/**
 * Created by aronm on 12/5/2017.
 */

public class Passenger extends Person {

    Ticket ticket;
    String transitstatus, riskstatus;
    int[] times = new int[7];

    public Passenger(Ticket t, String tr, String r) {
        ticket = t;
        transitstatus = "checked in";
        riskstatus = r;
    }


}
