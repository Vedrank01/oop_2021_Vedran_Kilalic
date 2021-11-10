package com.company;

import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> players  = new ArrayList<Player>();
    private int maxSize = 16;
    public Team(String newName){
        this.name = newName;

    }
    public String getName(){

        return this.name;
    }
    public void setName(String newName){

        this.name = newName;
    }
    public void addPlayer(Player player){
    if(this.players.size()<this.maxSize){
        this.players.add(player);
    }
    }
    public void printPlayer(){
    for(Player player: this.players){
        System.out.println(player);
    }
    }
    public void setMaxSize(int maxSize){

        this.maxSize = maxSize;
    }
    public int size(){
        return this.players.size();
    }

    public int goals(){
        int total = 0;
        for(Player players : this.players){
            total = total +players.goals();

        }

        return total;
    }
}
