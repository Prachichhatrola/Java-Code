/*30: Write a program that illustrates method overriding. Class Bond is extended by ConvertibleBond. Each of there classes defines a display() method that outputs the string “Bond” of “ConvertibleBond”, respectively. Declare an array to hold six Bond objects. Initialize the elements of the array with a mix of Bond and ConvertibleBond objects. Execute a program loop to invoke the display method of each object. */

class Bond {
    public void display() {
        System.out.println("Bond");
    }
}

class ConvertibleBond extends Bond {
    @Override
    public void display() {
        System.out.println("ConvertibleBond");
    }
}

public class Practical_30 {
    public static void main(String[] args) {
        Bond[] bonds = new Bond[6];
        bonds[0] = new ConvertibleBond();
        bonds[1] = new Bond();
        bonds[2] = new Bond();
        bonds[3] = new ConvertibleBond();
        bonds[4] = new Bond();
        bonds[5] = new ConvertibleBond();

        for (Bond bond : bonds) {
            bond.display();
        }
    }
}

