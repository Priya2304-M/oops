interface Shape {
    double getPerimeter();
}
class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
class Triangle implements Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }
}
public class perimeter {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(23, 4);
        Shape circle = new Circle(4);
        Shape triangle = new Triangle(23, 4, 7);
        System.out.println("priya darshini,AV.SC.U4CSE24221,CSE-C");
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
        System.out.println("Triangle Perimeter: " + triangle.getPerimeter());
    }
}
