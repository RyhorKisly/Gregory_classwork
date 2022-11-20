package com.lis.inheritance.figuras.twod.object;

import com.lis.inheritance.figuras.twod.TwoD;

public class Circle extends TwoD {

    private final int r;

    public Circle(int r) {
        this.name = "Circle";
        this.r = r;
    }

    @Override
    public double getArea() {
        return 3.14 * (r * r);
    }

    public int getR() {
        return r;
    }

    public String toString() {
        return "Rectangle{" +
                "r=" + r +
                '}';
    }
}
