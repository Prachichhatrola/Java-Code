public class String_Methods {
    public static void main(String[] args) {
        String name = "Harry";
        // System.out.println(name);
        int value = name.length();
        System.out.println(value);
        
        // String lstring = name.toLowerCase();
        // System.out.println(lstring);

        // String ustring = name.toUpperCase();
        // System.out.println(ustring);

        // String nonTrimmedString = "    Harry     ";
        // System.out.println(nonTrimmedString);
        // System.out.println(nonTrimmedString.trim());

        System.out.println(name.substring(3));
        System.out.println(name.substring(1,4));

        System.out.println(name.replace('r','p'));
        System.out.println(name.replace("r","ier"));

        System.out.println(name.startsWith("Har"));
        System.out.println(name.endsWith("Har"));

        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));

        System.out.println(name.indexOf("r"));

        System.out.println(name.equals("Harry"));
        System.out.println(name.equalsIgnoreCase("HarRY"));

        System.out.println("I am escape sequence \" double quote");
        System.out.println("I am escape sequence \\ double quote");
    }
}
