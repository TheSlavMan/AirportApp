package com.example.adam.airportapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EmergencyReport extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_report);
    }

    public void cancelClicked(View view) {
        finish();
    }

    public void sendClicked(View view) {
        finish();
    }
}
