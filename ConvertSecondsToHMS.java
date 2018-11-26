package com.practice;

public class ConvertSecondsToHMS {


    public static void main(String[] args){
        int T = 60;
        String time = findHMS(T);
        System.out.println("Time: " + time);
    }

    private static String findHMS(int T) {

        int hour=0,min=0,seconds=0;
        if(T>60){
            min = T/60;
            seconds = T%60;
            if(min>60){
                hour = min/60;
                min = min %60;

            }
            else if(min == 60){
                hour = 1;
                min = 0;
            }

        }
        else if(T == 60){
            min = 1;
            seconds = 0;
        }
        else
            seconds = T;

        return (hour + "h" + min + "m" + seconds + "s");
    }
}
