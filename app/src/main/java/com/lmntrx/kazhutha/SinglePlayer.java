package com.lmntrx.kazhutha;

import android.graphics.Color;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.larvalabs.svgandroid.SVG;
import com.larvalabs.svgandroid.SVGParser;

import java.util.ArrayList;
import java.util.Random;

//TODO:MAP NUMBERS TO CARDS
public class SinglePlayer extends AppCompatActivity {

    ArrayList<Cards>userCards=new ArrayList<Cards>();
    Cards computerCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_player);
        Cards.createCards();
        Random rg = new Random();
        for (int i = 0; i < 8; i++){
            String generatedCard=Cards.cardDictonary.get(String.valueOf(rg.nextInt(55)));
            Cards myCard=Cards.getCard(generatedCard);
            userCards.add(myCard);
            Log.i("userCards",generatedCard);
        }

        computerCard=Cards.getCard(Cards.cardDictonary.get(String.valueOf(rg.nextInt(55))));
        Log.i("computerCard",Cards.cardDictonary.get(String.valueOf(rg.nextInt(55))));
    }

    public void generateNewCard(View view)
    {
        Random rg=new Random();
        String nextGeneratedCard=Cards.cardDictonary.get(String.valueOf(rg.nextInt(55)));
        Log.i("NextGenCard",nextGeneratedCard);
        computerCard=Cards.getCard(nextGeneratedCard);
    }

    public void playCard(View view)
    {
        ImageView card=(ImageView) view;
        int tag=Integer.parseInt(card.getTag().toString());
        Cards cardUserPlayed=userCards.get(tag);
        Log.i("CardUserPlayed",cardUserPlayed.type+" "+cardUserPlayed.color);
        if(cardUserPlayed.type.equals(computerCard.type)&& !cardUserPlayed.type.equals("dead"))
        {
            //TODO:Finish Game Logic
            Log.i("Jayicheda",cardUserPlayed.type+" "+computerCard.type);
            userCards.set(tag,Cards.deadCard);
        }

        /*Logic to check dead card
        if(cardUserPlayed.type.equals("dead"))
        {
            Log.i("DeadCard",String.valueOf(tag));
        }
        */
    }
}
