package com.example.careerguide;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class androidActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android);
        setupHyperlink24();
        setupHyperlink25();
        setupHyperlink26();
        setupHyperlink27();
    }

    private void setupHyperlink24() {
        TextView linkText = findViewById(R.id.android1);
        linkText.setMovementMethod(LinkMovementMethod.getInstance());
        linkText.setLinkTextColor(Color.WHITE);

    }
    private void setupHyperlink25() {
        TextView linkText = findViewById(R.id.android2);
        linkText.setMovementMethod(LinkMovementMethod.getInstance());
        linkText.setLinkTextColor(Color.WHITE);

    }
    private void setupHyperlink26() {
        TextView linkText = findViewById(R.id.android3);
        linkText.setMovementMethod(LinkMovementMethod.getInstance());
        linkText.setLinkTextColor(Color.WHITE);

    }
    private void setupHyperlink27() {
        TextView linkText = findViewById(R.id.android4);
        linkText.setMovementMethod(LinkMovementMethod.getInstance());
        linkText.setLinkTextColor(Color.WHITE);

    }

}