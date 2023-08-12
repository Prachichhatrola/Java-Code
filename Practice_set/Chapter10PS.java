package com.company;

class Circle2 {

    int radius;

    Circle2(int radius)

    {

        this.radius = radius;

    }

    double area()

    {

        return Math.PI * this.radius * this.radius;

    }

}

class Cylinder2 extends Circle2

{

    private int height;

    Cylinder2(int radius, int height)

    {

        super(radius);

        this.height = height;

    }

    double volume()

    {

        return Math.PI * this.radius * this.radius * height;

    }

}

// Problem 2 & 4

class Rectangle4

{

    private int length;

    private int width;

    Rectangle4(int length, int width)

    {

        this.length = length;

        this.width = width;

    }

    int area()

    {

        return length * width;

    }

    int getLength()

    {

        return length;

    }

    int getWidth()

    {

        return width;

    }

}

class Cuboid extends Rectangle4

{

    int height;

    Cuboid(int length, int width, int height)

    {

        super(length, width);

        this.height = height;

    }

    int volume()

    {

        return getLength() * getWidth() * height;

    }

    int surfaceArea()

    {

        return 2 * (getWidth() * getLength() + height * getLength() + height * getWidth());

    }

}

public class Chapter10PS {

    public static void main(String[] args) {

        Cylinder2 obj = new Cylinder2(10, 5);

        System.out.println("Problem: 1 & 3");

        System.out.println("Area of Circle: " + obj.area());

        System.out.println("Volume of Cylinder: " + obj.volume());

        Cuboid obj2 = new Cuboid(10, 20, 30);

        System.out.println("\nProblem: 2 & 4");

        System.out.println("Area of Rectangle: " + obj2.area());

        System.out.println("Volume of Cuboid: " + obj2.volume());

        System.out.println("Surface Area of Cuboid: " + obj2.surfaceArea());

        System.out.println("\nProblem: 5");

        System.out.println("Base\n\tDerived1\n\t\tDerived2");

    }

}
