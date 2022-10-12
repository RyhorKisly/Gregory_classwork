package com.kisly.lesson_5.box;

public class Box {

    private int x;
    private int y;
    private int z;

    public Box(int x, int y, int z) {

        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getVolume() {
        return this.x * this.y * this.z;
    }






}
