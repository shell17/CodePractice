package com.practice;

import java.util.*;

public class SortInHashMap {
    public static void main(String[] args){
        Map<String, Integer> map = new HashMap<>();
        map.put("Shar",3);
        map.put("rayu",4);
        map.put("Nig",1);

        //i need list of entry so i need first set
        Set<Map.Entry<String, Integer>> set = map.entrySet();

        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(set);

        Collections.sort(list, new Comparator<Map.Entry<String,Integer>>(){
            @Override
            public int compare(Map.Entry<String,Integer> o1, Map.Entry<String,Integer> o2){
                return o1.getValue().compareTo(o2.getValue());
            }

        });

        for(Map.Entry<String,Integer> ent : list){
            System.out.println(ent.getValue());
        }

    }


}
