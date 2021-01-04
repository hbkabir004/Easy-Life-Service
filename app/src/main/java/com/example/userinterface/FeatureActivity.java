package com.example.userinterface;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FeatureActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feature);

        Button button01 =  findViewById(R.id.button1);
        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stationeryItem();
            }
        });
        Button button02 = findViewById(R.id.button2);
        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               foodManagement();
            }
        });
        Button button03 = findViewById(R.id.button3);
        button03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bloodDonor();
            }
        });
        Button button04 = findViewById(R.id.button4);
        button04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                healthCare();
            }
        });
        Button button05 = findViewById(R.id.button5);
        button05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bookHub();
            }
        });}
    public void stationeryItem(){
        Intent intent1= new Intent(this, Stationery.class);
        startActivity(intent1);
    }

    public void foodManagement(){
        Intent intent2= new Intent(this, Food.class);
        startActivity(intent2);
    }

    public void bloodDonor(){
        Intent intent3= new Intent(this, Blood.class);
        startActivity(intent3);
    }

    public void healthCare(){
        Intent intent4= new Intent(this, Health.class);
        startActivity(intent4);
    }
    public void bookHub(){
        Intent intent5= new Intent(this, Book.class);
        startActivity(intent5);
    }

}