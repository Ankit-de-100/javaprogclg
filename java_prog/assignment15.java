import java.util.Scanner;

public class assignment15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter a number (or -1 to exit): ");
            int number = scanner.nextInt();
            
            if (number == -1) {
                System.out.println("Exiting the loop.");
                break; // Breaks out of the while loop
            }
            
            System.out.println("Squared value: " + (number * number));
        }
        
        System.out.println("Program finished.");
        scanner.close();
    }
}
