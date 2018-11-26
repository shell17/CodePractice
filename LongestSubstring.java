package com.example.helloworld;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public static String findLongestSubstring(String str) {
        Map<Character, Integer> characterMap = new HashMap<>();
        char[] strArr = str.toCharArray();

        String longestSub = "";
        String longestSubTillNow = "";

        for (char ch : strArr) {
            if (!characterMap.containsKey(ch)) {
                characterMap.put(ch, 1);
                longestSubTillNow = longestSubTillNow + ch;
            } else {
                characterMap.put(ch, characterMap.get(ch) + 1);
                if (longestSubTillNow.length() > longestSub.length()) {
                    longestSub = longestSubTillNow;
                }
                longestSubTillNow = "";
                characterMap.clear();
            }

            //further
        }
        if (longestSubTillNow.length() > longestSub.length()) {
            longestSub = longestSubTillNow;
        }
        return longestSub;

    }

    public static void main(String[] args) {
        String str = "abadefghdab";
        String longestSubstring = findLongestSubstring(str);
        System.out.println("Longest sub : " + longestSubstring);
    }
}
