package com.example.adam.airportapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PassengerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passenger);
    }

    public void manageClicked(View view)
    {
        final CharSequence[] items = {"View Details", "Set Risk", "Edit Ticket", "Edit Luggage", "Edit Details", "Cancel"};

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Manage Passenger");
        builder.setItems(items, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int item) {
                Toast.makeText(getApplicationContext(), items[item], Toast.LENGTH_SHORT).show();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }

    public void viewClicked(View view)
    {
        Toast.makeText(getApplicationContext(), "Loading...", Toast.LENGTH_SHORT).show();
    }
}
