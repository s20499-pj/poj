/**
 *Summary: Exercise 23
 *Author: Tomasz Baj s20499
 */

package E23;

public class Square extends Rectangle{

    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public double getSide(){
        return getWidth();
    }

    public void setSide(double side){
        this.setLength(side);
        this.setWidth(side);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }


    @Override
    public String toString() {
        return "Square{width="+getWidth()+",length="+getLength()+"}";
    }
}
