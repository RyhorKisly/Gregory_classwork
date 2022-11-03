package com.lis.inheritance;

import com.lis.inheritance.figuras.twod.Angle;
import com.lis.inheritance.figuras.twod.object.Rectangle;
import com.lis.inheritance.figuras.twod.object.Square;
import com.lis.inheritance.figuras.twod.object.Triangle;
import com.lis.inheritance.storage.HolderForTwoD;

class Main {

    public static void main(String... args) {
        HolderForTwoD<Rectangle> rectangle = new HolderForTwoD<>(new Rectangle(1, 2));
        HolderForTwoD<Square> square = new HolderForTwoD<>(new Square(1));
        HolderForTwoD<Triangle> triangle = new HolderForTwoD<>(new Triangle(1, 2, 3));

        printAngles(rectangle);
        printAngles(square);
        printAngles(triangle);

        System.out.println();

        printRectangle(rectangle);
        printRectangle(square);
    }

    private static void printAngles(HolderForTwoD<? extends Angle> holder) {
         System.out.print(holder.getValue().getAngles());
    }

    private static void printRectangle(HolderForTwoD<? super Square> holder) {
        System.out.println(holder.getValue());
    }


}
