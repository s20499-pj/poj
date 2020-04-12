/**
 *Summary: Exercise 23
 *Author: Tomasz Baj s20499
 */

package E23;

public class Test {
    public static void main(String[] args) {
        System.out.println("Shape obj:");
        Shape s1 = new Shape();
        System.out.println(s1.toString());
        Shape s2 = new Shape("blue", false);
        System.out.println(s2.toString());
        s2.setColor("black");
        s2.setFilled(true);
        System.out.println(s2.getColor());
        System.out.println(s2.isFilled());
        System.out.println();

        System.out.println("Circle obj:");
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.2);
        Circle c3 = new Circle(10.12, "purple", true);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
        c1.setRadius(123);
        System.out.println(c1.getRadius());
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println();

        System.out.println("Rectngle obj:");
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(9,16);
        Rectangle r3 = new Rectangle(9, 21, "black", false);
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(r3.toString());
        r1.setWidth(3);
        r1.setLength(4);
        System.out.println(r1.getWidth());
        System.out.println(r1.getLength());
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        System.out.println();

        System.out.println("Square obj:");
        Square sq1 = new Square();
        Square sq2 = new Square(4.2);
        Square sq3 = new Square(2.3, "white", true);
        System.out.println(sq1.toString());
        System.out.println(sq2.toString());
        System.out.println(sq3.toString());
        sq1.setSide(10);
        System.out.println(sq1.getSide());
        sq1.setWidth(21);
        sq1.setLength(32);
        System.out.println(sq1.toString());


    }
}
