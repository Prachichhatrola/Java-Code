// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    static int firstRepeatingElement(int[] arr, int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
              if(arr[i]==arr[j]){
                return i;
               }
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
       int[] arr = {10, 5, 3, 4, 5, 1};
       int n = arr.length;
       
       int index = firstRepeatingElement(arr, n);
       
       if(index == -1){
           System.out.print("No Repeating Element");
       }
       else{
           System.out.print("First Repeating Element Index is: "+index);
       }
    }
}
