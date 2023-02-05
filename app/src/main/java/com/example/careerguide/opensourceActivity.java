package com.example.careerguide;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class opensourceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opensource);
        setupHyperlink3();
        setupHyperlink4();
        setupHyperlink5();
    }
    private void setupHyperlink3() {
        TextView linkText2 = findViewById(R.id.opensourcelink);
        linkText2.setMovementMethod(LinkMovementMethod.getInstance());
        linkText2.setLinkTextColor(Color.GREEN);
    }
    private void setupHyperlink4() {
        TextView linkText3 = findViewById(R.id.opensourcelink2);
        linkText3.setMovementMethod(LinkMovementMethod.getInstance());
        linkText3.setLinkTextColor(Color.GREEN);
    }
    private void setupHyperlink5() {
        TextView linkText4 = findViewById(R.id.opensourcelink3);
        linkText4.setMovementMethod(LinkMovementMethod.getInstance());
        linkText4.setLinkTextColor(Color.GREEN);
    }
}