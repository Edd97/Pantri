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


    }
    public void sendMessage (View view){
        Intent firstScreen = new Intent(this, ThirdScreen.class);
        startActivity(firstScreen);
    }
    public void Calculate (View view) {

        String View = "Calories:";
        String View2 = " ";
        String View1 = " ";
        EditText Weight = (EditText)findViewById(R.id.Weight);
        EditText Height = (EditText)findViewById(R.id.Height);
        EditText Age = (EditText)findViewById(R.id.Age);
        TextView CalorieInfo = (TextView)findViewById(R.id.Result);
        TextView Carbs = (TextView)findViewById(R.id.Result2);
        TextView Fats = (TextView)findViewById(R.id.Result3);
        TextView Viewer = (TextView)findViewById(R.id.Identiefier1);
        TextView Viewer2 = (TextView)findViewById(R.id.Identeifier2);
        TextView Viewer3 = (TextView)findViewById(R.id.Identifier3);
        int WeightToInt =  Integer.parseInt(Weight.getText().toString());
        int HeighttoInt = Integer.parseInt(Height.getText().toString());
        int AgeInt = Integer.parseInt(Age.getText().toString());
        double CalInfo =  66 + (6.23 *WeightToInt) + (12.7 * HeighttoInt) - (6.8 * AgeInt);
        CalorieInfo.setText(Double.toString(CalInfo));
        Carbs.setText(View1);
        Fats.setText(View1);
        Viewer.setText(View);
        Viewer2.setText(View2);
        Viewer3.setText(View1);
        Carbs.setVisibility(Carbs.INVISIBLE);
        Fats.setVisibility(Fats.INVISIBLE);
    }

    public void Calculate2 (View view){
        String View = "Protein:";
        String View1 = "Carbs:";
        String View2 = "Fats:";
        EditText Weight = (EditText)findViewById(R.id.Weight);
        int WeighttoINt = Integer.parseInt(Weight.getText().toString());
        TextView Protien = (TextView)findViewById(R.id.Result);
        TextView Carbs = (TextView)findViewById(R.id.Result2);
        TextView Fats = (TextView)findViewById(R.id.Result3);
        TextView Viewer1 = (TextView)findViewById(R.id.Identiefier1);
        TextView Viewer2 = (TextView)findViewById(R.id.Identeifier2);
        TextView Viewer3 = (TextView)findViewById(R.id.Identifier3);
        double Protienintake =  (WeighttoINt * 4) * .36;
        double Fatintake = (WeighttoINt * 9) * .30;
        double CarbIntake = (WeighttoINt * 4) *.45;
        Protien.setText(Double.toString(Protienintake));
        Carbs.setText((Double.toString(CarbIntake)));
        Fats.setText(Double.toString(Fatintake));
        Viewer1.setText(View);
        Viewer2.setText(View2);
        Viewer3.setText(View1);
        Carbs.setVisibility(Carbs.VISIBLE);
        Fats.setVisibility(Fats.VISIBLE);


    }
}
