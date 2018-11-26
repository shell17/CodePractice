package com.example.helloworld;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args){
        String str = "helhemlo";
        Map<Character, Integer> characterMap = new HashMap<>();
        for(int i=0; i< str.length(); i++){
            char ch = str.charAt(i);
            if(!characterMap.containsKey(ch)){
                characterMap.put(ch,1);
            }
            else{
                characterMap.put(ch, characterMap.get(ch)+1);
            }
        }

        for(int i =0;i<str.length(); i++){
            if(characterMap.get(str.charAt(i)) == 1){
                System.out.println("Nonrepeating : " +  str.charAt(i));
                break;
            }
        }
    }
}
