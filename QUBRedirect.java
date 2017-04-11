package com.example.hackathon.loginappassignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class QUBRedirect extends AppCompatActivity {
    /**
     *
     * This activity is used to redirect the user to the QUB website after login.
     *
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) { //start of app lifecycle
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qubredirect);

        WebView qubWebsite = (WebView)findViewById(R.id.qub); //setting up WebView
        qubWebsite.loadUrl("http://www.qub.ac.uk/"); //directing user to QUB Website
    }
}
