import java.util.Scanner;

public class Pattern18 {
    public static void fun(int n) {
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + n - 1); // Initialize ch with the highest character

            // Print characters in reverse order for the current row
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
                ch--; // Move to the previous character
            }

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
