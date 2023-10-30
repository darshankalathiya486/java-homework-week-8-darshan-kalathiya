package pool_area;

/**
 * 1. Method named getWidth without any parameters, it needs to return the value of the width
 * field.
 * 2. Method named getLength without any parameters, it needs to return the value of the length
 * field.
 * 3. Method named getArea without any parameters, it needsto return the calculated area (width
 * * length).
 */

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = (width < 0) ? 0 : width;
        this.length = (length < 0) ? 0 : length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return width * length;
    }
}
