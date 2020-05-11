/**
 *Summary: Exercise 05_04
 *Author: Tomasz Baj s20499
 */

package E05_04;

public class Main {

    public static void main(String[] args) {
        MyRectangle rectangle = new MyRectangle(4,12,10,3);
        System.out.println(rectangle.toString());
        System.out.println(rectangle.getHeight());
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getCircumference());
        System.out.println(rectangle.getDiagonal());

        System.out.println();

        MyPoint pkt1= new MyPoint(10,3);
        MyPoint pkt2= new MyPoint(4,12);
        MyRectangle rectangle2 = new MyRectangle(pkt1,pkt2);
        System.out.println(rectangle2.toString());
        System.out.println(rectangle2.getHeight());
        System.out.println(rectangle2.getWidth());
        System.out.println(rectangle2.getArea());
        System.out.println(rectangle2.getCircumference());
        System.out.println(rectangle2.getDiagonal());
    }
}
