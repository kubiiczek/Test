package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void onClick2(View view) {
        startActivity(new Intent(this, Main4.class));
    }

    public void onClick3(View view) {
        startActivity(new Intent(this, Main3.class));
    }
}