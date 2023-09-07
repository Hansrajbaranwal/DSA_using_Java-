import java.util.Scanner;

public class Pattern8 {

    public static void fun(int n) {
        //     for (int i = 0; i < n; i++)
        //     {
        //         for(int j=0;j<2*n-1;j++)
        //         {
        //           if(j<i||j>2*n-(i+2))
        //              System.out.print(" ");
        //           else
        //           {
        //               System.out.print("*");
        //           }
        //         }
        //         System.out.println();

        // }
        for (int i = 1; i <= n; i++) {
            // Outer loop for rows: It iterates from 1 to n.

            // Inner loop 1: Prints spaces before the stars.
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Inner loop 2: Prints the stars in the current row.
            for (int k = 0; k < 2 * (n - i) + 1; k++) {
                System.out.print("*");
            }

            // Move to the next line after completing the current row.
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
