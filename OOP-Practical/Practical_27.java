class circle1 {
    double radious;
    double x;
    double y;

    public circle1(double radious, double x, double y) {
        this.radious = radious;
        this.x = x;
        this.y = y;
    }

    public circle1(double radious) {
        this.radious = radious;
    }

    public void display() {
        System.out.println("Radious is: " + radious);
        System.out.println("Co-x: " + x);
        System.out.println("Co-y: " + y);
    }
}

public class Practical_27 {
    public static void main(String[] args) {

        circle1 c1 = new circle1(15);
        circle1 c2 = new circle1(10, 5, 3);

        System.out.println("The result of 1st constructor");
        c1.display();
        System.out.println("The result of 2nd constructor");
        c2.display();
    }
}