package com.example.mainactivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View; // Import the standard Android View class

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get references to the button and the TextView
        Button button = findViewById(R.id.button);
        TextView textView = findViewById(R.id.textView);

        // Set an OnClickListener for the button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check the current visibility of the TextView
                if (textView.getVisibility() == View.VISIBLE) {
                    // If visible, hide it
                    textView.setVisibility(View.INVISIBLE); // Or View.GONE
                } else {
                    // If hidden (invisible or gone), make it visible
                    textView.setVisibility(View.VISIBLE);
                }
            }
        });

        // Optionally, hide the TextView initially
        textView.setVisibility(View.INVISIBLE); // Or View.GONE
    }
}