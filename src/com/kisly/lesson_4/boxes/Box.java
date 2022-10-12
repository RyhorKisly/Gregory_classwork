package com.kisly.lesson_4.boxes;

public class Box {
    private final int x;
    private final int y;
    private final int z;

    public final String NAME = "Box";

    public Box(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void printVolume() {
        System.out.println(this.x * this.y * this.z);
    }


    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getZ() {
        return z;
    }

}
