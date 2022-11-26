package com.lis;

import java.util.LinkedList;

public class ProdConsTest_multithreading {

    private static final Integer LIMIT = 12;
    private static final LinkedList<Integer> BUFFER = new LinkedList<>();
    private static volatile boolean consumer = true;
    private static volatile boolean producer = true;

    private static void produce() {
        try {
            int value = 0;
            while (producer) {
                synchronized (BUFFER) {
                    while (BUFFER.size() == LIMIT) {
                        BUFFER.wait();
                    }
                    Thread.sleep(500);
                    System.out.println("Producer produced: " + ++value);
                    BUFFER.add(value);
                    if (value == 30) {
                        producer = false;
                    }
                    BUFFER.notify();
                }
            }
        } catch (InterruptedException ignored) {}
    }

    private static void consume() {
        try {
            while (consumer) {
                synchronized (BUFFER) {
                    while (BUFFER.size() == 0) {
                        BUFFER.wait();
                    }
                    Thread.sleep(500);
                    Integer value = BUFFER.poll();
                    System.out.println("Consumer consumed: " + value);
                    if (value != null && value == 30) {
                        consumer = false;
                    }
                    BUFFER.notify();
                }
            }
        } catch (InterruptedException ignored) {}
    }


    public static void main(String[] args) throws InterruptedException {
        Thread producer = new Thread(ProdConsTest_multithreading::produce);
        Thread consume = new Thread(ProdConsTest_multithreading::consume);
        producer.start();
        consume.start();
        producer.join();
        consume.join();
    }

}
