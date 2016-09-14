package com.lmntrx.kazhutha;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        TimerTask switchActivity = new TimerTask() {
            @Override
            public void run() {
                startActivity(new Intent(Splash.this,MainMenu.class));
                Splash.this.finish();
            }
        };
        new Timer().schedule(switchActivity,5000);

    }
}
