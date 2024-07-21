// C
// C B 
// C B A

public class Solution {
    public static void alphaTriangle(int n) {
        for(int i=0;i<n;i++){
            char ch=(char)('A'+n-1);
            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
                ch--;
            }
            System.out.println();
        }
    }
}
