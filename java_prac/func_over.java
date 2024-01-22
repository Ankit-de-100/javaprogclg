
public class func_over {
    public static int fact(int x) {
        if (x == 0) {
            return 1;  // Base case: factorial of 0 is 1
        } else {
            return x * fact(x - 1);
        }
    }

    public static void main(String args[]) {
        System.out.println("The factorial of 6 is: " + fact(6));
    }
}
