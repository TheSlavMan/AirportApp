package com.example.adam.airportapp;

/**
 * Created by aronm on 12/5/2017.
 */

public class Luggage {

    Passenger passenger;
    String status;
    LuggageHandler luggageHandler;
    int checkouttime;

    public Luggage(Passenger pass, LuggageHandler luhan) {
        passenger = pass;
        luggageHandler = luhan;
        status = "checked in";
    }
}
