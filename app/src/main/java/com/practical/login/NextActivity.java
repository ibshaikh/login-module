package com.practical.login;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NextActivity extends AppCompatActivity {

    private TextView usernameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        // Initialize views
        usernameTextView = findViewById(R.id.usernameTextView);

        // Get the passed username from the intent
        String username = getIntent().getStringExtra("username");

        // Set the username in the TextView
        usernameTextView.setText("Welcome, " + username + "!");
    }
}
