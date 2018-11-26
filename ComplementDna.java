package com.practice;

import java.util.HashMap;
import java.util.Map;

public class ComplementDna {




//Q: In DNA strings, symbols 'A' and 'T' are complements of each other, as are 'C' and 'G'. The reverse complement of a DNA string is the string formed by reversing that, then taking the complement of each symbol (e.g., the reverse complement of "GTCAA" is "TTGAC"). Given: A DNA string. Return: The reverse complement of that string.

    public static String complementDna(String input){
        Map<Character,Character> complementMap = new HashMap<>();
        complementMap.put('A','T');
        complementMap.put('T','A');
        complementMap.put('C','G');
        complementMap.put('G','C');

        StringBuilder sb = new StringBuilder();
        for(char ch: input.toCharArray()){
            if(complementMap.containsKey(ch)){
                sb.append(complementMap.get(ch));
            }
            else{
                throw new IllegalArgumentException("Invalid");
            }
        }

        String complementStr = sb.reverse().toString();

        return complementStr;
    }

    public static void main(String[] args){
        System.out.println(" complement is : " + complementDna("GTCAA"));

    }

}

