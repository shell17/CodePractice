package com.practice;

public class Fibonacci {

    public static int fib(int n){

        int a =0,b=1,c=0;
        if(n ==0)
            return 1;
        for(int i=2; i<=n; i++){
            c = a+b;
            a=b;
            b=c;
        }
        return c;
    }

    public static int recFib(int n){
        if(n <= 1)
            return n;

        return(recFib(n-1) + recFib(n-2));
    }

    public static void main(String[] args){

        System.out.println("fib is : " + fib(3));
    }
}
