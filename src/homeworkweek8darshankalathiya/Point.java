package homeworkweek8darshankalathiya;

/**
 * Write a programme to find a distance between points A(xA,yA) and B(xB,yB), we use the formula:
 * d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
 * Where √ representssquare root.
 */

public class Point {
    private int x;
    private int y;

    public Point() {
        // No-arg constructor, initializes x and y to 0.
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        // Constructor with parameters, initializes x and y based on the provided values.
        this.x = x;
        this.y = y;
    }

    public int getX() {
        // Method to get the value of the x field.
        return x;
    }

    public int getY() {
        // Method to get the value of the y field.
        return y;
    }

    public void setX(int x) {
        // Method to set the value of the x field.
        this.x = x;
    }

    public void setY(int y) {
        // Method to set the value of the y field.
        this.y = y;
    }

    public double distance() {
        // Method to calculate the distance between this Point and Point (0,0).
        return Math.sqrt(x * x + y * y);
    }

    public double distance(int x, int y) {
        // Method to calculate the distance between this Point and Point (x, y).
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double distance(Point another) {
        // Method to calculate the distance between this Point and another Point.
        int xDiff = this.x - another.getX();
        int yDiff = this.y - another.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);

        System.out.println("distance(0,0) = " + first.distance());
        System.out.println("distance(second) = " + first.distance(second));
        System.out.println("distance(2,2) = " + first.distance(2, 2));

        Point point = new Point();
        System.out.println("distance() = " + point.distance());
    }

}
