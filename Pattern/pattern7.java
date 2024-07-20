//   *
//  ***
// *****

public class Solution {
    public static void nStarTriangle(int n) {
        
       /*  for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }  */

        for(int i=0; i<n; i++){
            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //star
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
