class I2 {
    public String getDescription() {
        return "I2";
    }
}

class J2 extends I2 {
    @Override
    public String getDescription() {
        return super.getDescription() + ", J2";
    }
}

class K2 extends J2 {
    @Override
    public String getDescription() {
        return super.getDescription() + ", K2";
    }
}

public class Practical_31 {
    public static void main(String[] args) {
        I2 i2 = new I2();
        J2 j2 = new J2();
        K2 k2 = new K2();

        System.out.println("Description for I2: " + i2.getDescription());
        System.out.println("Description for J2: " + j2.getDescription());
        System.out.println("Description for K2: " + k2.getDescription());
    }
}
