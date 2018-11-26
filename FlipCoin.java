package com.PracticeAgain;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class FlipCoin {
//DOESNT WORK

    public static void main(String[] args){
        int timeInterval = 1000;
        Timer timer = new Timer();
        timer.schedule(new Flip(), 120);

    }

}
class Flip extends TimerTask{

    @Override
    public void run() {
        Random r = new Random();
        int flip = r.nextInt(2);
        if(flip == 0){
            System.out.println("Heads");
        }
        else{
            System.out.println("Tails");
        }

    }
}
