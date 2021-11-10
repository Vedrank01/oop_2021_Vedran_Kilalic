package com.company;

public class Player {
    private String name;
    private int amount;


    public Player (String newName){

        this.name = newName;
    }
    public Player (String name,int amount){
        this.amount = amount;
        this.name = name;
    }
    public String getName(){

        return this.name;
    }
    public int goals(){

        return this.amount;
    }
    public String toString(){

        return "Name: " +this.name+"goals: "+this.amount;
    }


}
