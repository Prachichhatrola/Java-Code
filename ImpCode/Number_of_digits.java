public class Solution {
    public static int countDigits(int n){
        int digits = (int) Math.floor(Math.log10(n) + 1);
        return digits;
    }
}
