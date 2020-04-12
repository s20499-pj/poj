/**
 *Summary: Exercise 21
 *Author: Tomasz Baj s20499
 */

package E21;

public class Point3D extends Point2D{
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
        super();
        this.z = 0.0f;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        float[] XY = new float[]{getX(), getY(), this.z};
        return XY;
    }

    public void setXYZ(float x, float y, float z){
        this.setXY(x,y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + getX() +","+ getY() +","+ z +')';
    }
}
