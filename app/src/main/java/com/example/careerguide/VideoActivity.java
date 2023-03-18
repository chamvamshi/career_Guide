package com.example.careerguide;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class VideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        setupHyperLink101();
    }

    private void setupHyperLink101() {
        TextView linkText = findViewById(R.id.videoedit);
        linkText.setMovementMethod(LinkMovementMethod.getInstance());
        linkText.setLinkTextColor(Color.WHITE);
    }
}