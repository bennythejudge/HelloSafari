package com.czlg.hellosafari;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "DEBUG" ;
    private TextView textView;
    private EditText editText;
    private TextView time_message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.hello_message);
        editText = findViewById(R.id.edit_text);
        time_message = findViewById(R.id.time_stamp);


        Button helloButton = findViewById(R.id.hello_button);
        helloButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayHello(view);
            }
        });
    }

    public void sayHello(View view) {
        String name = editText.getText().toString();
        textView.setText(String.format("Hello, %s!", name));
        Toast.makeText(this, "Whassup, dude?!?", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, WelcomeActivity.class);
        intent.putExtra("user", name);
        startActivity(intent);
    }

    public void printTime(View view) {
        long now = new Date().getTime();
        time_message.setText(String.format("%d", now));
    }
}
