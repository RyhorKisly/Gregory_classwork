package com.lis.box;

import com.lis.box.Box;

import java.util.Arrays;
import java.util.Random;

class Main {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {

        Box[] boxes = createArrayBoxes(5);
        System.out.println(Arrays.toString(boxes));
        int maxVolume = getMaxVolume(boxes);
        System.out.println(maxVolume);

    }

    private static Box[] createArrayBoxes(int count) {
        Box[] boxes = new Box[count];
        for (int i = 0; i < count; i++) {
            boxes[i] = new Box(
                    RANDOM.nextInt(10),
                    RANDOM.nextInt(10),
                    RANDOM.nextInt(10)
            );
        }
        return boxes;
    }

    private  static int getMaxVolume(Box[] boxes){
        int maxVolume = 0;
        for (Box box : boxes){
            int volume = box.getVolume();
            if (maxVolume < volume){
                maxVolume = volume;
            }
        }
        return maxVolume;
    }

}
