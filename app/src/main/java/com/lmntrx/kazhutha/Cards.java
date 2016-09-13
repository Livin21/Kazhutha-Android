package com.lmntrx.kazhutha;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nihal on 9/13/2016.
 */
public class Cards {
    int number;
    String color,type;

    public static void createCards() {
        Map<String, String> cardDictonary = new HashMap<String, String>();

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


        //TODO:Create card objects
    }
}

