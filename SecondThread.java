package com.interview.formInput;

public class SecondThread extends Thread {
    public void run(){
        for(int i=500;i<=600;i++){
            System.out.println("Thread 2: "+i);
        }
    }
}
