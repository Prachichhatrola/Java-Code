class minmax {
    public static void main(String[] args) {
        int[] arr = { 1,4,6,2,6,8,9 };
        
        int min = arr[0];
        int max = arr[0];
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum value is: "+max);
        System.out.println("Minimum value is: "+ min);
    }
}
