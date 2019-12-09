package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void onClick6(View view) {
        startActivity(new Intent(this, Main4.class));
    }

    public void onClick7(View view) {
        startActivity(new Intent(this, Main2.class));
    }
}