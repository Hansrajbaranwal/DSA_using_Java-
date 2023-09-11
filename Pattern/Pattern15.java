import java.util.Scanner;

public class Pattern15 {

    public static void fun(int n) {
        for (int i = 0; i < n; i++) {
            // printing inverted right angle triangle
            // for 0th row, it's printing A + 4 times, for 1st row print is A + 3 times and so on
            // so the condition should be A+(n-i-1) where n is number, 'i' is row
            for (char ch = 'A'; ch <= 'A'+ (n-i-1); ch++) {
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
