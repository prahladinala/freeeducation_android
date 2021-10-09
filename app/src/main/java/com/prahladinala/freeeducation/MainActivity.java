package com.prahladinala.freeeducation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // CODE TO REDIRECT TO WEBACTIVITY > INTENT
                Intent prahlad = new Intent(MainActivity.this, WebActivity.class);
                MainActivity.this.startActivity(prahlad);
                MainActivity.this.finish();
            }
        },3000);
    }
}