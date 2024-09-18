import java.util.Stack;
/*
 * This program finds the first 50 prime numbers and stores them in a stack.
 * It then prints these prime numbers in descending order by popping them from the stack.
 */

public class Main {

    public static void main(String[] args) {
        // Stack to store prime numbers
        Stack<Integer> primeStack = new Stack<>();

        // Find the first 50 prime numbers and push them to the stack
        int count = 0;
        int number = 2; // First prime number

        while (count < 50) {
            if (isPrime(number)) {
                primeStack.push(number); // Push the prime number to the stack
                count++;
            }
            number++;
        }

        // Display the first 50 prime numbers in descending order
        System.out.println("The first 50 prime numbers in descending order:");
        while (!primeStack.isEmpty()) {
            System.out.print(primeStack.pop() + " ");
        }
    }

    // Check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
