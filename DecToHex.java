package com.practice;

public class DecToHex {

    public static void main(String[] args){
        getHex(2545);
    }

    private static void getHex(int num) {
        char[] hex = new char[100];
        int i =0;
        while(num!=0){
            int temp = 0;
            temp = num % 16;
            if(temp > 10)
                hex[i++] = (char)(temp + 55);
            else
                hex[i++] = (char)(temp + 48);

            num = num/16;
        }
        for(int j = i-1; j>=0 ; j--){
            System.out.println(hex[j]);
        }

    }
}
