/**
 *Summary: Exercise 05_02
 *Author: Tomasz Baj s20499
 */

package E05_02;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint() {
    }
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY() {
        int[] result = {x, y};
        return result;
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "(" +
                this.x +
                "," +
                this.y +
                ")";
    }

    public double distance(int x, int y){
        double distance = Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y,2));
        return distance;
    }

    public double distance(MyPoint anotherMyPoint){
        double distance = Math.sqrt(Math.pow(anotherMyPoint.x - this.x, 2) + Math.pow(anotherMyPoint.y - this.y,2));
        return distance;
    }

    public double distance(){
        double distance = Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y,2));
        return distance;
    }
}