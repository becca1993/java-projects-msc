package com.example.hackathon.loginappassignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LoginTooManyFailure extends AppCompatActivity {
    /**
     * This activity is used if the user fails their attempt at login 3 times.
     * User will not be allowed to login again in one session.
     * @param savedInstanceState
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) { //start of activity lifecycle
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_too_many_failure);


    }
}
