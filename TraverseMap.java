package com.example.helloworld;

import java.util.*;

public class TraverseMap {

    public static void main(String[] args){
        Map<String, Integer> exampleMap = new HashMap<String, Integer>();
        exampleMap.put("a",1);
        exampleMap.put("b",2);
        exampleMap.put("c",3);



        //traversing map using keyset
        Set<String> keys = exampleMap.keySet();
        System.out.println("Values in maps:");
        for(String str: keys){
            System.out.println(" " + exampleMap.get(str));
        }

        //traversing using iterator
        System.out.println("Using iterator");
        Iterator iterator = keys.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //traversing using Map.entry
        Set<Map.Entry<String,Integer>> entrySet = exampleMap.entrySet();
        for(Map.Entry entry: entrySet){
            System.out.println("Key is " + entry.getKey() + " Value is " + entry.getValue());
        }

        Collection<Integer> mapValues = exampleMap.values();

        System.out.println("Values ");
        for(Integer i : mapValues){
            System.out.println(i);
        }

    }
}
