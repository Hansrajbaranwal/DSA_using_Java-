import java.util.Scanner;

public class Pattern12 {

    public static void fun(int n) {
        for (int i = 1; i <= n; i++) {
            // Print numbers increasing from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Print spaces between the two halves of the pyramid
            // 2 * (n - i), ensuring that the spaces increase as you move from top to bottom
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            // Print numbers decreasing from i to 1
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // Move to the next line to start a new row
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
