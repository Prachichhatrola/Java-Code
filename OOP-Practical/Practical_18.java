public class Practical_18 {
    public static void main(String[] args) {
        String numbersString = "10,20,30,40,50"; 
        
        // Split the string by commas to get individual numbers
        String[] numbersArray = numbersString.split(",");
        
        // Get the last number
        String lastNumber = numbersArray[numbersArray.length - 1];
        
        // Display the last number
        System.out.println("Last number: " + lastNumber);
    }
}
