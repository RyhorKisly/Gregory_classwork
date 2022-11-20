package com.lis.inheritance.figuras.threed.object;

import com.lis.inheritance.figuras.threed.Rib;
import com.lis.inheritance.figuras.threed.ThreeD;

public class Pyramid extends ThreeD implements Rib {

    private int h;
    private int a;
    private int b;
    private int c;                                           //равные ребра от основания к вершине
    private static final int RIB_COUNT = 8;

    public Pyramid(int h, int a, int b, int c) {
        this.name = "Pyramid";
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getVolume () {

        return (1 / 3) * (a * b) * 1111111;        //вместо 1 нужно поставить h, а перед этим посчитать его
    }

    @Override
    public int getRib() {
        return RIB_COUNT;
    }

    public String toString() {
        return "Parallelepiped{" +
                "A='" + a + '\'' +
                "B='" + b + '\'' +
                "C='" + c + '\'' +
                '}';
    }
}
