//     A
//   A B A
// A B C B A

public class Solution {
    public static void alphaHill(int n) {
        for(int i=0;i<n;i++){
        //space
        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
        }
        //character
        char ch = 'A';
        int breakpoint = (2*i+1)/2;
        for(int j=1;j<=2*i+1;j++){
            System.out.print(ch+" ");
            if(j <= breakpoint) ch++;
            else ch--;
        }
        //space
        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
        }
        System.out.println();}
    }
}
