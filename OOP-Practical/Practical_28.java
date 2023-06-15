class Sphere1 {
    double radius;
    double x;
    double y;
    double z;

    public Sphere1() {
        this.radius = 1.0;
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
    }

    public Sphere1(double radius) {
        this.radius = radius;
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
    }

    public Sphere1(double x, double y, double z, double radius) {
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Center coordinates: (" + x + ", " + y + ", " + z + ")");
    }
}

public class Practical_28 {
    public static void main(String[] args) {
        // Using the first constructor
        Sphere1 sphere1 = new Sphere1();
        sphere1.display();

        System.out.println();

        // Using the second constructor
        double radius = 2.5;
        Sphere1 sphere2 = new Sphere1(radius);
        sphere2.display();

        System.out.println();

        // Using the third constructor
        double centerX = 1.0;
        double centerY = 2.0;
        double centerZ = -1.0;
        double customRadius = 3.0;
        Sphere1 sphere3 = new Sphere1(centerX, centerY, centerZ, customRadius);
        sphere3.display();
    }
}
