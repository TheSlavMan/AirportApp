package com.example.adam.airportapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainmenuActivity extends AppCompatActivity
{

    public void logoutClick(View view)
    {
        finish();
    }

    public void flightsClick(View view)
    {
        Intent flight = new Intent(this, FlightAcitivity.class);
        startActivity(flight);
    }

    public void passengersClick(View view)
    {
        Intent passenger = new Intent(this, PassengerActivity.class);
        startActivity(passenger);
    }

    public void luggageClick(View view)
    {
        Intent luggage = new Intent(this, LuggageActivity.class);
        startActivity(luggage);
    }

    public void employeesClick(View view)
    {
        Intent employee = new Intent(this, EmployeeActivity.class);
        startActivity(employee);
    }

    public void securityClick(View view)
    {
        Intent security = new Intent(this, SecurityActivity.class);
        startActivity(security);
    }

    public void operationsClick(View view)
    {
        Intent operations = new Intent(this, OperationsActivity.class);
        startActivity(operations);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainmenu);
    }
}
