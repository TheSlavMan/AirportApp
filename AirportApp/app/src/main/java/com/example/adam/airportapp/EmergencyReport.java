package com.example.adam.airportapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

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
        Toast.makeText(getApplicationContext(), "Report Sent", Toast.LENGTH_SHORT).show();
        finish();
    }
}
