// 4444444
// 4333334
// 4322234
// 4321234
// 4322234
// 4333334
// 4444444

public class Solution {
    public static void getNumberPattern(int n) {
        for (int i = 1; i <= 2*n-1; i++) {
            for (int j = 1; j <= 2*n-1; j++) {
                int minDistance = Math.min(Math.min(i, j), Math.min((2*n-1) - i + 1,(2* n-1) - j + 1));
                System.out.print((n - minDistance + 1));
            }
            System.out.println();
        }
    }
}
