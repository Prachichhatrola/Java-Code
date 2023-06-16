/*11: Write an application that creates an array with five Float command line arguments and display the length of the array after creation and its elements.*/

public class Practical_11 {
    public static void main(String[] args) {
        // Create an array with five Float values
        Float[] floatArray = { 1.2f, 3.4f, 5.6f, 7.8f, 9.0f };

        // Display the length of the array
        System.out.println("Length of the array: " + floatArray.length);

        // Display the elements of the array
        System.out.println("Elements of the array:");
        for (Float value : floatArray) {
            System.out.println(value);
        }
    }
}
