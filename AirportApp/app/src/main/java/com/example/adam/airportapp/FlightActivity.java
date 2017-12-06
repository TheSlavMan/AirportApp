package com.example.adam.airportapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FlightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flight);
        Button btn = (Button) findViewById(R.id.button12);
        int i = getIntent().getIntExtra("ACC_LVL", 0);
        if(i == 0)
        {
            btn.setAlpha(.5f);
            btn.setClickable(false);
        }
    }

    public void bookClicked(View view)
    {
        Intent book = new Intent(this, BookActivity.class);
        startActivity(book);
    }

    public void manageClicked(View view)
    {
        final CharSequence[] items = {"View Details", "Set Delay", "Passenger List", "Luggage List", "Cancel"};

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Manage Flight");
        builder.setItems(items, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int item) {
                Toast.makeText(getApplicationContext(), items[item], Toast.LENGTH_SHORT).show();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }

    public void filterClicked(View view)
    {
        final CharSequence[] items = {"Type", "Time", "Flight #", "Destination", "Status", "Cancel"};

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Filter By");
        builder.setItems(items, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int item) {
                Toast.makeText(getApplicationContext(), items[item], Toast.LENGTH_SHORT).show();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }
}
