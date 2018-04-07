package com.example.thenoobydev.csighaziabad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

    public class JoinCSIActivity extends AppCompatActivity {

        private Button btnDownload;
        String URL = "http://csi-india.org/communications/Fee/FORM%20I%20-%20Application%20for%20Institutional%20%20Acad%20and%20Non%20Acad%20Membership%20%20Version%202.4%20w.e.f.%20%2001.07.2017.pdf";

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_join_csi);

            btnDownload = (Button) findViewById(R.id.btnDownload);

            btnDownload.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    new DownloadTask(JoinCSIActivity.this, URL);
                }
            });
        }
    }