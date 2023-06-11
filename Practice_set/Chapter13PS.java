package com.company;

class PracticeThread1 extends Thread {

    @Override

    public void run() {

        while (true) {

            try {

                Thread.sleep(200);

            } catch (Exception e) {

                System.out.println(e);

            }

            System.out.println("Good Morning");

        }

    }

}

class PracticeThread2 extends Thread {

    @Override

    public void run() {

        while (true) {

            try {

                Thread.sleep(200);

            } catch (Exception e) {

                System.out.println(e);

            }

            System.out.println("Welcome");

        }

    }

}

public class Chapter13PS {

    public static void main(String[] args) {

        // 1. Question

        PracticeThread1 mythr1 = new PracticeThread1();

        PracticeThread2 mythr2 = new PracticeThread2();

        // mythr1.setPriority(10);

        // mythr2.setPriority(9);

        System.out.println(mythr1.getPriority());

        System.out.println(mythr2.getPriority());

        mythr1.start();

        mythr2.start();

        System.out.println(Thread.currentThread().getState());

    }

}