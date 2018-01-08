package com.google.engedu.puzzle8;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;



public class FirstActivity extends AppCompatActivity implements View.OnClickListener {
    Button img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);
        img=(Button) findViewById(R.id.btn1);
       img.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i= new Intent(this,PuzzleActivity.class);
        startActivity(i);
    }
}
