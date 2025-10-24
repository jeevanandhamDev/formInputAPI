package com.interview.formInput;

public class ThreadTest extends Thread{

    public void run()
    {
        for(int i=0;i<=100;i++){
            System.out.println("Thread 1: "+i);
        }
    }

    public static void main(String args[]){
        ThreadTest tt=new ThreadTest();
        SecondThread st=new SecondThread();

        tt.start();
        st.start();

    }
}
