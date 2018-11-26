package com.example.helloworld;

import java.util.*;
import java.util.regex.Pattern;

public class FindWhereIsABinarySearch {
    public static void main(String[] args){
        int a[] = {-5,-3,-1,0,2,3,5,8,23,45,46,56};
        //int x = findSqurt(16);
        //System.out.println("sqrt is : " + x);
         //findIfAIsIndex(a);

        //reverseWords();

        //pangramMissingLetters();
        //missingSequenceLetters();
        //String str = implementSubstring("sharayu", 3,6);

        groupAnagrams();
    }

    private static void missingSequenceLetters() {
        String input = "ABcDF";
        char[] inputArr = input.toUpperCase().toCharArray();

        for(int i =0; i< inputArr.length-1; i++){
            int charDiff = inputArr[i+1] - inputArr[i];
            if( charDiff > 1){
                for(int j=1; j<= charDiff ; j++ ){
                    char ch = (char) (inputArr[i] + j);
                    System.out.println(" " + ch);
                }
            }
        }
    }


    private static void groupAnagrams() {
        String[] givenAnagrams = {"cat","god","act", "tca", "dog"};
        HashMap<String, List> ans = new HashMap<String, List>();
        if(givenAnagrams.length ==0)
            return;
        for(String str: givenAnagrams){
            char[] sArr = str.toCharArray();
            Arrays.sort(sArr);
            String key = str.valueOf(sArr);
            if(!ans.containsKey(key)){
                ans.put(key,new ArrayList());
            }
            ans.get(key).add(str);
        }
        List ansList = new ArrayList(ans.values());


        System.out.println("Grouped anagrams are: \n");
        Set<Map.Entry<String,List>> entrySet =  ans.entrySet();

        for(Map.Entry entry: entrySet){

            List<String> list = (List<String>) entry.getValue();
            for(String str: list){
                System.out.println(" " + str);
            }

        }



/*
        String[] copyOfGiven = Arrays.copyOf(givenAnagrams, givenAnagrams.length);

        String[] dupSortedArr = new String[givenAnagrams.length];
        int[] indexArr = new int[givenAnagrams.length];
        //sort individual
        for(int i =0; i<givenAnagrams.length; i++){
            char[] indivAnagram = givenAnagrams[i].toCharArray();
            Arrays.sort(indivAnagram);
            dupSortedArr[i] = new String(indivAnagram);
            indexArr[i] = i;

        }
        //sort all but store index somewhere
        Arrays.sort(dupSortedArr);


        //group and refer with index
        for(int i =0; i< givenAnagrams.length; i++){
            if(dupSortedArr[i].equals(dupSortedArr[i+1])){
        //        System.out.println(givenAnagrams[dupSortedArr[i]]);
            }
        }
*/
    }

    private static String implementSubstring(String origStr, int beginIndex, int endIndex) {

        char[] strArr = origStr.toCharArray();
        char[] substr = new char[(endIndex-beginIndex) + 1];
        int k =0;
        for(int i=beginIndex; i< endIndex; i++){
            substr[k++] = strArr[i];
        }
        String str = new String(substr);
        return str;

    }

    private static void pangramMissingLetters() {
        String str = "The sky is blue";
        String str2 = str.toLowerCase().trim().replaceAll(" ", "");
        boolean[] charPresent = new boolean[26];

        //Arrays.fill(charPresent, false);
        char[] strArr = str2.toCharArray();

        for(int i=0; i< strArr.length; i++){
                charPresent[strArr[i] - 'a'] = true;

        }

        StringBuffer pangramMissingLetters = new StringBuffer();


        for(int i =0; i<26; i++){
            if(!charPresent[i]){
                char ch = (char) (i+ 'a');
                pangramMissingLetters.append(ch);
            }
        }
        System.out.println("Pangram missing: " + pangramMissingLetters);

    }



    private static void reverseWords() {
        String str = "The sky is blue";

        //Pattern pattern = Pattern.compile("//s+");
        //String[] words = pattern.split("//s+");
        String[] words = str.split("\\s+");
        StringBuffer sb = new StringBuffer();
        for(int i =words.length-1; i>= 0; i--) {
            sb.append(words[i]);
            sb.append(" ");
        }

        System.out.println("Reverse string is : " + sb.toString());
        sb.toString().trim();
    }

    public static void findIfAIsIndex(int[] a){
          int start =0, end = a.length;
          int mid=0;
          while(start < end){

          }
    }


    public static int findSqurt(int num){
        if(num == 0 | num == 1){
            return num;
        }
        int start =1, end = num, mid =0;

        int ans =0;

        while(start< end){
            mid = (start+end)/2;
            if(mid * mid == num){
                return mid;
            }
            if(mid * mid < num){
                start = mid + 1;
                ans = mid;
            }
            else{
                end = mid -1;
            }

        }
        return ans;

    }

}
