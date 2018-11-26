package com.example.helloworld;

public class Gcd {
    public static void main(String[] args){
        int m = 12, n=10;
        int gcd = findGcd(m,n);
        System.out.println("Gcd is " + gcd);
    }

    public static int lcm(int x, int y){
        int greaterNum = (x>y)? x:y;
        while(true){
            if(greaterNum%x == 0 && greaterNum%y == 0)
                return greaterNum;

            ++greaterNum;
        }

    }
    public static int findGcd(int m, int n) {
       int greaterNum = (m>n) ? m : n;
       int smallerNum = (m<n) ? m : n;

       int r =smallerNum;
       while(greaterNum % smallerNum != 0){
           r = greaterNum % smallerNum;
           greaterNum = smallerNum;
           smallerNum = r;
       }
       return r;
    }
}
