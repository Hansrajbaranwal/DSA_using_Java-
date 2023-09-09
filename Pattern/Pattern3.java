import java.util.Scanner;

public class Pattern3 {

    public static void fun(int n) {
        for (int i = 1; i <= n; i++) {
            // for the line number, it's printing according to it
            // i.e., for 1st line th op will be 1, for 2nd line, the op will 1 2 and so on.
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
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
