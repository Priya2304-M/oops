abstract class Shape3d {
    abstract double calculateVolume();
    abstract double calculateSurfaceArea();
}

class Sphere extends Shape3d {
    double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    double calculateSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}

class Cube extends Shape3d {
    double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    double calculateVolume() {
        return Math.pow(side, 3);
    }

    @Override
    double calculateSurfaceArea() {
        return 6 * Math.pow(side, 2);
    }
}

public class shape3D {
    public static void main(String[] args) {
        Shape3d sphere = new Sphere(4.0);
        Shape3d cube = new Cube(2.0);

        System.out.println("Priya Darshini");
        System.out.println("AV.SC.U4CSE24221");
        System.out.println("CSE-C");

        System.out.println("Sphere:");
        System.out.println("Volume: " + sphere.calculateVolume());
        System.out.println("Surface Area: " + sphere.calculateSurfaceArea());

        System.out.println("Cube:");
        System.out.println("Volume: " + cube.calculateVolume());
        System.out.println("Surface Area: " + cube.calculateSurfaceArea());
    }
}
