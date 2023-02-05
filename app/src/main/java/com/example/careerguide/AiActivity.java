package com.example.careerguide;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class AiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ai);
        setupHyperlink28();
        setupHyperlink29();
        setupHyperlink30();
    }
    private void setupHyperlink28() {
        TextView linkText = findViewById(R.id.artificial1);
        linkText.setMovementMethod(LinkMovementMethod.getInstance());
        linkText.setLinkTextColor(Color.WHITE);

    }
    private void setupHyperlink29() {
        TextView linkText = findViewById(R.id.artificial2);
        linkText.setMovementMethod(LinkMovementMethod.getInstance());
        linkText.setLinkTextColor(Color.WHITE);

    }
    private void setupHyperlink30() {
        TextView linkText = findViewById(R.id.artificial3);
        linkText.setMovementMethod(LinkMovementMethod.getInstance());
        linkText.setLinkTextColor(Color.WHITE);

    }
}