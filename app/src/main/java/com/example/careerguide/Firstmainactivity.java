package com.example.careerguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Firstmainactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstmainactivity);

    }

    public void technical(View view) {
        Intent intent = new Intent(Firstmainactivity.this,MainActivity.class);
        startActivity(intent);
    }

    public void Nontechnical(View view) {
        Intent intent = new Intent(Firstmainactivity.this,Nontechnical.class);
        startActivity(intent);

    }
}