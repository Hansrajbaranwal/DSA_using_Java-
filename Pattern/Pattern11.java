import java.util.Scanner;

public class Pattern11 {

    public static void fun(int n) {
        // even row starts with 1 or initializing number from 1
        int start = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                start = 1; // even rows start with 1
            else
                start = 0; // odd rows start with 0

            // loop to print the elements in current row
            // to print right angle triangle
            for (int j = 0; j <= i; j++) {
                System.out.print(start + " "); //prints the current value (1 or 0)
                start = 1 - start; // flips the value from 1 to 0 and 0 to 1
            }
            System.out.println(); // move to next line after printing the row
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
