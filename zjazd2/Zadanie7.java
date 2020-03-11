/*
Summary: Zadanie 7 triangle
Author: Tomasz Baj s20499
 */
public class Zadanie7 {
    public static void main(String[] args) {
        class Triangle{
            float a, b, c;

            public float getA() {
                return a;
            }

            public void setA(float a) {
                this.a = a;
            }

            public float getB() {
                return b;
            }

            public void setB(float b) {
                this.b = b;
            }

            public float getC() {
                return c;
            }

            public void setC(float c) {
                this.c = c;
            }

            public float getField() {
                float p = (a+b+c)/2;
                float field = (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
                return field;
            }

            public float getCircuit(){
                return a+b+c;
            }
            public boolean isEquilateral(){
                if(a==b && a==c) return true;
                else return false;
            }
            public boolean isIsosceles(){
                if(a==b || a==c || b==c) return true;
                else return false;
            }
            public boolean isScalene(){
                if(isIsosceles()==false) return true;
                else return false;
            }
        }
    }
}
