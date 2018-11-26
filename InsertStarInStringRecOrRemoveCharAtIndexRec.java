package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertStarInStringRecOrRemoveCharAtIndexRec {
    public static void main(String[] args){
        //String s = insertStar("abcd");
//        List<Character> lst = new ArrayList<>(Arrays.asList('a','b','c','d','e','f'));
//        String s = addStars(lst);

        String s = removeCharAtIndexRec("Sharayu", 'a');
        System.out.println("String is : " + s);
    }

    public static String removeCharAtIndexRec(String str, char ch){
        int index = str.indexOf(ch);
        if(index == -1){
            return str;
        }
        return removeCharAtIndexRec(str.substring(0,index) + str.substring(index+1,str.length()), ch);
    }

    public static String addStars(List<Character> str){
        if(str.isEmpty())
            return "";
        else if(str.size() <2){ //dont add star after last string
            return "" + str.get(0);
        }

        //add star
        str.listIterator(1).add('*');
        List<Character> subList = str.subList(2, str.size());
        return "" + str.get(0) + '*' + addStars(subList);



    }
    private static String insertStar(String str) {
        if(str.length() == 0)
            return "";
        return insertStar(str.substring(0,str.length()-1) + (str.length()>1 ? "*":"") + str.charAt(str.length() -1));
    }
}
