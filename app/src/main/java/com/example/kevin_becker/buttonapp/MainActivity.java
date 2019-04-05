package com.example.kevin_becker.buttonapp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private View BGWindow;
    private Button PushButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BGWindow = findViewById(R.id.BGWindow);
        PushButton = findViewById(R.id.PushButton);
        BGWindow.setBackgroundColor(Color.BLUE);
        PushButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BGWindow.setBackgroundColor(Color.GREEN);
            }
        });
    }
}

