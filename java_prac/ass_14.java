import java.util.Scanner;

public class ass_14 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        System.out.println("Enter the operator (+, -, *, /):");
        char op = scanner.next().charAt(0);

        double result = 0.0;

        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = Math.abs(num1 - num2); // Using Math.abs to ensure result is positive
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero. Please enter a non-zero second number.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator. Please enter a valid operator.");
                return;
        }

        System.out.println("Result is: " + result);
        scanner.close();
    }
}
