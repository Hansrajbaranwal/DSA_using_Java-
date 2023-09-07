import java.util.Scanner;

public class Pattern5 {

    public static void fun(int n) {
        for(int i =1; i<=n; i++){
            //n = number of rows, i=row number
            //for row 1, the number of stars will be 5 i.e., n=5,i=1
            //for row 2, the number of stars will be 4 i.e., n=5,i=2
            for(int j = 0; j<n-i+1; j++){
                System.out.print("* ");
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
