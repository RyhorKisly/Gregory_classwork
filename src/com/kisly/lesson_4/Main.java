package com.kisly.lesson_4;

import com.kisly.lesson_4.boxes.Box;

public class Main {
    public static void main(String[] args) {

        Box box = new Box(2, 1, 6);
        Box box2 = new Box(5,3,4);

        System.out.println(box.NAME);

        box.printVolume();
        box2.printVolume();
        System.out.println(box2.getX());

    }
}
