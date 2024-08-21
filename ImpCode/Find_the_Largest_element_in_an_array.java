public class Solution {

    static int largestElement(int[] arr, int n) {
         
        int max = arr[0];

        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }   
        }
        return max;
    }
}
