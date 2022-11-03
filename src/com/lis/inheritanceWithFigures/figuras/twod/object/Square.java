package com.lis.inheritance.figuras.twod.object;

public class Square extends Rectangle {
    public Square(int a) {
        super(a, a);
        this.name = "Square";
    }

    @Override
    public String toString() {
        return "Square{" +
                "A='" + super.getA() + '\'' +
                "B='" + super.getB() + '\'' +
                '}';
    }
}
