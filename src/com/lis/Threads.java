package com.lis;

import java.util.Arrays;

public class Threads {

    private static final Object o = new Object();
    private static final Object oo = new Object();

    public static void main(String[] args) throws InterruptedException {


//        System.out.println(Thread.currentThread());










//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getState());






























//        class MyThread extends Thread {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10; i++) {
//                    try {
//                        Thread.sleep(500);
//                    } catch (InterruptedException ignored) {}
//                    System.out.println(i);
//                }
//                System.out.println("Наш поток все");
//            }
//        }
//
//        new MyThread().start();
//        Thread.sleep(1000);
//        System.out.println("Главный поток все");












//        class MyThread implements Runnable {
//            @Override
//            public void run() {
//                for (int i = 0; i < 5; i++) {
//                    System.out.println(i);
//                }
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException ignored) {}
//                System.out.println("Наш поток все");
//            }
//        }
//
//        Thread thread = new Thread(new MyThread());
//        thread.start();
//        System.out.println("Главный поток все");














//        Thread thread = new Thread(() -> {
//            for (int i = 0; i < 5; i++) {
//                System.out.println(i);
//            }
//            System.out.println("Наш поток все");
//        });
//        thread.start();
//        System.out.println("Главный поток все");




































//        Thread thread = new Thread(() -> {
//            for (int i = 0; i < 10; i++) {
//                System.out.println(i);
////                try {
////                    Thread.sleep(500);
////                } catch (InterruptedException ignored) {}
//            }
//            System.out.println("Наш поток все");
//        });
//
////        thread.setDaemon(true);
//        thread.start();
//        Thread.sleep(2000);
//        System.out.println("Главный поток все");





















//        Thread thread = new Thread(() -> {
//            for (int i = 0; i < 10; i++) {
//                System.out.println(i);
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException ignored) {}
//            }
//            System.out.println("Наш поток все");
//        });
//
//        thread.start();
//        thread.join();
//        System.out.println("Главный поток все");












//        Runnable r = () -> {
////                print();
////                printS();
////                printSB();
//        };
//
//        Thread one = new Thread(r);
//        one.start();
//        Thread second = new Thread(r);
//        second.start();






































//        Thread one = new Thread(Threads::one);
//        one.start();
//        Thread second = new Thread(Threads::two);
//        second.start();


    }






















    private static void print() {
        System.out.println(Thread.currentThread().getName() + "     " + "Inside print");
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "     " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ignored) {}
        }
        System.out.println(Thread.currentThread().getName() + "     " + "Print done.");
    }





    private static synchronized void printS() {
        System.out.println(Thread.currentThread().getName() + "     " + "Inside print");
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "     " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ignored) {}
        }
        System.out.println(Thread.currentThread().getName() + "     " + "Print done.");
    }


    private static void printSB() {
        System.out.println(Thread.currentThread().getName() + "     " + "Inside print");
        synchronized (o) {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "     " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ignored) {}
            }
        }
        System.out.println(Thread.currentThread().getName() + "     " + "Print done.");
    }













    private static void one() {
        System.out.println(Thread.currentThread() + "     " + "inside one ");
        synchronized (o) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignored) {}
            System.out.println(Thread.currentThread() + "     " + "Try to get oo lock");
            synchronized (oo) {
                System.out.println("NEVER");
            }
        }
    }


    private synchronized static void two() {
        System.out.println(Thread.currentThread() + "     " + "inside two");
        synchronized (oo) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignored) {}
            System.out.println(Thread.currentThread() + "     " + "Try to get o lock");
            synchronized (o) {
                System.out.println("NEVER");
            }
        }
    }


}
