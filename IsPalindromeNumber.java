package com.practice;

public class IsPalindromeNumber {

    public static boolean isPalinLessSpace(int num){
        if(num < 0)
            return false;

        //collect divisor
        int div =1;
        while(num/div >= 10){
            div *= 10;
        }

        while(num != 0){
            int left = num/div;
            int right = num%10;

            if(left!=right)
                return false;

            num = (num%div) /10;
            div /= 100;
        }
        return true;

    }

    public static boolean isPalindrome(int inputNum){

        int num = inputNum;
        int rem=0,rev=0;

        if(inputNum < 0)
            return false;
        do{
            rem = num %10;
            rev = rev*10 + rem;
            num = num /10;
        }while(num>0);

        if(rev == inputNum){
            return true;
        }
        return false;
    }


    public static void main(String[] args){
        int num = 1221;
        //System.out.println("Num is palindrome " + isPalindrome(num));
        System.out.println("Num is palindrome " + isPalinLessSpace(num));
    }
}
