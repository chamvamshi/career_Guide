package com.example.careerguide;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class hackathonsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hackathons);
        setupHyperlink();
        setupHyperlink1();
    }

    private void setupHyperlink() {
        TextView linkText = findViewById(R.id.linktextview);
        linkText.setMovementMethod(LinkMovementMethod.getInstance());
        linkText.setLinkTextColor(Color.YELLOW);

    }
    private void setupHyperlink1() {
        TextView linkText1 = findViewById(R.id.linktextview2);
        linkText1.setMovementMethod(LinkMovementMethod.getInstance());
        linkText1.setLinkTextColor(Color.YELLOW);
    }


}