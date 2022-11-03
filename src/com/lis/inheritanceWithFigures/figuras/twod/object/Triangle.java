package com.lis.inheritance.figuras.twod.object;

import com.lis.inheritance.figuras.twod.Angle;
import com.lis.inheritance.figuras.twod.TwoD;

public class Triangle extends TwoD implements Angle {
    private int a;
    private int b;
    private final int c;
    private static final int ANGEL_COUNT = 3;
    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.name = "Triangle";
    }
    public int getAngles() {
        return ANGEL_COUNT;
    }
    @Override
    public double getArea() {
        return a + b + c;               //Неправильная площадь
    }

    public String toString() {
        return "Square{" +
                "A='" + a + '\'' +
                "B='" + b + '\'' +
                "C='" + c + '\'' +
                '}';
    }

}
