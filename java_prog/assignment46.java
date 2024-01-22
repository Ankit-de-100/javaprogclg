import java.util.Arrays;

class assignment_46 {
    public static void main(String[] args) {
        int[] numbers = createLargeArray(); // Create a large array of numbers
        
        // Single-threaded summation
        long startTime = System.currentTimeMillis();
        long sum = calculateSumSingleThreaded(numbers);
        long endTime = System.currentTimeMillis();
        
        System.out.println("Single-threaded sum: " + sum);
        System.out.println("Time taken (single-threaded): " + (endTime - startTime) + " milliseconds");

        // Multi-threaded summation
        startTime = System.currentTimeMillis();
        sum = calculateSumMultiThreaded(numbers);
        endTime = System.currentTimeMillis();

        System.out.println("Multi-threaded sum: " + sum);
        System.out.println("Time taken (multi-threaded): " + (endTime - startTime) + " milliseconds");
    }

    private static int[] createLargeArray() {
        // Create a large array of numbers for demonstration purposes
        int[] numbers = new int[1000000];
        Arrays.fill(numbers, 1); // Set all elements to 1
        return numbers;
    }

    private static long calculateSumSingleThreaded(int[] numbers) {
        long sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    private static long calculateSumMultiThreaded(int[] numbers) {
        int midPoint = numbers.length / 2;

        // Create two threads, each responsible for calculating the sum of a portion of the array
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < midPoint; i++) {
                synchronized (lock) {
                    result += numbers[i];
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = midPoint; i < numbers.length; i++) {
                synchronized (lock) {
                    result += numbers[i];
                }
            }
        });

        // Start both threads
        thread1.start();
        thread2.start();

        try {
            // Wait for both threads to finish
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return result;
    }
    
    private static final Object lock = new Object();
    private static long result = 0;
}
