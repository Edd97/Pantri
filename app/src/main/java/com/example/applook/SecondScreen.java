package com.example.applook;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import javax.xml.transform.Result;

public class SecondScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    public void sendMessage (View view){
        Intent firstScreen = new Intent(this, MainActivity.class);
        startActivity(firstScreen);
    }
    public void Calculate (View view) {

        EditText Weight = (EditText)findViewById(R.id.Weight);
        EditText Height = (EditText)findViewById(R.id.Height);
        EditText Age = (EditText)findViewById(R.id.Age);
        TextView CalorieInfo = (TextView)findViewById(R.id.Result);
        int WeightToInt =  Integer.parseInt(Weight.getText().toString());
        int HeighttoInt = Integer.parseInt(Height.getText().toString());
        int AgeInt = Integer.parseInt(Age.getText().toString());
        double CalInfo =  66 + (6.23 *WeightToInt) + (12.7 * HeighttoInt) - (6.8 * AgeInt);
        CalorieInfo.setText(Double.toString(CalInfo));
    }

    public void Calculate2 (View view){
        EditText Weight = (EditText)findViewById(R.id.Weight);
        int WeighttoINt = Integer.parseInt(Weight.getText().toString());
        TextView Protien = (TextView)findViewById(R.id.Result);
        TextView Carbs = (TextView)findViewById(R.id.Result2);
        TextView Fats = (TextView)findViewById(R.id.Result3);
        double Protienintake =  (WeighttoINt * 4) * .36;
        double Fatintake = (WeighttoINt * 9) * .30;
        double CarbIntake = (WeighttoINt * 4) *.45;
        Protien.setText(Double.toString(Protienintake));
        Carbs.setText((Double.toString(CarbIntake)));
        Fats.setText(Double.toString(Fatintake));
    }
}
