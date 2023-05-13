public class arrays {
    public static void main(String[] args) {
        /*Classroom of 500 students - You have to store marks of these 500 students.
        You have 2 options:
        1. Create 500 variables
        2. Use Arrays (recommended) */
        int [] marks = new int[5];
        marks[0] = 100;
        marks[1] = 60;
        marks[2] = 70;
        marks[3] = 90;
        marks[4] = 86;
        // marks[5] = 89; --> throws an error
        System.out.println(marks[4]);

    }
}
