package cylinder;

/**
 * 1. Method named getRadius without any parameters, it needs to return the value of the radius
 * field.
 * 2. Method named getArea without any parameters, it needsto return the calculated area
 * (radius * radius * PI). For PI use Math.PI constant.
 */

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = (radius < 0) ? 0 : radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
