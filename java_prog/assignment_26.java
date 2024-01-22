class MathUtils {
    
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result =result*i;
        }
        return result;
    }



    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 1) {
                return false;
            }
        }
        return true;
    }
}

public class assignment_26 {
    public static void main(String[] args) {
        long factorialResult = MathUtils.factorial(5);
        System.out.println("Factorial of 5: " + factorialResult);

        int num = 17;
        boolean isPrime = MathUtils.isPrime(num);
        System.out.println(num + " is prime: " + isPrime);
    }
}
