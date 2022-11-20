package com.lis.inheritance.figuras.threed.object;

import com.lis.inheritance.figuras.threed.Rib;
import com.lis.inheritance.figuras.threed.ThreeD;

public class Parallelepiped extends ThreeD implements Rib {

    private int a;
    private int b;
    private int c;
    private static final int RIB_COUNT = 12;

    public Parallelepiped(int a, int b, int c) {
        this.name = "Box";
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public double getVolume() {
        return a * b * c;
    }

    public int getRib() {
        return RIB_COUNT;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public String toString() {
        return "Parallelepiped{" +
                "A='" + a + '\'' +
                "B='" + b + '\'' +
                "C='" + c + '\'' +
                '}';
    }

}
