package com.lmntrx.kazhutha;

import android.graphics.Color;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.larvalabs.svgandroid.SVG;
import com.larvalabs.svgandroid.SVGParser;

import java.util.ArrayList;
import java.util.Random;

//TODO:MAP NUMBERS TO CARDS
public class SinglePlayer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_player);
        Cards.createCards();
        ArrayList<Cards>userCards=new ArrayList<Cards>();
        Random rg = new Random();
        for (int i = 0; i < 8; i++){
            String generatedCard=Cards.cardDictonary.get(String.valueOf(rg.nextInt(55)));
            Cards myCard=Cards.getCard(generatedCard);
            userCards.add(myCard);
            Log.i("userCards",generatedCard);
        }

        Cards computerCard=Cards.getCard(Cards.cardDictonary.get(String.valueOf(rg.nextInt(55))));
        Log.i("computerCard",Cards.cardDictonary.get(String.valueOf(rg.nextInt(55))));
    }

    public void generateNewCard(View view)
    {
        Random rg=new Random();
        Log.i("nextComputerCard",Cards.cardDictonary.get(String.valueOf(rg.nextInt(55))));
    }
}
