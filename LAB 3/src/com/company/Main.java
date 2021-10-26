package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    //TASK 1
    public static void main(String[] args) {
        double answer = average(4,3,6,1);
        System.out.println("average" + answer);


        //TASK 2

        Scanner reader = new Scanner(System.in);
        System.out.println("Type in the text");
        String text = reader.nextLine();
        System.out.println("The text length is " + text.length());

        //TASK 3
        System.out.println("Enter the text");
        String text2 = reader.nextLine();
        for(int i = 0;i<=text2.length();i++){
            char a = text2.charAt(i);
            System.out.println(a);
        }

        // TASK 4
        System.out.println("Enter the name");
        String name = reader.nextLine();
        System.out.println("The name is printer in the reverse order");
        for(int i = name.length()-1;i>=0;i--){
            System.out.println(name.charAt(i));
        }
        //TASK 5
        System.out.println("Enter the first word");
        String word1 = reader.nextLine();
        System.out.println("Enter the second word");
        String word2 = reader.nextLine();
        int result = word1.indexOf(word2);
        if(result!=-1){
            System.out.println("The word" +word2 + "is found in"+ word1);
        }else{
            System.out.println("The word"+word2 + "is now found in"+word1);
        }
        //TASK 6
        ArrayList<String> words = new ArrayList<String>();
        while(true){
            System.out.println("Type the word");
            String user_word = reader.nextLine();
            if(words.contains(user_word)){
                break;
            }else{
                words.add(user_word);
            }
        }
        System.out.println("Words");
        Collections.sort(words);
        String word;
        for(  word : words);
        System.out.println(word);


        // TASK 7
        ArrayList<String> list  = new ArrayList<String> ();
        list.add("Vedran");
        list.add("Programianje");
        list.add("Student");
        list.add("Java java java java");
        ArrayList<Integer> lengths =lengths(list);
        System.out.println("The length of the strings is" +lengths);

        //TASK 8
        System.out.println("Type in the text");
        String textic = reader.nextLine();
        if(palindrome(textic)){
            System.out.println("The text is palindrome");
        }else{
            System.out.println("The text is not palindrome");
        }

    }
    public static boolean palindrome(String textic){
        int length = textic.length();
        String reverse = "";
        for(int i = length-1;i>=0;i--){
            reverse = reverse + textic.charAt(i);
        }
        return textic.equals(reverse);
    }
    public static ArrayList<Integer> lengths(ArrayList<String>lista){
        ArrayList<Integer> lengths = new ArrayList<Integer>();
        for(String strings : lista){
            lengths.add(strings.length());
        }
        return lengths;
    }
    public static double average(int a,int b,int c,int d){
        double rezultat;
        rezultat = (a+b+c+d)/2.0;
        return rezultat;
    }
}
