import java.util.Scanner;

public class Pattern9 {

    public static void fun(int n) {
        //upward
        for(int i=0; i<n; i++){
            //spaces
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=0; j<i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // downward
        for(int i=0; i<n; i++){
            //spaces
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j =0; j<n-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //or you can just call both previous pattern 7 and pattern 8 fun in the main
        // ,but it'll only work on local machine
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
