package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Meeting {
    public Meeting() {

    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    private int startTime;
    private int endTime;

    Meeting(int startTime,int endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public List<Meeting> mergeMeetingRanges(List<Meeting> given){

        List<Meeting> sortedMeeting = new ArrayList<>();
        for(Meeting mtg : given){
            Meeting mtgCopy = new Meeting(mtg.getStartTime(),mtg.getEndTime());
            sortedMeeting.add(mtgCopy);
        }
        Collections.sort(sortedMeeting, new Comparator<Meeting>(){
            @Override
            public int compare(Meeting m1, Meeting m2){
                return m1.getStartTime() - m2.getStartTime();
            }
        });

        return sortedMeeting;


    }
    public static void main(String[] args){
        List<Meeting> given = new ArrayList<>();
        given.add(new Meeting(0,1));
        given.add(new Meeting(3,5));
        given.add(new Meeting(4,8));
        given.add(new Meeting(10,12));
        given.add(new Meeting(9,10));
        Meeting meeting = new Meeting();
        List<Meeting> merged = meeting.mergeMeetingRanges(given);


    }

}
