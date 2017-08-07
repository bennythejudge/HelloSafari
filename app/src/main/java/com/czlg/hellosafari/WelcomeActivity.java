package com.czlg.hellosafari;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    private static final String TAG = "Welcome";

    private TextView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        view = findViewById(R.id.welcome_text);

        Log.i(TAG, "Welcome.onCreate");

        String user = getIntent().getStringExtra("user");
        view.setText(String.format("Hi there, %s!", user));
    }
}

