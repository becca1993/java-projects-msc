package com.example.hackathon.csc7054project;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //start of the app lifecycle
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //public buttons and text views
        final Button left1 = (Button) findViewById(R.id.button_left);
        final Button right1 = (Button) findViewById(R.id.button_right);
        final Button display_user_text = (Button) findViewById(R.id.button_display);
        final TextView tv = (TextView) findViewById(R.id.textingview);
        final Button speak = (Button) findViewById(R.id.button_speak);


        //if the user clicks on the Display Input Button do this
        display_user_text.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {


                //Setting up the Toast element.
                // This will print the text at the bottom of the screen, and then disappear after a while.
                //Usually used for user alerts.
                user_input = (EditText) findViewById(R.id.Users_Display);
                Toast toast = new Toast(getApplicationContext());
                toast.setGravity(Gravity.TOP | Gravity.CENTER, 0, 0);
                toast.makeText(MainActivity.this, user_input.getText(), toast.LENGTH_LONG).show();

                //this will set the text in the TextView to 'Hello world!"
                // this is seperate from the Toast

                tv.setText("Hello world");


            }


        });

        left1.setOnClickListener(new View.OnClickListener() {
            // If the user clicks on the "Left" button, do this.
            @Override
            public void onClick(View view) {
                //placing text into the TextView
                tv.setText("Hello world. This should move to the left.");
                //moving above text to the left.
                tv.setGravity(Gravity.BOTTOM | Gravity.LEFT);
            }
        });

        right1.setOnClickListener(new View.OnClickListener() {
            //If the user clicks on the "Right" button, do this.

            @Override
            public void onClick(View view) {
                //placing text into the TextView
                tv.setText("Hello world. This should move to the right.");
                //moving above text to the right.
                tv.setGravity(Gravity.BOTTOM | Gravity.RIGHT);
            }
        });


    }



    // set up for Toast, the EditText needs to be private.
    /*
    Apart from the rest of the elements since Android Studio only allows
    private elements in this section.
     */

    private EditText user_input;
}






