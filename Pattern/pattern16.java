// A
// B B
// C C C

public class Solution {
    public static void alphaRamp(int n) {
        char ch = 'A';
        for (int i = 0; i<n; i++) {
            for (int j = 0; j<=i; j++) {
                System.out.print(ch + " ");
            }
            ch++;
            System.out.println();
        }
    }
}

