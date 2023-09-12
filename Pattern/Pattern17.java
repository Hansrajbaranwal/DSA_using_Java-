import java.util.Scanner;

public class Pattern17 {
    public static void fun(int n) {
        for (int i = 0; i < n; i++) {

            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // alphabets
            char ch = 'A';
            // for 1st row it prints A, for 2nd row it prints ABA i.e., it separated at between
            // in order to print the highest and then decrease, we need to break when it reaches at peak and then decrease
            int separate = (2 * i + 1) / 2;
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(ch);
                if (j <= separate)
                    ch++;
                else
                    ch--;
            }

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
