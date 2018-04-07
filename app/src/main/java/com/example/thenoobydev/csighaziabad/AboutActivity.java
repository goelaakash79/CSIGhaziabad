package com.example.thenoobydev.csighaziabad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toolbar;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        CardView abtCSI = (CardView) findViewById(R.id.abtCSI);
        abtCSI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), AboutCSIActivity.class));
            }
        });

        CardView gzbCh = (CardView) findViewById(R.id.gzbCh);
        gzbCh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), AboutGZBChapterActivity.class));
            }
        });

    }
}
