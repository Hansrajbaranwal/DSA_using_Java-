import java.util.Scanner;

public class CountDigits {

    public static int fun(int n) {
        int initial = 0; // Initialize a variable to store the count of divisible digits
        int temp = n; // Create a temporary variable to store the original number 'n'
        // above we have taken temp to keep the original value of a variable intact for further processing,
        // and using a temporary variable can help with that

        // Iterate through each digit of the number 'n' from right to left
        while (temp > 0) {
            int lastDigit = temp % 10; // Extract the last digit of 'temp' using modulo operation

            // Check if the extracted digit is not zero and 'n' is divisible by it
            if (lastDigit != 0 && n % lastDigit == 0) {
                initial += 1; // If the condition is met, increment the count
            }

            temp = temp / 10; // Move to the next digit by removing the last digit
        }

        // 'initial' now contains the count of digits in 'n' that are divisible by 'n'
        return initial; // Return the final count
    }

    public static void main(String[] args) {
        // for attempting multiple cases, they may ask for multiple case at the same time in online
        int t; // asking for number of cases it should perform
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            // or you can just do this as well
            int n;
            n = sc.nextInt();
            fun(n);
        }
    }
}
