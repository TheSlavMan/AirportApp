package com.example.adam.airportapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
}
