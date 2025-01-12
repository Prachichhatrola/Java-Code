class Main {
    public static void main(String[] args) {
        String[] strArr = {"A", "B", "c"};
        int[] intArr = {1, 2, 3, 4};
        
        int maxLength = Math.max(strArr.length, intArr.length);
        
        System.out.print("Merged Array: ");
        for(int i=0; i<maxLength; i++){
            if(i<strArr.length){
                System.out.print(strArr[i] + " ");
            }
            if(i<intArr.length){
                System.out.print(intArr[i] + " ");
            }
        }
    }
}
