/**
 *Summary: Exercise 05_02
 *Author: Tomasz Baj s20499
 */

package E05_02;

public class MyCircle {

        private MyPoint center;
        private int radius = 1;

        public MyCircle() {
        }

        public MyCircle(int x, int y, int radius) {
            this.center = new MyPoint(x, y);
            this.radius = radius;
        }

        public MyCircle(MyPoint center, int radius) {
            this.center = center;
            this.radius = radius;
        }

        public int getRadius() {
            return this.radius;
        }
        public void setRadius(int radius) {
            this.radius = radius;
        }
        public MyPoint getCenter() {
            return this.center;
        }
        public void setCenter(MyPoint center) {
            this.center = center;
        }
        public int getCenterX() {
            return center.getX();
        }
        public void setCenterX(int x) {
            this.center.setX(x);
        }
        public int getCenterY() {
            return center.getY();
        }
        public void setCenterY(int y) {
            this.center.setY(y);
        }
        public int[] getCenterXY() {
            return new int[]{center.getX(), center.getY()};
        }
        public void setCenterXY(int x, int y) {
            this.center.setXY(x, y);
        }
        public String toString(){
        return "MyCircle[radius=" +
                this.radius +
                ", center =" +
                getCenterXY() +
                "]";
        }
        public double getArea(){
            double area = Math.PI * (radius * radius);
            return area;
        }
        public double getCircumference(){
            double circumference = Math.PI * radius * 2;
            return circumference;
        }
        public double distance (MyCircle other){
            return center.distance(other.center);
        }
}