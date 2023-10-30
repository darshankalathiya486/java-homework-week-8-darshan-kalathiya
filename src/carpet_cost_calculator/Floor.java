package carpet_cost_calculator;

/**
 * 1. The Carpet Company has asked you to write an application that calculates the price of carpeting for
 * rectangular rooms.
 * 2. To calculate the price, you multiply the area of the floor (width times length) by the
 * price per square meter of carpet.
 * 3. For example, the area of the floor that is 12 meters long and 10
 * meters wide is 120 square meters.
 * 4.  To cover the floor with a carpet that costs $8 per square meter
 * would cost $960.
 */

public class Floor {
    private double width;
    private double length;

    // constructor
    public Floor(double width, double length) {
        this.width = (width < 0) ? 0 : width;
        this.length = (length < 0) ? 0 : length;
    }

    public double getArea() {
        return width * length;
    }
}
