package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void onClick4(View view) {
        startActivity(new Intent(this, Main3.class));
    }

    public void onClick5(View view) {
        startActivity(new Intent(this, Main2.class));
    }
}