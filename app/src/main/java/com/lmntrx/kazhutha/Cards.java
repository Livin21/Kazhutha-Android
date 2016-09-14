package com.lmntrx.kazhutha;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nihal on 9/13/2016.
 */

//TODO:Remove one cards
public class Cards {
    int number;
    String color,type;
    static  Map<String, String> cardDictonary = new HashMap<String, String>();


    //Constructor
    public Cards(int num,String col,String ty)
    {
        this.number=num;
        this.color=col;
        this.type=ty;
    }

    //CreateCards Function
    public static void createCards() {

        //Dictonary Start
        //Club Cards
        cardDictonary.put("0","clubAce");
        cardDictonary.put("1","clubAce");
        cardDictonary.put("2","clubTwo");
        cardDictonary.put("3","clubThree");
        cardDictonary.put("4","clubFour");
        cardDictonary.put("5","clubFive");
        cardDictonary.put("6","clubSix");
        cardDictonary.put("7","clubSeven");
        cardDictonary.put("8","clubEight");
        cardDictonary.put("9","clubNine");
        cardDictonary.put("10","clubTen");
        cardDictonary.put("11","clubJack");
        cardDictonary.put("12","clubQueen");
        cardDictonary.put("13","clubKing");

        //Diamond Cards
        cardDictonary.put("14","diamondAce");
        cardDictonary.put("15","diamondAce");
        cardDictonary.put("16","diamondTwo");
        cardDictonary.put("17","diamondThree");
        cardDictonary.put("18","diamondFour");
        cardDictonary.put("19","diamondFive");
        cardDictonary.put("20","diamondSix");
        cardDictonary.put("21","diamondSeven");
        cardDictonary.put("22","diamondEight");
        cardDictonary.put("23","diamondNine");
        cardDictonary.put("24","diamondTen");
        cardDictonary.put("25","diamondJack");
        cardDictonary.put("26","diamondQueen");
        cardDictonary.put("27","diamondKing");


        //HeartsCard
        cardDictonary.put("28","heartsAce");
        cardDictonary.put("29","heartsAce");
        cardDictonary.put("30","heartsTwo");
        cardDictonary.put("31","heartsThree");
        cardDictonary.put("32","heartsFour");
        cardDictonary.put("33","heartsFive");
        cardDictonary.put("34","heartsSix");
        cardDictonary.put("35","heartsSeven");
        cardDictonary.put("36","heartsEight");
        cardDictonary.put("37","heartsNine");
        cardDictonary.put("38","heartsTen");
        cardDictonary.put("39","heartsJack");
        cardDictonary.put("40","heartsQueen");
        cardDictonary.put("41","heartsKing");


        //SpadesCard
        cardDictonary.put("42","spadesAce");
        cardDictonary.put("43","spadesAce");
        cardDictonary.put("44","spadesTwo");
        cardDictonary.put("45","spadesThree");
        cardDictonary.put("46","spadesFour");
        cardDictonary.put("47","spadesFive");
        cardDictonary.put("48","spadesSix");
        cardDictonary.put("49","spadesSeven");
        cardDictonary.put("50","spadesEight");
        cardDictonary.put("51","spadesNine");
        cardDictonary.put("52","spadesTen");
        cardDictonary.put("53","spadesJack");
        cardDictonary.put("54","spadesQueen");
        cardDictonary.put("55","spadesKing");

        //Dictonary Ends
    }


    //Static cards
    //Club Card objects
    static Cards clubAce=new Cards(0,"Black","club");
    static Cards clubOne=new Cards(1,"Black","club");
    static Cards clubTwo=new Cards(2,"Black","club");
    static Cards clubThree=new Cards(3,"Black","club");
    static Cards clubFour=new Cards(4,"Black","club");
    static Cards clubFive=new Cards(5,"Black","club");
    static Cards clubSix=new Cards(6,"Black","club");
    static Cards clubSeven=new Cards(7,"Black","club");
    static Cards clubEight=new Cards(8,"Black","club");
    static Cards clubNine=new Cards(9,"Black","club");
    static Cards clubTen=new Cards(10,"Black","club");
    static Cards clubJack=new Cards(11,"Black","club");
    static Cards clubQueen=new Cards(12,"Black","club");
    static Cards clubKing=new Cards(13,"Black","club");


    //Diamond card objects

    static Cards diamondAce=new Cards(0,"Red","diamond");
    static Cards diamondOne=new Cards(1,"Red","diamond");
    static Cards diamondTwo=new Cards(2,"Red","diamond");
    static Cards diamondThree=new Cards(3,"Red","diamond");
    static Cards diamondFour=new Cards(4,"Red","diamond");
    static Cards diamondFive=new Cards(5,"Red","diamond");
    static Cards diamondSix=new Cards(6,"Red","diamond");
    static Cards diamondSeven=new Cards(7,"Red","diamond");
    static Cards diamondEight=new Cards(8,"Red","diamond");
    static Cards diamondNine=new Cards(9,"Red","diamond");
    static Cards diamondTen=new Cards(10,"Red","diamond");
    static Cards diamondJack=new Cards(11,"Red","diamond");
    static Cards diamondQueen=new Cards(12,"Red","diamond");
    static Cards diamondKing=new Cards(13,"Red","diamond");


    //Hearts Card objects

    static Cards heartAce=new Cards(0,"Red","heart");
    static Cards heartOne=new Cards(1,"Red","heart");
    static Cards heartTwo=new Cards(2,"Red","heart");
    static Cards heartThree=new Cards(3,"Red","heart");
    static Cards heartFour=new Cards(4,"Red","heart");
    static Cards heartFive=new Cards(5,"Red","heart");
    static Cards heartSix=new Cards(6,"Red","heart");
    static Cards heartSeven=new Cards(7,"Red","heart");
    static Cards heartEight=new Cards(8,"Red","heart");
    static Cards heartNine=new Cards(9,"Red","heart");
    static Cards heartTen=new Cards(10,"Red","heart");
    static Cards heartJack=new Cards(11,"Red","heart");
    static Cards heartQueen=new Cards(12,"Red","heart");
    static Cards heartKing=new Cards(13,"Red","heart");


    //Spades Card objects
    static Cards spadesAce=new Cards(0,"Black","spades");
    static Cards spadesOne=new Cards(1,"Black","spades");
    static Cards spadesTwo=new Cards(2,"Black","spades");
    static Cards spadesThree=new Cards(3,"Black","spades");
    static Cards spadesFour=new Cards(4,"Black","spades");
    static Cards spadesFive=new Cards(5,"Black","spades");
    static Cards spadesSix=new Cards(6,"Black","spades");
    static Cards spadesSeven=new Cards(7,"Black","spades");
    static Cards spadesEight=new Cards(8,"Black","spades");
    static Cards spadesNine=new Cards(9,"Black","spades");
    static Cards spadesTen=new Cards(10,"Black","spades");
    static Cards spadesJack=new Cards(11,"Black","spades");
    static Cards spadesQueen=new Cards(12,"Black","spades");
    static Cards spadesKing=new Cards(13,"Black","spades");

    //DeadCard for game logic
    static Cards deadCard=new Cards(999,"dead","dead");

//Card objects end

    public static Cards getCard(String cardName)
    {
        switch (cardName)
        {
            case "clubAce":return clubAce;
            case "clubOne":return  clubOne;
            case "clubTwo":return clubTwo;
            case "clubThree":return clubThree;
            case "clubFour":return clubFour;
            case "clubFive":return clubFive;
            case "clubSix":return clubSix;
            case "clubSeven":return clubSeven;
            case "clubEight":return clubEight;
            case "clubNine":return  clubNine;
            case "clubTen":return clubTen;
            case "clubJack":return clubJack;
            case "clubQueen":return clubQueen;
            case "clubKing":return clubKing;


            case "diamondAce":return diamondAce;
            case "diamondOne":return diamondOne;
            case "diamondTwo":return diamondTwo;
            case "diamondThree":return diamondThree;
            case "diamondFour":return diamondFour;
            case "diamondFive":return diamondFive;
            case "diamondSix":return diamondSix;
            case "diamondSeven":return diamondSeven;
            case "diamondEight":return diamondEight;
            case "diamondNine":return diamondNine;
            case "diamondTen":return diamondTen;
            case "diamondJack":return diamondJack;
            case "diamondQueen":return diamondQueen;
            case "diamondKing":return diamondKing;


            case "heartsAce":return heartAce;
            case "heartsOne":return heartOne;
            case "heartsTwo":return heartTwo;
            case "heartsThree":return heartThree;
            case "heartsFour":return heartFour;
            case "heartsFive":return heartFive;
            case "heartsSix":return heartSix;
            case "heartsSeven":return heartSeven;
            case "heartsEight":return heartEight;
            case "heartsNine":return heartNine;
            case "heartsTen":return heartTen;
            case "heartsJack":return heartJack;
            case "heartsQueen":return heartQueen;
            case "heartsKing":return  heartKing;


            case "spadesAce":return spadesAce;
            case "spadesOne":return spadesOne;
            case "spadesTwo":return spadesTwo;
            case "spadesThree":return spadesThree;
            case "spadesFour":return spadesFour;
            case "spadesFive":return spadesFive;
            case "spadesSix":return spadesSix;
            case "spadesSeven":return spadesSeven;
            case "spadesEight":return spadesEight;
            case "spadesNine":return spadesNine;
            case "spadesTen":return spadesTen;
            case "spadesJack":return spadesJack;
            case "spadesQueen":return spadesQueen;
            case "spadesKing":return spadesKing;
        }
        return(deadCard);//Dead card
    }
}

