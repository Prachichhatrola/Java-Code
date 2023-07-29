// 24: Write a program to create circle class with area function to find area of circle.

class circle{
    float redius;
    float pie = 3.14f;

    public float area(){
        return (pie * redius *redius);
    }
}
public class Practical_24 {
    public static void main(String[] args) {
        circle crl = new circle();
        crl.redius = 5;
        System.out.println(crl.area());
    }
}

