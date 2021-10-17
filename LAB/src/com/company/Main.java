package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //TASK 1
        /*Scanner myscanner = new Scanner(System.in);
        String password = "Ovo je password";
        String secretWord = "Tacno";
        System.out.println("Enter the password");
        String noviPassword =myscanner.next();
        boolean tako = True;
        while(tako){
        if(noviPassword.equals(password)){
            System.out.println(secretWord);
            tako = false;
        }
        else{
            System.out.println("Netacno");
        }
        }



    }*/
        //TASK 2
        /* Scanner myscanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = myscanner.nextInt();
        System.out.println("Enter the second number");
        int b = myscanner.nextInt();
        System.out.println("Enter the third number:");
        int c = myscanner.nextInt();
        int sum = 0;
        sum = a+b+c;
        System.out.println("The sum is: " + sum);

*/
        //TASK 3
        /*Scanner myscanner = new Scanner(System.in);
        int sum = 0;
        int user;
        user = myscanner.nextInt();
        while(true){;
            if(user == 0){
                break;
            }
        }
        System.out.println("Enter the number :");
        user = myscanner.nextInt();
        sum = sum+user;
        System.out.println("The sum is " + sum);

        }*/
        //TASK 4
        /*Scanner reader = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = reader.nextInt();
        System.out.println("Enter the last number");
        int num2 = reader.nextInt();
      while(num1<=num2){
          System.out.println(num1);
          num1++;
            }
        }*/


        //TASK 5
        /*Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = reader.nextInt();
       int sum = 0;
       int i= 0;
       while(i<=num){
       sum = sum+(int)Math.pow(2,i);
       i++;
       System.out.println("Sum is" +sum);
       }
    }*/
        //TASK 6
        /*Scanner reader = new Scanner(System.in);
        System.out.println("How many times it is repeated: ");
        int number = reader.nextInt();
        int i = 0;
        while(i<=number){
            i++;
        }
        printText();*/

//TASK 7
       /* printstars(5);
        printstars(3);
        printstars(9);*/

//TASK 8

            Scanner reader = new Scanner(System.in);
            int random_number = drawNumber();
            System.out.println(random_number);

            int attempts = 0;

            System.out.print("Number guess5 : ");
            int guess = reader.nextInt();
            while(guess!=random_number){
                if(guess>random_number) {
                    attempts +=1;
                    System.out.println("Lower!  -  This is your "+attempts+". guess !");
                }else if (guess<random_number){
                    attempts += 1;
                    System.out.println("Higher!   -  This is your "+attempts+" guess !");
                }
                guess = reader.nextInt();
            }
            System.out.println("You are correct!");
            System.out.println("You made "+(attempts+1)+" guesses !");
        }

        public static int drawNumber(){
            Random rand = new Random();
            int random_number = rand.nextInt(100);

            return random_number;
        }
}
/*static void printstars(int amount){
        int i;
        for(i =0;i<amount;i++) {
            System.out.print("*");
        }
}*/
       /* static void printText () {
            System.out.println("In the begining there were the swamp,the hoe and Java \n");
        }*/




