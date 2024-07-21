import java.util.*;
import java.lang.Math;
public class Main {  
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // input value
        int n = scan.nextInt();
        // for counting the length of number
        int count = (int)(Math.log10(n)+1);
        int sum = 0;
        // copy value
        int dup = n;
        while(n>0){
            int lastdigit = n%10;
            sum += Math.pow(lastdigit, count);
            n= n/10;
        }        
            // checking and showing
            if(dup == sum){
                System.out.println(true);
            }else{
                System.out.println(false);
            }
    }
}
