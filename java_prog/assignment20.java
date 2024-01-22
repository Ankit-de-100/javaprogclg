public class assignment20 {
    public static void main(String[] args) {
        int sum1 = add(5, 7);
        double sum2 = add(3.5, 2.7);
        String concatenatedString = add("Hello, ", "world!");

        System.out.println("Sum of integers: " + sum1);
        System.out.println("Sum of doubles: " + sum2);
        System.out.println("Concatenated String: " + concatenatedString);
    }

    public static int add(int a, int b) {
        return a + b;
    }
    public static double add(double a, double b) {
        return a + b;
    }
    public static String add(String a, String b) {
        return a + b;
    }
}
