import java.util.Arrays;
public class Chapter6PS {
    public static void main(String[] args) {

        // Q-1 : Create an array of 5 floats and calculate their sum.

        /*
         * float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
         * float sum = 0;
         * for(float element:marks){
         * sum = sum + element;
         * }
         * System.out.println("The value of sum is " + sum);
         */

        // Q-2 : Write a program to find out whether a given integer is present in an
        // array or not.

        /*
         * float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
         * float num = 45.7f;
         * boolean isInArray = false;
         * for(float element:marks){
         * if(num==element){
         * isInArray = true;
         * break;
         * }
         * }
         * if(isInArray){
         * System.out.println("The value is present in the array");
         * }
         * else{
         * System.out.println("The value is not present in the array");
         * }
         */

        // Q-3 : Calculate the average marks from an array containing marks of all
        // students in physics using for-each loop.

        /*
         * float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
         * float sum = 0;
         * for(float element:marks){
         * sum = sum + element;
         * }
         * System.out.println("The value of average marks is " + sum/marks.length);
         */

        // Q-4 : Create a java program to add two matrices of size 2*3.

        /*
         * int [][] mat1 = {{1, 2, 3},
         * {4, 5, 6}};
         * int [][] mat2 = {{2, 6, 13},
         * {3, 7, 1}};
         * int [][] result = {{0, 0, 0},
         * {0, 0, 0}};
         * 
         * for (int i=0;i<mat1.length;i++){ //row number of times
         * for (int j=0;j<mat1[i].length;j++){ //column number of times
         * System.out.format(" Setting value for i=%d and j=%d\n", i, j);
         * result[i][j] = mat1[i][j] + mat2[i][j];
         * }
         * }
         * 
         * //Printing the element of a 2-D Array
         * for (int i=0;i<mat1.length;i++){ //row number of times
         * for (int j=0;j<mat1[i].length;j++){ //column number of times
         * System.out.print(result[i][j] + " ");
         * result[i][j] = mat1[i][j] + mat2[i][j];
         * }
         * System.out.println("");
         * }
         */

        // Q-5 : Write a Java program to reverse an array.

      /* int[] arr = { 1, 2, 3, 4, 5, 6 };
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for (int i = 0; i < n; i++) {
            // swap a[i] and a[l-1-i]
            // a b temp
            // |4| |3| ||
            temp = arr[i];
            arr[i] = arr[l - i - 1];
            arr[l - i - 1] = temp;
        }
        for (int element : arr) {
            System.out.print(element + " ");
        }  */  

        //Q-6 : Write a Java program to find the maximum element in an array.
        
       /*  int arr[] = {10, 324, 45, 90, 9808};
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("Largest in given array is " +max);  */

        //Q-7 : Write a Java program to find the minimum element in a Java array.

        int arr[] = {10, 324, 45, 90, 9808};
        int min = Arrays.stream(arr).min().getAsInt();
        System.out.println("Largest in given array is " +min);   

        //Q-8 : Write a Java program to find whether an array is sorted or not.
        
      /*  boolean isSorted = true;
        int [] arr = {1, 2100, 3, 455, 5, 34, 67};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("The array is not sorted");
        }    */ 
    }
}