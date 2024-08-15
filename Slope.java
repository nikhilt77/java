import java.util.Scanner;

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double slope(Point other) {
        if (this.x == other.x) {
            throw new ArithmeticException("Slope is undefined (vertical line)");
        }
        return (other.y - this.y) / (other.x - this.x);
    }
}

public class W04_P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        sc.close();

        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);

        try {
            System.out.println("Slope: " + p1.slope(p2));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
