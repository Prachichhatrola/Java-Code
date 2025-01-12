class Main {
    
    static int sumOfDigits(int n){
        int sum = 0;
        while(n != 0){
            int last = n%10; //Extract the last digit
            sum += last;  //Add last digit to sum
            n /= 10;  //Remove the last digit
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int n = 12345;
        System.out.print(sumOfDigits(n));
    }
}
