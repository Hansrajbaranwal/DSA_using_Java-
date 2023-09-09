import java.util.Scanner;

public class Pattern1 {

    public static void fun(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }    }
    public static void main(String[] args) {
        // for attempting multiple cases, they may ask for multiple case at the same time in online
        int t; // asking for number of cases it should perform
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for(int i =0;i<t;i++){
            // or you can just do this as well
            int n;
            n = sc.nextInt();
            fun(n);
        }
    }
}
