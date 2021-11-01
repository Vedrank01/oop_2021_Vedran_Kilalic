package com.company;

import java.util.Random;

public class Dice {
    private Random random;
    private int numberOfsides;


    public Dice(int numberOfsides){
        this.numberOfsides = numberOfsides;
        random = new Random();

    }
    public int roll(){
        return this.random.nextInt(this.numberOfsides)+1;
    }
    public String toString(){
        return "Number of sides = " + this.numberOfsides;
    }
    private Dice Dice(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
