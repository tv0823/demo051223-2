package com.example.demo051223_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    int clicked = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void numberClicks(View view) {
        Button btn;
        btn = findViewById(R.id.btn);
        clicked ++;
        btn.setText("This is a click number: " + clicked);
    }
}