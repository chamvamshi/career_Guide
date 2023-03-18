package com.example.careerguide;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class affilateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_affilate);

        setupHyperLink100();
    }

    private void setupHyperLink100() {
        TextView linkText = findViewById(R.id.affliate);
        linkText.setMovementMethod(LinkMovementMethod.getInstance());
        linkText.setLinkTextColor(Color.WHITE);
    }
}