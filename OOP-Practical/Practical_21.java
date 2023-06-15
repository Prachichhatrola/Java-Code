public class Practical_21 {
    public static void main(String[] args) {
        String[] stringValues = { "10.5", "20.3", "15.7", "18.2" };

        double result = average(stringValues);

        System.out.println("Average: " + result);
    }

    public static double average(String[] stringArray) {
        double sum = 0.0;

        for (String str : stringArray) {
            double value = Double.parseDouble(str);
            sum += value;
        }

        return sum / stringArray.length;
    }
}
