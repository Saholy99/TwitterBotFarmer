package com.company;

import java.util.*;
import twitter4j.*;

public class Main{
    public static void main(String[] args) throws Exception {
        Twitter twitter = TwitterFactory.getSingleton();
        //Status status = twitter.updateStatus(latestStatus);
        //System.out.println("Successfully updated the status to [" + status.getText() + "].");

        String[] statuses = {"I need a logo", "I will literally pay someone to write this essay", "I need a wedbsite designer"};

        //prints statuses
        for (int i = 0; i < statuses.length; i++) {
            //twitter.updateStatus(statuses[b]);
            System.out.println(statuses[i]);
        }

        //timer
        long interval = 60;
        interval = interval*60000;
        long oldtime = System.currentTimeMillis()-interval;
        long newtime = System.currentTimeMillis();
        while(true){
            if(newtime - oldtime >= interval){
                int randomNum = (int) (Math.random()*(statuses.length-1));
                twitter.updateStatus(statuses[randomNum]);
                oldtime = System.currentTimeMillis();
            }
            newtime = System.currentTimeMillis();
        }
    }
}