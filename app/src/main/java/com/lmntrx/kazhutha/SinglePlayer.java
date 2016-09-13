package com.lmntrx.kazhutha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.Random;

//TODO:MAP NUMBERS TO CARDS
public class SinglePlayer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_player);
        Cards.createCards();
        Random rg = new Random();
        for (int i = 0; i < 8; i++){
            Log.i("8ball",Cards.cardDictonary.get(String.valueOf(rg.nextInt(55))));
        }

        Log.i("1ball",Cards.cardDictonary.get(String.valueOf(rg.nextInt(55))));
    }

    public void generateNewCard(View view)
    {
        Random rg=new Random();
        Log.i("1ball",Cards.cardDictonary.get(String.valueOf(rg.nextInt(55))));
    }
}
