import java.util.Arrays;

public class MathChallenge {

    public static String MathChallenge(String[] strArr) {
        // Parse the input coordinates
        int[] p1 = parsePoint(strArr[0]);
        int[] p2 = parsePoint(strArr[1]);
        int[] p3 = parsePoint(strArr[2]);
        int[] p4 = parsePoint(strArr[3]);

        // Line 1: p1 -> p2
        int a1 = p2[1] - p1[1]; // y2 - y1
        int b1 = p1[0] - p2[0]; // x1 - x2
        int c1 = a1 * p1[0] + b1 * p1[1];

        // Line 2: p3 -> p4
        int a2 = p4[1] - p3[1]; // y4 - y3
        int b2 = p3[0] - p4[0]; // x3 - x4
        int c2 = a2 * p3[0] + b2 * p3[1];

        // Determinant
        int det = a1 * b2 - a2 * b1;

        // Check if lines are parallel (det = 0)
        if (det == 0) {
            return "no intersection";
        }

        // Find intersection point
        int xNumerator = b2 * c1 - b1 * c2;
        int yNumerator = a1 * c2 - a2 * c1;

        // Reduce fractions to lowest terms
        int gcdX = gcd(xNumerator, det);
        int gcdY = gcd(yNumerator, det);

        int xNum = xNumerator / gcdX;
        int xDen = det / gcdX;

        int yNum = yNumerator / gcdY;
        int yDen = det / gcdY;

        // Format output
        String xCoord = "";
        String yCoord = "";
        if ((xNum / xDen) == Math.ceil(xNum*1.00/ xDen)) {

            xCoord = Integer.toString(xNum / xDen);
        }

        else {

            xCoord = (xNum + "/" + xDen);

        }

        if ((yNum / yDen) == Math.ceil(yNum*1.00/ yDen)) {

            yCoord = Integer.toString(yNum / yDen);
        }

        else{
            yCoord = (yNum + "/" + yDen);
        }

        return "(" + xCoord + "," + yCoord + ")";
    }

    // Helper to parse a point
    private static int[] parsePoint(String point) {
        point = point.replace("(", "").replace(")", "").trim();
        return Arrays.stream(point.split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    // Helper to compute the greatest common divisor
    private static int gcd(int a, int b) {
        return b == 0 ? Math.abs(a) : gcd(b, a % b);
    }

    // Main method for testing
    public static void main(String[] args) {
        String[] strArr = {"(9,-2)", "(-2,9)", "(3,4)", "(10,11)"};
        System.out.println(MathChallenge(strArr)); // Output: (9/5,12/5)
    }
}
