public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        if (isPrime(n)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

/* 
class Main {
    public static void main(String[] args) {
        int num = 29;
        boolean isPrime = true;
        for(int i=2;i<num;i++){
            if(num%i==0){
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime);
    }
} 
*/
