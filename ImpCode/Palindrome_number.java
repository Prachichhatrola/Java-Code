public class Solution {
    public static boolean palindromeNumber(int n){
        int org=n;
        int target=0;
        while (n!=0){
            int rem = n%10;
            target = target*10 + rem;
            n/=10;
        }
        return (org==target);
    }
}
