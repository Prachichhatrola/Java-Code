public class Chapter3PS {
    public static void main(String[] args) {
        // Problem 1 : Write a Java program to convert a String to lower case.

        String name = "Jack Parker";
        name = name.toLowerCase();
        System.out.println(name);

        // Problem 2 : Write a Java program to replace spaces with underscores.

        String text = "To My Friend";
        text = text.replace(" ", "_");
        System.out.println(text);

        // Problem 3 : Write a Java program to fill in a letter template which looks like below:
        // letter = "Dear <|name|>, Thanks a lot"
        // Replace <|name|> with String(name).

        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Harry");
        System.out.println(letter);

        // Problem 4 : Write a Java program to detect double and triple spaces in a String.

        String myString = "This string contains double and  triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        //Program 5 : Write a program to format the following latter using escape sequence charecters.
        // letter = "Dear Harry, This Java Course ia nice. Thanks"
        
        String myLetter = "Dear Harry,\n\tThis Java Course is Nice.\nThanks!";
        System.out.println(myLetter); 
    }
}

