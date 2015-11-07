/**
 * Created by cy on 15-11-8.
 */
public class Cylinder extends Circle {
int height;

    public Cylinder(int r, int height) {
        super(r);
        this.height = height;
    }

     @Override
    double area( ) {
        return super.area()*2+2*pi*r*height;
    }
}
