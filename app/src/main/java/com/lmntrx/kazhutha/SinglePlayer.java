package com.lmntrx.kazhutha;

import android.graphics.Color;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

//import com.larvalabs.svgandroid.SVG;
//import com.larvalabs.svgandroid.SVGParser;

import java.util.ArrayList;
import java.util.Random;

//TODO:Import image assets
//TODO:Visual polish

public class SinglePlayer extends AppCompatActivity {


    //Global Objects
    ArrayList<Cards>userCards=new ArrayList<Cards>();
    Cards computerCard;
    boolean gameOver=false;
    boolean firstTime=true;
    int numberOfTries=0;//Score variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_player);
        //Issue cards once activity is launched
        startGame();
    }

    public void setComputerCardImage(String cardName)
    {
        ImageView computerCardDisplay=(ImageView)findViewById(R.id.computerCard);
        //TODO:Uncomment below line when assets are imported;
        computerCardDisplay.setImageResource(getResources().getIdentifier(cardName,"drawable",this.getPackageName()));

    }

    public void startGame()
    {
        Cards.createCards();
        Random rg = new Random();
        for (int i = 0; i < 8; i++){
            String generatedCard=Cards.cardDictonary.get(String.valueOf(rg.nextInt(55)));
            String generatedCardinSmall=generatedCard.toLowerCase();
            Cards myCard=Cards.getCard(generatedCard);
            String imageViewId="card"+String.valueOf(i);
            int dynamicImageViewId=getResources().getIdentifier(imageViewId,"id",this.getPackageName());
            ImageView userCardDisplay=(ImageView)findViewById(dynamicImageViewId);
            int imageResourceId=getResources().getIdentifier(generatedCardinSmall,"drawable",this.getPackageName());
            //TODO:Uncomment below line when assets are imported
            userCardDisplay.setImageResource(imageResourceId);
            if(firstTime) {
                userCards.add(myCard);
            }
            else
            {
                userCards.set(i,myCard);
            }
            Log.i("userCards",generatedCard);
        }
        //Generate computer card
        String generatedComputerCard=Cards.cardDictonary.get(String.valueOf(rg.nextInt(55)));
        computerCard=Cards.getCard(generatedComputerCard);
        String generatedComputerCardinSmall=generatedComputerCard.toLowerCase();
        Log.i("computerCard",Cards.cardDictonary.get(String.valueOf(rg.nextInt(55))));
        setComputerCardImage(generatedComputerCardinSmall);
    }
    //This function performs a cut
    public void generateNewCard(View view)
    {
        Random rg=new Random();
        String nextGeneratedCard=Cards.cardDictonary.get(String.valueOf(rg.nextInt(55)));
        Log.i("NextGenCard",nextGeneratedCard);
        computerCard=Cards.getCard(nextGeneratedCard);
        numberOfTries++;
        String nextGeneratedCardinSmall=nextGeneratedCard.toLowerCase();
        setComputerCardImage(nextGeneratedCardinSmall);
    }


    //This function performs playing logic
    public void playCard(View view)
    {
        numberOfTries++;
        if (!gameOver) {
            ImageView card = (ImageView) view;
            int tag = Integer.parseInt(card.getTag().toString());
            Cards cardUserPlayed = userCards.get(tag);
            Log.i("CardUserPlayed", cardUserPlayed.type + " " + cardUserPlayed.color);
            if (cardUserPlayed.type.equals(computerCard.type) && !cardUserPlayed.type.equals("dead")) {
                computerCard=userCards.get(tag);
                Log.i("Match found", cardUserPlayed.type + " " + computerCard.type);
                userCards.set(tag, Cards.deadCard);
                ((ImageView) view).setImageResource(R.drawable.backface);
            }
        }

        //Check if user has played all cards
        if(isGameOver())
        {
            Log.i("Game Over","True");
            displayLoseLayout();
            firstTime=false;
        }
    }


    public void displayLoseLayout()
    {
        RelativeLayout loseLayout=(RelativeLayout)findViewById(R.id.loseLayout);
        loseLayout.setVisibility(View.VISIBLE);
        TextView scoreBoard=(TextView)findViewById(R.id.scoreBoard);
        scoreBoard.setText("Score:"+String.valueOf(numberOfTries));
    }

    public void removeLoseLayout()
    {
        RelativeLayout loseLayout=(RelativeLayout)findViewById(R.id.loseLayout);
        loseLayout.setVisibility(View.GONE);
    }

    public void restartGame(View view)
    {
        numberOfTries=0;
        gameOver=false;
        removeLoseLayout();
        RelativeLayout computerCards=(RelativeLayout)findViewById(R.id.computerCards);
        GridLayout gridLayout=(GridLayout) findViewById(R.id.userCards);
        computerCards.setVisibility(View.VISIBLE);
        gridLayout.setVisibility(View.VISIBLE);
        startGame();
    }

    public boolean isGameOver()
    {
        gameOver=true;
        for(Cards card:userCards)
        {
            if(!card.type.equals("dead"))
                gameOver=false;
        }
        return gameOver;
    }
}
