package com.example.careerguide;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class internActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intern3);
        setupHyperlink8();
        setupHyperlink9();
        setupHyperlink10();

    }
    private void setupHyperlink8() {
        TextView linkText = findViewById(R.id.internship1);
        linkText.setMovementMethod(LinkMovementMethod.getInstance());
        linkText.setLinkTextColor(Color.WHITE);

    }
    private void setupHyperlink9() {
        TextView linkText = findViewById(R.id.internship2);
        linkText.setMovementMethod(LinkMovementMethod.getInstance());
        linkText.setLinkTextColor(Color.WHITE);

    }
    private void setupHyperlink10() {
        TextView linkText = findViewById(R.id.internship3);
        linkText.setMovementMethod(LinkMovementMethod.getInstance());
        linkText.setLinkTextColor(Color.WHITE);

    }


}