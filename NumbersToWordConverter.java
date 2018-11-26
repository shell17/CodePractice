package com.example.helloworld;

import java.util.Scanner;

public class NumbersToWordConverter {

    public static String[] units = {
            "",
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine",
            "ten",
            "eleven",
            "twelve",
            "thirteen",
            "fourteen",
            "fifteen",
            "sixteen",
            "seventeen",
            "eighteen",
            "nineteen"
    };

    public static String[] tens = {
            "",
            "ten",
            "twenty",
            "thirty",
            "forty",
            "fifty",
            "sixty",
            "seventy",
            "eighty",
            "ninety"
    };

    public static String convert(int n){
        if(n<0){
            return "Minus " + convert(-n);
        }
        if(n<20){
            return units[n];
        }
        if(n<100){
            int firstDig = n/10;
            int secondDig = n%10;
            return tens[firstDig] + " " + units[secondDig];
        }
        if(n<1000){
            int firstDig = n/100;
            n = n%100;
            int secondDig = n/10;
            int thirdDig = n%10;
            return units[firstDig] + " " + tens[secondDig] + " " + units[thirdDig];
        }

        return "";
    }
    public static void main(String[] args){

        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num: ");
        n = scanner.nextInt();
        System.out.println("\n num is : " + convert(n));
    }
}
