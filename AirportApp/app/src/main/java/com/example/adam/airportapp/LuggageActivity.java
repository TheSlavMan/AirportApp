package com.example.adam.airportapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class LuggageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luggage);
    }

    public void registerClicked(View view)
    {
        Toast.makeText(getApplicationContext(), "Luggage Registered", Toast.LENGTH_SHORT).show();
    }

    public void listClicked(View view)
    {
        Intent list = new Intent(this, LuggageList.class);
        startActivity(list);
    }
}
