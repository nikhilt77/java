import java.util.*;

interface Shape {
    void getArea();
}

class Rectangle implements Shape {
    private int length;
    private int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void getArea() {
        System.out.println("Rectangle Area: " + (length * breadth));
    }
}

class Circle implements Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public void getArea() {
        System.out.println("Circle Area: " + (3.14 * radius * radius));
    }
}

class Triangle implements Shape {
    private double base;
    private double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public void getArea() {
        System.out.println("Triangle Area: " + (0.5 * base * height));
    }
}

public class Interface1 {
    public static void main(String[] args) {
        Scanner P = new Scanner(System.in);

        System.out.println("Enter Dimensions of Rectangle:");
        int length = P.nextInt();
        int breadth = P.nextInt();
        Shape rect = new Rectangle(length, breadth);
        rect.getArea();

        System.out.println("Enter dimensions of Circle:");
        double radius = P.nextDouble();
        Shape circle = new Circle(radius);
        circle.getArea();

        System.out.println("Enter Dimensions of Triangle:");
        double base = P.nextDouble();
        double height = P.nextDouble();
        Shape triangle = new Triangle(base, height);
        triangle.getArea();
    }
}
