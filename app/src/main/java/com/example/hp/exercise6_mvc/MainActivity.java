package com.example.hp.exercise6_mvc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnenter = (Button) findViewById(R.id.btnenter);
        EditText txtusername = (EditText) findViewById(R.id.txtusername);
        EditText txtpass = (EditText) findViewById(R.id.txtpass);

        btnenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Myintent = new Intent(MainActivity.this,Main2Activity.class);
                Myintent.putExtra("text","You Are Admin");
                startActivity(Myintent);

            }
        });

    }
}
