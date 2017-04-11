package com.example.hackathon.loginappassignment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /**
     * This is the MainActivity of the app.
     * This serves as a front page where the user can pick from several options, Register or Login.
     * @param savedInstanceState
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) { //start of Activity lifecycle
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setting up elements
        Button loginbutton = (Button) findViewById(R.id.loginbutton); //Creating a button named loginbutton
        Button registerButton = (Button) findViewById(R.id.registerbutton); //Creation a button named registerbutton
        TextView userexplains = (TextView) findViewById(R.id.userexplains); // Creating a TextView named userexplains


        //if user clicks on loginbutton do this
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logintent = new Intent(MainActivity.this, LoginActivity.class); //creating a new Intent that will redirect the user to the LoginAcitivty
                MainActivity.this.startActivity(logintent); //starting new Activity


            }
        });
        //if user clicks on registerbutton do this
        registerButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                Intent regintent = new Intent(MainActivity.this, RegisterActivity.class); //creating a new Intent that will redirect the user to the RegisterAcivity
                MainActivity.this.startActivity(regintent); //starting new Activity

            }
        });

    }
}

