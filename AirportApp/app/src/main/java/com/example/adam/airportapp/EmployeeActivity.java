package com.example.adam.airportapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class EmployeeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee);
    }

    public void viewClicked(View view)
    {
        Intent work = new Intent(this, WorkSchedule.class);
        startActivity(work);
    }

    public void inClicked(View view)
    {
        Toast.makeText(getApplicationContext(),"Checked In",Toast.LENGTH_SHORT).show();
    }

    public void outClicked(View view)
    {
        Toast.makeText(getApplicationContext(),"Checked Out",Toast.LENGTH_SHORT).show();
    }
}
