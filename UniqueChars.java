package com.practice;

public class UniqueChars {

    public static boolean isUniqueChars(String str){
        boolean[] chars_present = new boolean[128];
        if(str.length() > 128){
            return false;
        }

        for(int i=0; i<str.length(); i++){
            int value = str.charAt(i);
            if(chars_present[value]){
                return false;
            }

            chars_present[value] = true;
        }

        return true;

    }

    public static void main(String[] args){
        String[] words = {"abcd","hello","apple"};
        for(String word: words){
            System.out.println("isUniqueChars: " + word + " : " + isUniqueChars(word));
        }

    }
}
