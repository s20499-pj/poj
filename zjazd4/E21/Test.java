/**
 *Summary: Exercise 21
 *Author: Tomasz Baj s20499
 */

package E21;

import java.util.Arrays;
import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        System.out.println("Point2D obj;");
        Point2D p1 = new Point2D();
        System.out.println(p1.toString());
        Point2D p2 = new Point2D(9281983,982731);
        System.out.println(p2.toString());
        System.out.println(p2.getX());
        System.out.println(p2.getY());
        p2.setX(5656);
        p2.setY(5111);
        System.out.println(Arrays.toString(p2.getXY()));
        p2.setXY(7,8);
        System.out.println(p2.toString());
        System.out.println();

        System.out.println("Point3D obj:");
        Point3D p3 = new Point3D();
        System.out.println(p3.toString());
        Point3D p4 = new Point3D(13, 21, 34);
        System.out.println(Arrays.toString(p4.getXYZ()));
        p4.setZ(3);
        System.out.println(p4.getZ());
        p4.setXYZ(9,8,7);
        System.out.println(p4.toString());



    }
}
