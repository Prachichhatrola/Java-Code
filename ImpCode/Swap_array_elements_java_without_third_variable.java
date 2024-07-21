public class SwapElements {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        int index1 = 1; // Index of the first element to swap
        int index2 = 3; // Index of the second element to swap

        System.out.println("Array before swapping: ");
        printArray(array);

        swap(array, index1, index2);

        System.out.println("Array after swapping: ");
        printArray(array);
    }

    public static void swap(int[] array, int i, int j) {
        if (i != j) {
            array[i] = array[i] + array[j];
            array[j] = array[i] - array[j];
            array[i] = array[i] - array[j];
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
