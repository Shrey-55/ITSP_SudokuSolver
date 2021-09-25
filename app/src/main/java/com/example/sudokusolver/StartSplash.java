package com.example.sudokusolver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class StartSplash extends AppCompatActivity {

    @Override
    protected void onStart() {
        super.onStart();
        MainApplication app = (MainApplication) getApplication();
        app.ring.start();
    }

    @Override
    protected void onResume() {
        super.onResume();
        MainApplication app = (MainApplication) getApplication();
        app.ring.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        MainApplication app = (MainApplication) getApplication();
        app.ring.pause();
    }
    private static int SPLASH_SCREEN_TIME_OUT=2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(StartSplash.this,
                        MainActivity.class);
                //Intent is used to switch from one activity to another.

                startActivity(i);
                //invoke the SecondActivity.

                finish();
                //the current activity will get finished.
            }
        }, SPLASH_SCREEN_TIME_OUT);
    }
}