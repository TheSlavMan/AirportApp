package com.example.adam.airportapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Authenticate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authenticate);
    }

    public void loginClicked(View view) {
        Intent login = new Intent(this, MainmenuActivity.class);
        startActivity(login);
    }

    public void emergencyClicked(View view) {
        Intent reportIntent = new Intent(this, EmergencyReport.class);
        startActivity(reportIntent);
    }

    public void viewClicked(View view) {
        Intent viewIntent = new Intent(this, FlightActivity.class);
        viewIntent.putExtra("ACC_LVL", new Integer(0));
        startActivity(viewIntent);
    }

    protected void onActivityResult(int reqCode, int resCode, Intent data)
    {
        Integer result = data.getIntExtra("RES",0);
        if( result == 1 )
        {
            Intent login = new Intent(this, MainmenuActivity.class);
            startActivity(login);
        }
    }

}
