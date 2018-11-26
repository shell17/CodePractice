package com.practice;

import java.util.Arrays;

public class ReverseWords {
    public static String reverse(String inputStr){
        StringBuilder sb = new StringBuilder();
        String[] wordsArr = inputStr.split(" ");
        for(int i= wordsArr.length-1 ; i>=0 ; i--){
            sb.append(wordsArr[i] + " ");
        }
        return sb.toString();
    }

    public static void main(String[] args){
        //String inputStr = "The sky is blue";
        String inputStr = "";
        //System.out.println("Reverse is : " + reverse(inputStr));

/*
        int a=9,b=2;
        float f;
        f=a/b;
        double d = 123.127;
        System.out.println("f: " + f );
        System.out.println("d: " + d );
*/


        //reverseWordsInPlace("My name is Sharayu".toCharArray());
        reverseUsing2pointers("My name is Sharayu".toCharArray());



    }

    private static void reverseUsing2pointers(char[] input){
        int i=0;
        int j= input.length-1;
        while(i<j){
            char temp = input[i];
            input[i]=input[j];
            input[j]=temp;
            i++;
            j--;
        }
        System.out.println("reverse: " + new String(input));
    }

    private static void reverseWordsInPlace(char[] input) {
        System.out.println("Reverse is : " + Arrays.toString(input));
        reverseComplete(input,0,input.length-1);
        System.out.println("Reverse is : " + Arrays.toString(input));

        int start =0, end;
        while( (end = findSpace(input,start)) != -1){
            reverseComplete(input,start,end-1);
            start =  end + 1;
        }
        reverseComplete(input,start,input.length -1);

        System.out.println("Reverse is : " + Arrays.toString(input));

    }
    public static int findSpace(char[] input, int start){
        for(int i = start; i< input.length; i++){
            if(input[i] == ' '){
                return i;
            }
        }
        return -1;
    }
    public static void reverseComplete(char[] arr, int startIndex, int stopIndex){
        if(startIndex >= stopIndex)
            return;

        int mid = startIndex + (stopIndex-startIndex)/2;

        for(int i = startIndex, j= stopIndex; i<=mid; i++,j--){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

    }

}
