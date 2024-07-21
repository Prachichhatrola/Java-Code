import java.util.ArrayList;
import java.util.List;
public class Solution{
    public static List< Integer > printDivisors(int n) {
        List<Integer> type = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
            type.add(i);
            }
        }
        return type;
    }
}
