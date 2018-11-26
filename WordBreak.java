package com.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {
    public static void main(String[] args) {
        //return true if word is found in dictionary even after segmented or whole
        String[] arr = {"leet", "code"};
        List<String> list = Arrays.asList(arr);
        Set<String> dict = new HashSet<String>(Arrays.asList(arr));
        //System.out.println("output: "+ wordBreakRec("leetcode", dict));
        System.out.println("output: "+ wordBreakForPractice("leet", dict));

    }

    private static boolean wordBreakForPractice(String s,Set<String> dict){
        boolean[] f = new boolean[s.length()+1];

        f[0]=true;
        for(int i=1;i<=s.length();i++){

            for(int j=0; j<i;j++){
                String sub = s.substring(j,i);
                if(dict.contains(sub) && f[j] ){
                    f[i] = true;
                }
            }
        }
        return f[s.length()];
    }

    private static boolean wordBreakUsingLeet(String s, Set<String> dict) {
        boolean[] f = new boolean[s.length()+1];
        f[0]=true;

        for(int i=1; i<=s.length(); i++){
                for(int j=0; j<i; j++){
                    String substr = s.substring(j,i);
                    if(f[j] && dict.contains(substr)){
                        f[i] = true;
                        break;
                    }
                }

        }

        return f[s.length()];

/*
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;
        for(int i = 1; i <= s.length(); i++) {
            for(int j = 0; j < i; j++) {
                if(dp[j] && dict.contains(s.substring(j,i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];*/
    }

    private static boolean wordBreakRec(String str, Set<String> dict) {
        if(str.isEmpty())
            return true;

        for(int i=1;i<=str.length(); i++){
            if(dict.contains(str.substring(0,i)) && wordBreakRec(str.substring(i,str.length()-i),dict)){
                return true;
            }
        }

        return false;


    }
}