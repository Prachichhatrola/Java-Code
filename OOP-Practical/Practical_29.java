// 29: Create circle class then derive cylinder class with overriding of  area calculation method.

class Circle2 {
    protected double radius;

    public Circle2(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Cylinder extends Circle2 {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        // Calculate the lateral surface area of the cylinder
        double baseArea = super.calculateArea();
        double lateralArea = 2 * Math.PI * radius * height;
        return 2 * baseArea + lateralArea;
    }

    public double calculateVolume() {
        return super.calculateArea() * height;
    }
}

public class Practical_29 {
    public static void main(String[] args) {
        Circle2 circle = new Circle2(5.0);
        System.out.println("Circle Area: " + circle.calculateArea());

        Cylinder cylinder = new Cylinder(3.0, 8.0);
        System.out.println("Cylinder Area: " + cylinder.calculateArea());
        System.out.println("Cylinder Volume: " + cylinder.calculateVolume());
    }
}
