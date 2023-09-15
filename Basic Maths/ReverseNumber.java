import java.util.Scanner;

public class ReverseNumber {

    public static long reverseNumber(long n) {
        long reverseNumber = 0;
        long temp = n;
        while (temp > 0) {
            long lastDigit = n % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            temp = temp / 10;
        }
        return reverseNumber;
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
            reverseNumber(n);
        }
    }
}
