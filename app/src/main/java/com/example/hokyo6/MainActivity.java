package com.example.hokyo6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.core.content.res.ResourcesCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button hokyo,tvfdm,call,contact,app;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hokyo= findViewById(R.id.button1);
        tvfdm= findViewById(R.id.button2);
        call= findViewById(R.id.button3);
        contact= findViewById(R.id.button4);
        app= findViewById(R.id.button5);


        hokyo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.hokyo.in"));
//                startActivity(browserIntent);
                String url = "http://www.hokyo.in";
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(ResourcesCompat.getColor(getResources(), com.google.android.material.R.color.cardview_dark_background, null));
                CustomTabsIntent customTabsIntent = builder.build();

                customTabsIntent.launchUrl(MainActivity.this, Uri.parse(url));
            }
        });

        tvfdm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.hokyo.in"));
//                startActivity(browserIntent);
                String url = "http://www.tvfdm.in";

                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(ResourcesCompat.getColor(getResources(), com.google.android.material.R.color.cardview_dark_background, null));

                CustomTabsIntent customTabsIntent = builder.build();
                customTabsIntent.launchUrl(MainActivity.this, Uri.parse(url));
            }
        });

        app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.vootflix.app&hl=en_IN&gl=US"));
                startActivity(browserIntent);
//                String url = "https://play.google.com/store/apps/details?id=com.vootflix.app&hl=en_IN&gl=US";
//                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
//                CustomTabsIntent customTabsIntent = builder.build();
//                customTabsIntent.launchUrl(MainActivity.this, Uri.parse(url));
            }
        });

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:8100929050"));
                startActivity(intent);
            }
        });

        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),ContactUs.class);
                startActivity(i);
            }
        });

    }
}