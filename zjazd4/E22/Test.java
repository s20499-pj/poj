/**
 *Summary: Exercise 22
 *Author: Tomasz Baj s20499
 */

package E22;

import java.util.Arrays;
import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        System.out.println("Point obj:");
        Point p1 = new Point();
        System.out.println(p1.toString());
        Point p2 = new Point(5,5);
        System.out.println(p2.toString());
        p2.setX(6);
        p2.setY(7);
        System.out.println(p2.getX());
        System.out.println(p2.getY());
        p2.setXY(49218,49121);
        System.out.println(Arrays.toString(p2.getXY()));
        System.out.println();

        System.out.println("MovablePoint obj:");
        MovablePoint mp1 = new MovablePoint();
        System.out.println(mp1.toString());
        MovablePoint mp2 = new MovablePoint(10,11);
        System.out.println(mp2.toString());
        MovablePoint mp3 = new MovablePoint(1000,1000, 54, 72);
        System.out.println(mp3.toString());
        mp3.setxSpeed(14);
        mp3.setySpeed(15);
        System.out.println(mp3.getxSpeed());
        System.out.println(mp3.getySpeed());
        mp3.setSpeed(10000,10000);
        System.out.println(Arrays.toString(mp3.getSpeed()));
        System.out.println(Objects.toString(mp2.move()));
    }
}
