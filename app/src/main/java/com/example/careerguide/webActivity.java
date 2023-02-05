package com.example.careerguide;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class webActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        setupHyperlink20();
        setupHyperlink21();
        setupHyperlink22();
       setupHyperlink23();
    }
    private void setupHyperlink20() {
        TextView linkText = findViewById(R.id.web1);
        linkText.setMovementMethod(LinkMovementMethod.getInstance());
        linkText.setLinkTextColor(Color.WHITE);

    }
    private void setupHyperlink21() {
        TextView linkText = findViewById(R.id.web2);
        linkText.setMovementMethod(LinkMovementMethod.getInstance());
        linkText.setLinkTextColor(Color.WHITE);

    }
    private void setupHyperlink22() {
        TextView linkText = findViewById(R.id.web3);
        linkText.setMovementMethod(LinkMovementMethod.getInstance());
        linkText.setLinkTextColor(Color.WHITE);

    }
    private void setupHyperlink23() {
        TextView linkText = findViewById(R.id.web4);
        linkText.setMovementMethod(LinkMovementMethod.getInstance());
        linkText.setLinkTextColor(Color.WHITE);

    }
}