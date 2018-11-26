package com.practice;

import java.util.*;

public class isAnagram {

    public static boolean isThisAnagram1(String s1, String s2){
        //using sorting
        char[] s1Arr = s1.toCharArray();
        char[] s2Arr = s2.toCharArray();
        Arrays.sort(s1Arr);
        Arrays.sort(s2Arr);

        if(Arrays.equals(s1Arr,s2Arr)){
            return true;
        }
        return false;
    }

    public static boolean isThisAnagram(String s1, String s2){
        //using substring method
        char[] s1Arr = s1.toLowerCase().toCharArray();
        char[] s2Arr = s2.toLowerCase().toCharArray();

        if(s1.length() != s2.length())
            return false;

        StringBuilder sb = new StringBuilder();
        for(char ch: s1Arr){
            int index = s2.indexOf(ch);
            if(index != -1){
                s2 = (s2.substring(0,index) + s2.substring(index+1,s2.length()));
            }
            else{
                return false;
            }
        }

        if(s2.isEmpty()){
            return true;
        }
        return false;

    }


    // Complete the compressedString function below.
    public static String compressedString(String message) {
        if(message.isEmpty())
            return "";

        //assuming input has [a-z] and spaces maybe
        String msg = message.trim();

        char[] messageArr = new char[msg.length()];
        char[] newMessageArr = new char[msg.length()];

        messageArr = msg.toCharArray();
        StringBuffer msgBuffer = new StringBuffer();
        Map<Character, Integer> chCountMap = new HashMap();
        /*for(char ch: messageArr){
            if(!chCountMap.containsKey(ch)){
                chCountMap.put(ch,1);
                msgBuffer.append(ch);
            }
            else{
                chCountMap.put(ch,chCountMap.get(ch) + 1);
            }

        }*/

        for(int i =1 ; i<= messageArr.length-1; i++){
            if(messageArr[i] == messageArr[i-1]){

            }
        }


        StringBuffer compressedString = new StringBuffer();


        for(int i =0; i< msgBuffer.length(); i++){
            char ch = msgBuffer.charAt(i);
            int numberOfOccurence = chCountMap.get(ch);
            if(numberOfOccurence == 1){
                compressedString.append(ch);
            }
            else{
                compressedString.append(ch);
                compressedString.append(chCountMap.get(ch));
            }
        }
        System.out.println(compressedString.toString());
        return compressedString.toString();
    }

    public static void main(String[] args){
        //System.out.println("Is it anagram: " + isThisAnagram("mary", "army"));
        compressedString("goodddoo");
    }

}
