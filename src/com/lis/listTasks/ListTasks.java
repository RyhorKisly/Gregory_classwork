package com.lis;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ListTasks {
    private static final Random RANDOM  = new Random();

    public static void main(String[] args) {
        List<Box> boxes = generateBoxes(10);
//        List<Box> whereXBiggerThanTen = getByXValue(10, boxes);
//        List<Box> getByWhereValueMoreThanX = getByWhereValueMoreThanX(10, boxes);
//        System.out.println(whereXBiggerThanTen);
//        System.out.println(getByWhereValueMoreThanX);

        removeOddVolume(boxes);
        System.out.println(boxes);
    }
    public static List<Box> getByXValue(int x, List<Box> boxes) {
        List<Box> result = new ArrayList<>();
        for (Box b: boxes) {
            if (b.getX() > x) {
                result.add(b);
            }
        }
        return result;
    }
    public static List<Box> getByWhereValueMoreThanX(int x, List<Box> boxes) {
        List<Box> result = new ArrayList<>();
        for (Box b: boxes) {
            if (b.volume() > x) {
                result.add(b);
            }
        }
        return result;
    }

    public static void removeOddVolume(List<Box> boxes) {
        Iterator<Box> iterator = boxes.iterator();
        while (iterator.hasNext()) {
            Box box = iterator.next();
            if (box.volume() % 2 != 0) {
                iterator.remove();
            }
        }
    }


    public static List<Box> generateBoxes(int count) {
        List<Box> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            result.add(new Box(
                    RANDOM.nextInt(20),
                    RANDOM.nextInt(20),
                    RANDOM.nextInt(20)
                 )
            );
        }
        return result;
    }
}
