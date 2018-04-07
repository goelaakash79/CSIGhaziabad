package com.example.thenoobydev.csighaziabad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class GalleryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        String img1 = "http://www.csi-ghaziabad.org/images/csi06.jpg";
        String img2 = "http://www.csi-ghaziabad.org/images/csi19.jpg";
        String img3 = "http://www.csi-ghaziabad.org/images/csi24.jpg";
        String img4 = "http://www.csi-ghaziabad.org/images/csi20.jpg";
        String img5 = "http://www.csi-ghaziabad.org/images/csi03.jpg";
        String img6 = "http://www.csi-ghaziabad.org/images/csi04.jpg";
        String img7 = "http://www.csi-ghaziabad.org/images/csi02.jpg";
        String img8 = "http://www.csi-ghaziabad.org/images/csi13.jpeg";
        String img9 = "http://www.csi-ghaziabad.org/images/csi15.jpeg";
        String img10 = "http://www.csi-ghaziabad.org/images/csi18.jpg";

        ImageView one = (ImageView) findViewById(R.id.one);
        ImageView two = (ImageView) findViewById(R.id.two);
        ImageView three = (ImageView) findViewById(R.id.three);
        ImageView four = (ImageView) findViewById(R.id.four);
        ImageView five = (ImageView) findViewById(R.id.five);
        ImageView six = (ImageView) findViewById(R.id.six);
        ImageView seven = (ImageView) findViewById(R.id.seven);
        ImageView eight = (ImageView) findViewById(R.id.eight);
        ImageView nine = (ImageView) findViewById(R.id.nine);
        ImageView ten = (ImageView) findViewById(R.id.ten);

        Picasso.get()
                .load(img1)
                .placeholder(R.drawable.picture)
                .error(R.drawable.warning)
                .into(one);

        Picasso.get()
                .load(img2)
                .placeholder(R.drawable.picture)
                .error(R.drawable.warning)
                .into(two);

        Picasso.get()
                .load(img3)
                .placeholder(R.drawable.picture)
                .error(R.drawable.warning)
                .into(three);

        Picasso.get()
                .load(img4)
                .placeholder(R.drawable.picture)
                .error(R.drawable.warning)
                .into(four);

        Picasso.get()
                .load(img5)
                .placeholder(R.drawable.picture)
                .error(R.drawable.warning)
                .into(five);

        Picasso.get()
                .load(img6)
                .placeholder(R.drawable.picture)
                .error(R.drawable.warning)
                .into(six);

        Picasso.get()
                .load(img7)
                .placeholder(R.drawable.picture)
                .error(R.drawable.warning)
                .into(seven);

        Picasso.get()
                .load(img8)
                .placeholder(R.drawable.picture)
                .error(R.drawable.warning)
                .into(eight);

        Picasso.get()
                .load(img9)
                .placeholder(R.drawable.picture)
                .error(R.drawable.warning)
                .into(nine);

        Picasso.get()
                .load(img10)
                .placeholder(R.drawable.picture)
                .error(R.drawable.warning)
                .into(ten);


    }
}
