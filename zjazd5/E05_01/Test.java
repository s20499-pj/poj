/**
 *Summary: Exercise 05_01
 *Author: Tomasz Baj s20499
 */

package E05_01;

public class Test {

    public static void main(String[] args) {
        MyPoint[] points = new MyPoint[10];
        for (int i=0; i < points.length; i++) {
            points[i] = new MyPoint(i+1, i+1);
        }
        System.out.println(points[4].distance());
        System.out.println(points[5].distance(1, 1));
        System.out.println(points[6].distance(points[1]));
    }
}