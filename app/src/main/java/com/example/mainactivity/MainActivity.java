package com.example.mainactivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editTextEmailAddress;
    EditText editTextPassword;
    Button buttonLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextEmailAddress = findViewById(R.id.editTextTextEmailAddress);
        editTextPassword = findViewById(R.id.editTextTextPassword);
        buttonLogin = findViewById(R.id.button);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editTextEmailAddress.getText().toString().trim();
                String password = editTextPassword.getText().toString().trim();

                if (username.equals("admin") && password.equals("123456")) {
                    Toast.makeText(MainActivity.this, "Login successfully", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Login failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}