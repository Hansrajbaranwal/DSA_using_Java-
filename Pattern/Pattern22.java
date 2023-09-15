import java.util.Scanner;

public class Pattern22 {
    public static void fun(int n) {
        // Outer loop for rows
        for (int i = 0; i < 2 * n - 1; i++) {
            // Inner loop for columns
            for (int j = 0; j < 2 * n - 1; j++) {
                // Calculate distances to the nearest edges (top, left, right, bottom)
                int top = i; // Distance to the top edge
                int left = j; // Distance to the left edge
                int right = (2 * n - 2) - j; // Distance to the right edge
                int bottom = (2 * n - 2) - i; // Distance to the bottom edge (adjusted)

                // Find the minimum distance among the four calculated values
                int minValue = Math.min(Math.min(top, bottom), Math.min(left, right));

                // Calculate the value to print in each cell as 'n' minus the minimum distance
                int valueToPrint = n - minValue;

                // Print the result, adding a space for single-digit numbers
                System.out.print((valueToPrint < 10) ? "" + valueToPrint : valueToPrint);

                // Add spaces between values for formatting
                if (j < 2 * n - 2) {
                    System.out.print(" ");
                }
            }

            // Move to the next line after each row
            System.out.println();
        }
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
