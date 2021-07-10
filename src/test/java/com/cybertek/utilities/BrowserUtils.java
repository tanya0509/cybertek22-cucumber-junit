package com.cybertek.utilities;

public class BrowserUtils {
    public static void sleep(int seconds) {
        seconds*=1000;


        try{
            Thread.sleep(seconds);
        }catch (InterruptedException e){
            System.out.println("something happened in the sleep method");
        }


    }
}
