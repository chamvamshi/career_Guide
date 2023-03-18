package com.example.careerguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Nontechnical extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nontechnical);

        TextView affliatetext,videotext;
        affliatetext = findViewById(R.id.affbtn);

        affliatetext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent  AffliateIntent = new Intent(Nontechnical.this,affilateActivity.class);
               startActivity(AffliateIntent);
            }
        });

        videotext = findViewById(R.id.videobtn);

        videotext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent    VideoIntent = new Intent(Nontechnical.this,VideoActivity.class);
                startActivity(VideoIntent);
            }
        });

    }
}