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
