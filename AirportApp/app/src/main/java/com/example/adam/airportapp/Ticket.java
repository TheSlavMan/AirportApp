package com.example.adam.airportapp;

import java.util.Random;

/**
 * Created by aronm on 12/5/2017.
 */

public class Ticket {

    int number;
    Passenger passenger;
    Flight flight;
    Seat seat;

    public Ticket(Passenger pas, Flight fli, Seat se) {
        passenger = pas;
        flight = fli;
        seat = se;
        number = 2123783900;
    }

}
