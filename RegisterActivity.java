package com.example.hackathon.loginappassignment2;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * This Activity is used for registering in the user to the system.
 */

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { //start of Activity lifecycle
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        final Button registerbutton = (Button)findViewById(R.id.registerbutton); //creating new Button named registerbutton
        final Button goBackButton = (Button)findViewById(R.id.gobackbutton); //creating new Button named goBackButton
        final EditText newusername = (EditText)findViewById(R.id.newusername); //creating new EditText named newusername
        final EditText newpassword = (EditText)findViewById(R.id.editingpassword); //creating new EditText named newpassword


//if user clicks on registerbutton in order to register into the system, do this
        registerbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String username =  newusername.getText().toString(); //Getting text from the newusername EditText to set to username
                final String password = newpassword.getText().toString(); //Getting text from the newpassword EditText to set to password


                        try { //start of try catch block to catch any errors
                            String testnewusername; //String for new user username
                            String testnewpassword; //Strng for new user password
                            boolean success = true; //setting up flag

                           testnewusername = username; //setting testnewusername to the contents of username
                            testnewpassword = password; // setting testnewpassword to the contents of password


                            if (success){ //if flag is set do this
                                Toast.makeText(RegisterActivity.this, "Registration successful!", Toast.LENGTH_SHORT).show(); //new Toast - shows user that register is successful
                                Intent loguseron = new Intent (RegisterActivity.this, LoginActivity.class); //creating new Intent to redirect the user to the LoginActivity
                                RegisterActivity.this.startActivity(loguseron); //starting LoginActivity

                            }else{ //if flag not set
                                AlertDialog.Builder builder = new AlertDialog.Builder(RegisterActivity.this); //creating new error message
                                builder.setMessage("Failure while registering. Please try again.").setNegativeButton("Retry", null).create().show(); //display error message
                            }
                        } catch (Exception e) { //any exceptions will be caught here
                            e.printStackTrace(); //print Trace of exception
                        }

                    }
                });

// if user wants to go back to the main screen and clicks goBackButton do this
        goBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goBackIntent = new Intent(RegisterActivity.this, MainActivity.class); //creating new Intent to redirect the user to the main page
                RegisterActivity.this.startActivity(goBackIntent); // send user back to main page
            }
        });



    }
    }








