package com.lis.inheritance.figuras.twod.object;


import com.lis.inheritance.figuras.twod.Angle;
import com.lis.inheritance.figuras.twod.TwoD;

public class Rectangle extends TwoD implements Angle {
    private static final int ANGLE_COUNT = 4;
    private int a;
    private int b;
    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
        this.name = "Rectangle";
    }

    @Override
    public int getAngles() {
        return ANGLE_COUNT;
    }
    @Override
    public double getArea() {
        return a * b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
