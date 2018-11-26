package com.PracticeAgain;

import java.util.*;

public class SortHashMap {

    public static void main(String[] args){
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("Sha",1);
        map.put("Fha",2);
        map.put("Rha",3);
        map.put("Nha",4);

        //sortHashMapByKeys(map);
        sortUsingTreemap(map);
    }

    private static void sortUsingTreemap(Map map) {
        TreeMap<String,Integer> treemap = new TreeMap<>(map);
        for(Map.Entry<String,Integer> entry : treemap.entrySet()){
            System.out.print(" " + entry.getKey());
            System.out.print(" ->  " + entry.getValue());
            System.out.println();

        }
    }

    private static void sortHashMapByKeys(Map map) {

        List<String> sortedKeys = new ArrayList<>();
        sortedKeys.addAll(map.keySet());
        Collections.sort(sortedKeys);

        System.out.println("sorted: ");
        for(String s : sortedKeys){
            System.out.println(" " + s);
        }
    }
}
