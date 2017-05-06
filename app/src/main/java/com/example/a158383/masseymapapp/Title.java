package com.example.a158383.masseymapapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.content.Intent;

public class Title extends AppCompatActivity {

    private Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title);
        mHandler.postDelayed(mUpdateTimeTask, 2000);
    }

    private Runnable mUpdateTimeTask = new Runnable() {
        public void run() {
            Intent i = new Intent(Title.this, Map.class);
            finish();
            startActivity(i);
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        }
    };
}
