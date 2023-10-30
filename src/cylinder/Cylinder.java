package cylinder;

/**
 * 1. Method named getHeight without any parameters, it needs to return the value of height
 * field.
 * 2. Method named getVolume without any parameters, it needsto return the calculated volume.
 * To calculate volume, multiply the area with height.
 */

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = (height < 0) ? 0 : height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}
