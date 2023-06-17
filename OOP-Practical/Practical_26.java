/*26: Write an application that declares a class named Sphere. It should have instance variables to record its radius and the coordinates of its center. This should be of type double. Use the new operator to create a Sphere object. Set and display its instance variables. */

class sphere{
    double radious;
    double x;
    double y;

    public double getRadious() {
        return radious;
    }
    public void setRadious(double radious) {
        this.radious = radious;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
}
public class Practical_26 {
    public static void main(String[] args) {

        sphere sp = new sphere();
        sp.radious = 10;
        sp.x = 5;
        sp.y = 6;

        System.out.println("radious:" +sp.radious);
        System.out.println("co-x:" +sp.x);
        System.out.println("co-y:" +sp.y);

        
    }
}
