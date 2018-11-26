package com.practice;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args){
        String[] strArr = {"eat", "tea", "tan", "ate", "nat", "bat"};
        groupAnagrams(strArr);
    }

    private static void groupAnagrams(String[] strArr) {
        HashMap<String, List> map = new HashMap<>();
        for(String str: strArr){
            char[] sArr = str.toCharArray();
            Arrays.sort(sArr);
            String key = str.valueOf(sArr);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList());
            }
            map.get(key).add(str);
        }



        List<String> grouped = new ArrayList(map.values());
        Set<Map.Entry<String,List>> entrySet = map.entrySet();

        String[] newArr = new String[strArr.length];

        int resIndex=0;
        for(Map.Entry entry : entrySet){

            List<String> indivGroup = (List<String>) entry.getValue();
            int i =0;
            while( i<indivGroup.size()){
                newArr[resIndex++] = indivGroup.get(i);
                i++;
            }

        }

        System.out.println("Grouped anagrams are: " + Arrays.toString(newArr));
    }

}
