import java.util.Scanner;

public class ReverseBits {

    public static long reverseBit(long n) {
        long result = 0;
        // since it's 32 bits, we need to iterate for 32 times
        for (int i = 0; i < 32; i++) {
            result <<= 1; // Left shift result by 1 bit
            result |= (n & 1); // Set the least significant bit of result to the current bit of n
            n >>= 1; // Right shift n by 1 bit to process the next bit
        }
        return result;
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
            reverseBit(n);
        }
    }
}
