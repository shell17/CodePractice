package com.PracticeAgain;

import java.util.Arrays;

public class PermutationStrings {

    public static void main(String[] args){
        String str = "cats";
         permute(str.toCharArray(),0,str.length()-1);
    }

    private static void permute(char[] sArr, int l, int r) {
        if(l==r)
            System.out.println(" " + String.valueOf(sArr));
        else{
            for(int i=l; i<=r;i++){
                swap(sArr,l,i);
                permute(sArr,l+1,r);
                swap(sArr,l,i);


            }
        }

    }

    private static void swap(char[] sArr, int j, int i) {
        char temp=sArr[i];
        sArr[i]=sArr[j];
        sArr[j]=temp;
    }
}
