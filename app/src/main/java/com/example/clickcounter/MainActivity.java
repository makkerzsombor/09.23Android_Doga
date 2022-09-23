package com.example.clickcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView szam;
    private Button plusz;
    private Button minusz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }
    private void init(){
        szam = findViewById(R.id.szam);
        plusz = findViewById(R.id.plusz);
        minusz = findViewById(R.id.minusz);
    }
}