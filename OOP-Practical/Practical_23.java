public class Practical_23 {
    public static void main(String[] args) {
        // Create a new StringBuffer object
        StringBuffer stringBuffer = new StringBuffer();
        
        // Append strings to the StringBuffer
        stringBuffer.append("Hello");
        stringBuffer.append(" ");
        stringBuffer.append("World!");
        
        System.out.println("Original string: " + stringBuffer.toString());
        
        // Reverse the contents of the StringBuffer
        stringBuffer.reverse();
        
        System.out.println("Reversed string: " + stringBuffer.toString());
    }
}
