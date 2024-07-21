// A B C
// A B
// A

public class Solution {
    public static void nLetterTriangle(int n) {
        for(int i=0;i<n;i++){
            for(char ch = 'A'; ch<='A'+(n-i-1); ch++){
            System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
