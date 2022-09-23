package com.example.clickcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView szam;
    private Button plusz;
    private Button minusz;

    static int szamlalo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        szam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szamlalo = 0;
                szam.setText("0");
                szam.setTextColor(Color.rgb(0,0,255));
            }
        });
        plusz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szamlalo ++;
                String pluszEgy = String.format("%s",szamlalo);
                szam.setText(pluszEgy);
                if (szamlalo == 0){
                    szam.setTextColor(Color.BLUE);
                }else if (szamlalo > 0){
                    szam.setTextColor(Color.GREEN);
                }
            }
        });
        minusz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szamlalo --;
                String minuszEgy = String.format("%s",szamlalo);
                szam.setText(minuszEgy);
                if (szamlalo==0){
                    szam.setTextColor(Color.BLUE);
                }else if (szamlalo < 0){
                    szam.setTextColor(Color.RED);
                }

            }
        });
    }
    private void init(){
        szam = findViewById(R.id.szam);
        plusz = findViewById(R.id.plusz);
        minusz = findViewById(R.id.minusz);
    }
}