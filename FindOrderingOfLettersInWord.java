package com.PracticeAgain;

import org.openqa.selenium.interactions.SourceType;

public class FindOrderingOfLettersInWord {

    public static void  main(String[] args){
        String input1= "BOY";
        String input2="GIRL";
        String jumbled ="BGOIYRL";
        System.out.println("find: " + findOrder("GIORL",input2,jumbled));

    }

    private static boolean findOrder(String input1, String input2, String jumbled) {

        boolean foundOneChar = false;
        int currentJ =0;
        int i=0,j=0;
        for(i=0; i<input1.length();i++){
            char ch1 = input1.charAt(i);
            foundOneChar=false;
            for(j=currentJ;j<jumbled.length();j++){
                if(jumbled.charAt(j) == ch1){
                    foundOneChar = true;
                    currentJ = j;
                    break;
                }
                else{

                }
            }
            if(!foundOneChar){
                break;
            }
        }

        System.out.println("I " + i);
        System.out.println("J " + j);
        System.out.println("len " + (input1.length()));

        if(i < input1.length()){
            System.out.println("I " + i);
            return false;
        }
        else if(i == input1.length() && foundOneChar){
            return true;
        }
        else if(i == input1.length()
                && j == jumbled.length() && foundOneChar){

            return true;
        }

        return false;
    }
}
