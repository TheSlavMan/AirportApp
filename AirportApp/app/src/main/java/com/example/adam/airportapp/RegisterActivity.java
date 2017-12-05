package com.example.adam.airportapp;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void register(View view)
    {
        Intent returnInt = new Intent();
        returnInt.putExtra("RES",1);
        setResult(RESULT_OK, returnInt);
        finish();
    }

    public void cancel(View view)
    {
        finish();
    }
}
