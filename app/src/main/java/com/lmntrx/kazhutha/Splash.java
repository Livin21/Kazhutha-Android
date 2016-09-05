package com.lmntrx.kazhutha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        TimerTask switchActivity = new TimerTask() {
            @Override
            public void run() {
                startActivity(new Intent(Splash.this,MainActivity.class));
                Splash.this.finish();
            }
        };
        new Timer().schedule(switchActivity,5000);

    }
}
