package com.PracticeAgain;

public class StringCompareImple {

    public int compare(String s1, String s2){
        for(int i=0; i< s1.length() && i < s2.length(); i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return s1.charAt(i) > s2.charAt(i) ? 1:-1;
            }
        }
        return s1.length() > s2.length() ? 1 : s1.length() == s2.length() ? 0 : -1 ;
    }
}
