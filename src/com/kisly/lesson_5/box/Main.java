package com.kisly.lesson_5.box;

import java.util.Random;

public class Main {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {

        int maxVolume = getMaxVolume(createArrayBox(5));
        System.out.println(maxVolume);

    }


    private static Box[] createArrayBox(int count) {
        Box[] boxes = new Box[count];
        for(int i = 0; i < boxes.length; i++) {
            boxes[i] = new Box(
                    RANDOM.nextInt(10),
                    RANDOM.nextInt(10),
                    RANDOM.nextInt(10));
        }
        return boxes;
    }

    private static int getMaxVolume(Box[] boxes) {
        int maxVolume = 0;
        for (Box box : boxes) {
            int volume = box.getVolume();
            if (maxVolume < volume) {
                maxVolume = volume;
            }
        }
        return maxVolume;
    }

}
