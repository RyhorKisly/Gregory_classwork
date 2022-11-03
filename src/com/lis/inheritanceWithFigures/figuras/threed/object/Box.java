package com.lis.inheritance.figuras.threed.object;

public class Box extends Parallelepiped {

    private int a;

    public Box(int a) {
        super(a, a, a);
        this.name = "Box";
    }

    public String toString() {
        return "Parallelepiped{" +
                "A='" + super.getA() + '\'' +
                "B='" + super.getB() + '\'' +
                "C='" + super.getC() + '\'' +
                '}';
    }

}
