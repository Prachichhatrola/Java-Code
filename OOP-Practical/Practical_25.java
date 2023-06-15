class complex {
    int real, imaginary;

    public complex(int r, int i) {
        this.real = r;
        this.imaginary = i;
    }

    public void showcomplex() {
        System.out.println(this.real + "i" + this.imaginary);
    }

    public complex add(complex n2) {
        complex result = new complex(0, 0);

        // adding real parts of both complex numbers
        result.real = real + n2.real;

        // adding imaginary parts
        result.imaginary = imaginary + n2.imaginary;

        // returning result
        return result;
    }

    public void compare(complex c2) {
        if (real == c2.real && imaginary == c2.imaginary) {
            System.out.println("They are equal");
        } else {
            System.out.println("They are not equal");
        }
    }
}

public class Practical_25 {
    public static void main(String[] args) {

        complex c1 = new complex(5, 6);
        complex c2 = new complex(5, 6);

        System.out.println("First complex Number:");
        c1.showcomplex();

        System.out.println("Second complex Number:");
        c2.showcomplex();

        complex result = c1.add(c2);
        System.out.print("Addition is: ");
        result.showcomplex();

        c1.compare(c2);
    }
}
