import java.util.Scanner;

public class Pattern16 {

    public static void fun(int n) {
        for (int i = 0; i < n; i++) {
            // at each row letter is printing just more than the row number
            char ch = (char) ('A' + i); // convert from int to char
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
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
