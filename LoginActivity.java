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
 * This Activity is to allow the user to login to the app.
 *
 */

public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) { //start of Activity lifecycle
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final Button loginbutton = (Button)findViewById(R.id.loginbutton); //creating new button named loginbutton
        final EditText usernameentry = (EditText)findViewById(R.id.editingusername); //creating new EditText named usernameentry
        final EditText passwordentry = (EditText)findViewById(R.id.editingpassword); //creating new EditText named passwordentry





        /**
         * If user clicks this button they will login to the system
         * and will be redirected to the QUB website.
         */
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String username = usernameentry.getText().toString(); //placing value entered into the usernameentry EditText into username
                final String password = passwordentry.getText().toString(); //placing value entered into the passwordentry EditText into password
                final String testusername = "admin"; //test data String for usrname
                final String testpassword = "password"; //test data String for password
                int attempts=3; //setting up int for recording the number of attempts the user has to login

                        try { //start of try catch block

                            if (username.equals(testusername) && password.equals(testpassword)){ //if statement checking if username and password entered match test data.
                                Toast.makeText(LoginActivity.this,"Login sucessful!", Toast.LENGTH_SHORT).show(); //new Toast telling the user that their login was successful.
                                Intent qubWeb = new Intent(LoginActivity.this,QUBRedirect.class); //Creating new Intent to redirect the user to the QUB website
                                LoginActivity.this.startActivity(qubWeb); //Start new intent.



                            }else{ //if username and password do not match test data
                                AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this); //create new error message
                                builder.setMessage("Failure to login. Please try again.").setNegativeButton("Retry", null).create().show(); //show error message to user
                                attempts--; //decrement attempts by 1 each time the user fails.
                                if(attempts==0){ //if user reaches 0 attempts left
                                    Intent toomanyFail = new Intent(LoginActivity.this,LoginTooManyFailure.class); //starting new Intent that will take the user to a warning page
                                    LoginActivity.this.startActivity(toomanyFail); //starts new intent
                                    loginbutton.setEnabled(false); //disables loginbutton

                                }else{ //if user has used up one of their attempts but hasn't used three attempts
                                    Toast.makeText(LoginActivity.this, "Attempts remaining : " + attempts, Toast.LENGTH_SHORT).show(); //Toast showing user how many attempts they have left
                                }
                            }

                        } catch (Exception e) { //catch any exceptions
                            e.printStackTrace(); // print trace for exception
                        }

                    }
        });
    }
}


