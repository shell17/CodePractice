package com.practice;

public class BinarSearchSortedStrings {

    public static int searchString(String[] given,String str, int first, int last){
        if(first > last)
            return -1;
        //find mid
        int mid = (first + last) / 2;
        if(given[mid].equals("")){ //empty string
            int left = mid -1;
            int right = mid+1;
            while(true){
                if(left<first && right>last)
                    return -1;
                else if(!given[left].isEmpty() && left>=first){
                    mid = left;
                    break;
                }
                else if(!given[right].isEmpty() && right<=last){
                    mid = left;
                    break;
                }
                right--;left++;
            }

        }

        //process everytime
        if(given[mid].equals(str)){//found it
            return mid;
        }
        else if(given[mid].compareTo(str) < 0){ //go right
            return searchString(given,str,mid+1,last);
        }
        else{ //go left
            return searchString(given, str,first,mid-1);

        }


    }
    public static void main(String[] args){
        String[] given = {"ab","","abc","","abcd","abcde","","abcdef","abcdefg"};
        if(given == null)
            System.out.println("Error");
        int index = searchString(given,"abcdef",0,given.length-1);
        System.out.println("Index is : " + index);
    }
}
