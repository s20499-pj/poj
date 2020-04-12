/**
 *Summary: Exercise 22
 *Author: Tomasz Baj s20499
 */

package E22;

import java.lang.reflect.Array;

public class MovablePoint extends Point{
    private float xSpeed;
    private float ySpeed;


    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(){
        super();
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] mov = new float[]{getxSpeed(), getySpeed()};
        return mov;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }


    @Override
    public String toString() {
        return "(" + getX()+","+getY()+"),speed=("+ xSpeed + "," + ySpeed + ")";
    }

    public MovablePoint move(){
        setX(getX()+getxSpeed());
        setY(getY()+getySpeed());
        return this;
    }
}
