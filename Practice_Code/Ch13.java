package com.company;

class MyThread extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<4){
            System.out.println("My Cooking Thread is Running");
            System.out.println("I am happy!");
            i++;
        }
    }
}
public class Ch13 {
    public static void main(String[] args) {
    MyThread t1 = new MyThread();
    t1.start();
   }
}
