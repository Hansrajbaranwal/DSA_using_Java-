import java.util.Scanner;

public class Pattern19 {
    public static void fun(int n) {
        // upper portion
        int initialState = 0;
        for (int i = 0; i < n; i++) {
            // stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }

            // spaces
            for (int j = 0; j < initialState; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }

            initialState += 2; // Increase the number of spaces by 2 for the next row
            System.out.println(); // Move to the next line for the next row
        }

        //lower portion
        initialState = 2 * n - 2;
        for (int i = 1; i <= n; i++) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // spaces
            for (int j = 0; j < initialState; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            initialState -= 2; // Decrease the number of spaces by 2 for the next row
            System.out.println(); // Move to the next line for the next row
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
