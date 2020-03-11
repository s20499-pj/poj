/*
Summary: Zadanie 6 rectangle
Author: Tomasz Baj s20499
 */
public class Zadanie6 {
    public static void main(String[] args) {
        class Rectangle {
            int length, width;

            public int getLength() {
                return length;
            }

            public void setLength(int length) {
                this.length = length;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public int getField(int length, int width) {
                return length * width;
            }

            public int getCircuit(int length, int width) {
                return length * 2 + width * 2;
            }

            public float getDiagonal(int length, int width) {
                float diagonal = (float) Math.sqrt(length * length + width * width);
                return diagonal;
            }
        }
    }
}
