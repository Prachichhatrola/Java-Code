// * * * * * * 
// * *     * * 
// *         * 
// *         * 
// * *     * * 
// * * * * * * 

public class Solution {
    public static void symmetry(int n) {
        int is = 0;
          for(int i=1;i<=n;i++){
            // star
            for(int j=1;j<=(n-i+1);j++){
                System.out.print("* ");
            }
            // space 
            for(int j=1;j<is;j++){
                System.out.print(" ");
            }
            // star
            for(int j=1;j<=(n-i+1);j++){
                System.out.print("* ");
            }
            is+=2;
            System.out.println();
        }
            for(int i=1;i<=n;i++){
            // star
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //space
            for(int j = 1;j<is;j++){
                System.out.print(" ");
            }
             // star
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            is-=2;
            System.out.println();
    }
    }
}
