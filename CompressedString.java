package com.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CompressedString
{
    //compressed string such that good is go2d
    //1 should not be shown
    //only consecutive chars are shown with num
    // used arrays but couldnt stor count in array

    public static void compressBetter(String str){
        //aaabbbbcc

        char last = str.charAt(0);

        int count = 1;
        StringBuffer sb = new StringBuffer();
        for(int i =1; i<str.length(); i++){
            if(str.charAt(i) == last){
                count++;
            }
            else{
                sb.append(last);
                sb.append(count);
                count = 1;
                last = str.charAt(i);
            }
        }
        sb.append(last);
        sb.append(count);

        System.out.println("compressed : " + sb.toString());
    }

    public static void compressInPlace(String str){
        char[] sArr = str.toCharArray();
        int index=0, count=0, indexAns=0;

        while(index < str.length()){
            char currCh = sArr[index];
            count = 0;
            while(index<str.length() && currCh==sArr[index]){
                index++;
                count++;
            }
            sArr[indexAns++] = currCh;
            if(count>1){
                for(char ch: String.valueOf(count).toCharArray()){
                    sArr[indexAns++] = ch;
                }
            }
        }
        for(int j=0;j<indexAns;j++){
            System.out.print(sArr[j]);
        }
    }

    // Complete the compressedString function below.

    public static void compressedStringUsingLeet(String message){

        char[] messageArr = message.toCharArray();
        int index = 0, indexAns =0, count =0;
        while(index < messageArr.length){
            char currentChar = messageArr[index];
            count = 0;
            while(index < message.length() && messageArr[index] == currentChar){
                index++;
                count++;
            }
            messageArr[indexAns++] = currentChar;
            if(count>1){
                for(char c : Integer.toString(count).toCharArray()){
                    messageArr[indexAns++] = c;
                }
            }
        }
        StringBuffer newMsgArr = new StringBuffer();
        for(int i =0; i<indexAns; i++){
            newMsgArr.append(messageArr[i]);
        }
        System.out.println("message Arr: " + newMsgArr);

    }

    public static String compressedString(String message) {
        if(message.isEmpty())
            return "";

        //assuming input has [a-z] and spaces maybe
        String msg = message.trim();

        char[] messageArr = new char[msg.length()];
        messageArr = msg.toCharArray();
        StringBuffer msgBuffer = new StringBuffer();
        Map<Character, Integer> chCountMap = new HashMap();
        for(char ch: messageArr){
            if(!chCountMap.containsKey(ch)){
                chCountMap.put(ch,1);
                msgBuffer.append(ch);
            }
            else{
                chCountMap.put(ch,chCountMap.get(ch) + 1);
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
        //compressedString("gooddddoo");
        //compressedStringUsingLeet("gooddddoo");
        //compressBetter("aaabbc");
        compressInPlace("abbccc");

    }

}
