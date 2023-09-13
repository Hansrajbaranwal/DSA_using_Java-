import java.util.Scanner;

public class Pattern20 {
    public static void fun(int n) {
        int initial = 2 * n - 2; // Initialize the number of spaces between asterisks

        for (int i = 1; i <= 2 * n - 1; i++) {
            // Determine the number of stars to print in the current row
            int stars = i;
            if (i > n)
                stars = 2 * n - i;

            // Print the stars on the left side of the row
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            // Print spaces between the two halves of the row
            for (int j = 1; j <= initial; j++) {
                System.out.print(" ");
            }

            // Print the stars on the right side of the row
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            System.out.println(); // Move to the next line for the next row

            // Adjust the number of spaces for the next row
            if (i < n)
                initial -= 2; // Decrease spaces for the upper half
            else
                initial += 2; // Increase spaces for the lower half
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
