package com.lis.prodconsTwoAndTaskPlayer.library;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Storage<String> storage = new Storage<>();
        Runnable read = () -> {
            while (true) {
                List<String> list = storage.read();
                System.out.println(Thread.currentThread().getName() + "ReaderRead" + list);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        AtomicInteger counter = new AtomicInteger(1);
        Object o = new Object();
        Runnable writeRead = () -> {
            while (true) {
                if (new Random().nextBoolean()) {
                    List<String> list = storage.read();
                    System.out.println(Thread.currentThread().getName() + "WriterRead" + list);
                } else {
                    synchronized (o) {
                        storage.write(String.valueOf(counter.getAndIncrement()));
                    }
                }
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        executorService.execute(read);
        executorService.execute(read);
        executorService.execute(read);
        executorService.execute(writeRead);
        executorService.execute(writeRead);
        executorService.execute(writeRead);


    }
}
