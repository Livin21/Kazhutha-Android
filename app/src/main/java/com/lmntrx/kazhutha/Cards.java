package com.lmntrx.kazhutha;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nihal on 9/13/2016.
 */
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
        cardDictonary.put("1","clubOne");
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
        cardDictonary.put("14","DiamondAce");
        cardDictonary.put("15","DiamondOne");
        cardDictonary.put("16","DiamondTwo");
        cardDictonary.put("17","DiamondThree");
        cardDictonary.put("18","DiamondFour");
        cardDictonary.put("19","DiamondFive");
        cardDictonary.put("20","DiamondSix");
        cardDictonary.put("21","DiamondSeven");
        cardDictonary.put("22","DiamondEight");
        cardDictonary.put("23","DiamondNine");
        cardDictonary.put("24","DiamondTen");
        cardDictonary.put("25","DiamondJack");
        cardDictonary.put("26","DiamondQueen");
        cardDictonary.put("27","DiamondKing");


        //HeartsCard
        cardDictonary.put("28","HeartsAce");
        cardDictonary.put("29","HeartsOne");
        cardDictonary.put("30","HeartsTwo");
        cardDictonary.put("31","HeartsThree");
        cardDictonary.put("32","HeartsFour");
        cardDictonary.put("33","HeartsFive");
        cardDictonary.put("34","HeartsSix");
        cardDictonary.put("35","HeartsSeven");
        cardDictonary.put("36","HeartsEight");
        cardDictonary.put("37","HeartsNine");
        cardDictonary.put("38","HeartsTen");
        cardDictonary.put("39","HeartsJack");
        cardDictonary.put("40","HeartsQueen");
        cardDictonary.put("41","HeartsKing");


        //SpadesCard
        cardDictonary.put("42","SpadesAce");
        cardDictonary.put("43","SpadesOne");
        cardDictonary.put("44","SpadesTwo");
        cardDictonary.put("45","SpadesThree");
        cardDictonary.put("46","SpadesFour");
        cardDictonary.put("47","SpadesFive");
        cardDictonary.put("48","SpadesSix");
        cardDictonary.put("49","SpadesSeven");
        cardDictonary.put("50","SpadesEight");
        cardDictonary.put("51","SpadesNine");
        cardDictonary.put("52","SpadesTen");
        cardDictonary.put("53","SpadesJack");
        cardDictonary.put("54","SpadesQueen");
        cardDictonary.put("55","SpadesKing");

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

//Card objects end

    public void gameCardGenerator(String cardName)
    {
        switch (cardName)
        {
            case "spadesTen":Cards spadeTen=new Cards(10,"Black","spades");
        }
    }
}

