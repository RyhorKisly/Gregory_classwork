package com.lis.inheritance.figuras.threed.object;

import com.lis.inheritance.figuras.threed.ThreeD;

public class Sphere extends ThreeD {

    private int r;

    public Sphere(int r) {
        this.name = "ThreeD";
        this.r = r;
    }

    public double getVolume() {
        return (4 / 3) * 3.14 * (r * r * r);
    }

    public String toString() {
        return "Parallelepiped{" +
                "R='" + r + '\'' +
                '}';
    }

}
