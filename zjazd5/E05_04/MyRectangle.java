/**
 *Summary: Exercise 05_04
 *Author: Tomasz Baj s20499
 */

package E05_04;

public class MyRectangle {

    private MyPoint topleft;
    private MyPoint topright;
    private MyPoint bottomright;
    private MyPoint bottomleft;


    public MyRectangle(int x1, int y1, int x2, int y2){
        this.topleft = new MyPoint(x1,y1);
        this.topright = new MyPoint(x2,y1);
        this.bottomright = new MyPoint(x2,y2);
        this.bottomleft =new MyPoint(x1,y2);
    }
    public MyRectangle(MyPoint topleft, MyPoint bottomright) {
        this.topleft = topleft;
        this.topright = new MyPoint(bottomright.getX(),topleft.getY());
        this.bottomright = bottomright;
        this.bottomleft =new MyPoint(topleft.getX(),bottomright.getY());
    }

    public String toString(){
        return "MyRectangle: TopLeft = (" +
                this.topleft.getX() + "," +
                this.topleft.getY() + ")"
                + ", TopRight = (" +
                this.topright.getX() + "," +
                this.topright.getY() + ")"
                + ", BottomLeft = (" +
                this.bottomleft.getX() + "," +
                this.bottomleft.getY() + ")"
                + ", BottomRight = (" +
                this.bottomright.getX() + "," +
                this.bottomright.getY() + ")";
    }

    public int getHeight(){
        int height = this.topleft.getY() - this.bottomleft.getY();
        return height;
    }
    public int getWidth(){
        int width = this.topright.getX() - this.topleft.getX();
        return width;
    }
    public int getArea(){
        int area = this.getHeight() * this.getWidth();
        return area;
    }
    public int getCircumference(){
        int circumference = (2*this.getWidth()) + (2*this.getHeight());
        return circumference;
    }
    public int getDiagonal(){
        int diagonal = (int) Math.sqrt((Math.pow(getHeight(),2) + Math.pow(getWidth(),2)));
        return diagonal;
    }
}
