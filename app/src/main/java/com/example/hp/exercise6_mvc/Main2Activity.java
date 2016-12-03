package com.example.hp.exercise6_mvc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent Myintent = getIntent();
        TextView TVwelcome = (TextView) findViewById(R.id.TVwelcome);
        TVwelcome.setText(Myintent.getStringExtra("text"));

    }
}
