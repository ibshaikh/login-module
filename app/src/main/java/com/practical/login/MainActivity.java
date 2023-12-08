package com.practical.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.loginButton);

        // Set click listener for login button
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get entered username and password
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // Check if username and password match
                if (username.equals("ibram") && password.equals("1234")) {
                    // Login successful, start next activity and pass the username
                    Intent intent = new Intent(MainActivity.this, NextActivity.class);
                    Toast.makeText(MainActivity.this, "Login Succesfully", Toast.LENGTH_SHORT).show();
                    intent.putExtra("username", username);
                    startActivity(intent);
                } else {
                    // Login failed, show toast message
                    Toast.makeText(MainActivity.this, "Login failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
