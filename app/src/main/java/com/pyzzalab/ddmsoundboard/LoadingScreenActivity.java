package com.pyzzalab.ddmsoundboard;

import android.app.Activity;

import android.content.Intent;

import android.os.Bundle;
import android.os.Handler;


public class LoadingScreenActivity extends Activity {

    int delay;

    public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);

        setContentView(R.layout.loading_screen);
        delay = 3000;

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(LoadingScreenActivity.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, delay);

    }
}