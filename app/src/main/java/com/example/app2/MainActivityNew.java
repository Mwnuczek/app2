package com.example.app2;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by student on 2017-03-14.
 */
public class MainActivityNew extends Activity {

        @Override
        protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main_activity_app);
            final Button button = (Button) findViewById(R.id.button_id);
            button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Perform action on click
                }
        }

}
