package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //#TASKS 1,2,3

        System.out.println("Vedran Kilalic");
        System.out.println("Hello World");
        int x = 365*24*60*60;
        System.out.println("There are " + x + "seconds of the year");

        //#TASK 3
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first integer");
        int num1 = Integer.parseInt(reader.nextLine());
        System.out.println("Type the second integer");
        int num2 =Integer.parseInt(reader.nextLine());
        int sum = num1+num2;
        System.out.println("The sum is " + sum);

        //#TASK 4
        System.out.println("Enter some number");
        int number = Integer.parseInt(reader.nextLine());
        int squareOfnumber = number*number;
        System.out.println("square of the number is: " + squareOfnumber);

        //#TASK 5
        System.out.println("Enter some number");
        int broj = Integer.parseInt(reader.nextLine());
        if(broj>0){
            System.out.println("The number is positive");
        }
        else if(broj<0){
            System.out.println("The number is negative");
        }
        else{
            System.out.println("The number is zero");
        }

        //#TASK 6
        System.out.println("Enter the first number ");
        int n1 = Integer.parseInt(reader.nextLine());
        System.out.println("Enter the second number ");
        int n2 = Integer.parseInt(reader.nextLine());
        if(n1==n2){
            System.out.println("Numbers are equal");
        }
        else if(n1>n2){
            System.out.println("The first number is greater than the second number");
        }
        else{
            System.out.println("The second number is greater than the first number");
        }

    }

}

