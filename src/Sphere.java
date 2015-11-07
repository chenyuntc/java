/**
 * Created by cy on 15-11-7.
 */
public class Sphere extends Circle {


    public Sphere(int r) {
        this.r = r;
    }

    @Override
    double area( ) {
        return 4*pi*r*r;
    }


}
