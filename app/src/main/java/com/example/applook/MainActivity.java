package com.example.applook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void sendMessage (View view){
        Intent secondScreen = new Intent(this, SecondScreen.class);
        startActivity(secondScreen);
    }

    public void thirdScreen (View view){
        EditText username = (EditText)findViewById(R.id.Username);
        EditText password = (EditText)findViewById(R.id.Password);
        if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin"))
        {
            Intent ThirdScreen = new Intent(this, ThirdScreen.class);
            startActivity(ThirdScreen);
        }
        else {
        }
    }
}



