package com.PracticeAgain;

public class UglyPrimeNumDivBy235 {
        public boolean isUgly(int num) {
            if(num%4 == 0)
                return false;
        /*for(int i=6 ; i< num; i++){
            if((num%i) == 0){
                return false;
            }
        }
        return true;*/

            for(int i=2; i<6 && num>0 ; i++){
                while(num%i == 0){
                    num = num/i;
                }

            }
            return num == 1;
        }
    }
