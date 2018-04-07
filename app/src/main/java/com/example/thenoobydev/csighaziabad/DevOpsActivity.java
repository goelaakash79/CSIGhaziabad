package com.example.thenoobydev.csighaziabad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class DevOpsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dev_ops);

        ImageView ig=(ImageView) findViewById(R.id.ravisir);
        Picasso.get()
                .load("http://www.csi-ghaziabad.org/images/ravi.png")
                .placeholder(R.drawable.picture)
                .error(R.drawable.warning)
                .into(ig);
    }
}
