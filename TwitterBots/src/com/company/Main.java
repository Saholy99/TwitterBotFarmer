package com.company;

import java.util.*;
import twitter4j.*;

public class Main{
    public static void main(String[] args) throws Exception {
        Twitter twitter = TwitterFactory.getSingleton();
        //Status status = twitter.updateStatus(latestStatus);
        //System.out.println("Successfully updated the status to [" + status.getText() + "].");

        String[] statuses = {"I need a logo", "I will literally pay someone to write this essay", "I need a website designer", "I need to design a logo", "I need a logo for my website"};

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
        int counter = 0;
        while(true){
            if(newtime - oldtime >= interval){
                twitter.updateStatus(statuses[counter % 3]);
                oldtime = System.currentTimeMillis();
                counter++;
            }
            newtime = System.currentTimeMillis();
        }
    }
}
