package com.example.careerguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class techdomainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_techdomain);
    }

    public void web(View view) {
        Intent intent = new Intent(techdomainActivity.this,webActivity.class);
        startActivity(intent);
    }

    public void android(View view) {
        Intent intent = new Intent(techdomainActivity.this,androidActivity.class);
        startActivity(intent);
    }

    public void Ai(View view) {
        Intent intent = new Intent(techdomainActivity.this,AiActivity.class);
        startActivity(intent);
    }
}