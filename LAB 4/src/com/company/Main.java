package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list1.add(5);
        list1.add(6);
        list2.add(7);
        list2.add(8);
        combine(list1, list2);
        System.out.println(list1);
        System.out.println(list2);

        LyraCard card = new LyraCard(50);
        System.out.println(card);
        card.payEconomical();
        System.out.println(card);

        card.payGourmet();
        card.payEconomical();
        System.out.println(card);

        card.loadMoney(15);
        System.out.println(card);
        card.loadMoney(10);
        System.out.println(card);
        card.loadMoney(200);
        System.out.println(card);

        System.out.println("Java" + card);
        card.loadMoney(-15);
        System.out.println("Java" + card);

        LyraCard pekka = new LyraCard(20);
        LyraCard brian = new LyraCard(30);
        pekka.payGourmet();
        brian.payEconomical();
        System.out.println(pekka);
        System.out.println(brian);
        pekka.loadMoney(20);
        brian.payGourmet();
        System.out.println(pekka);
        System.out.println(brian);
        pekka.payEconomical();
        pekka.payEconomical();
        brian.loadMoney(50);
        System.out.println(pekka);
        System.out.println(brian);

        Dice d = new Dice(5);
        System.out.println(d.roll());
        System.out.println(d);


    }

    public static void combine(ArrayList<Integer>list1,ArrayList<Integer>list2){
        list1.addAll(list2);

    }


    }


