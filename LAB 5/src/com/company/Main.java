package com.company;

public class Main {

    public static void main(String[] args) {
	Team Man_Utd  = new Team("Fc Man_Utd");
        System.out.println("Team is " + Man_Utd.getName());

        Player ronaldo = new Player("ronaldo");
        System.out.println("Player is " +ronaldo);

        Player sancho = new Player("Sancho");
        System.out.println("Player is : " +sancho);

Man_Utd.addPlayer(ronaldo);
Man_Utd.addPlayer(sancho);
Man_Utd.addPlayer(new Player("rashford",1));

Man_Utd.printPlayer();

        Man_Utd.setMaxSize(1);
        System.out.println("Number of players" +Man_Utd.size());

        System.out.println("Number of goals" +Man_Utd.goals());


    }
}
