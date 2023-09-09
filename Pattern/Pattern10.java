import java.util.Scanner;

public class Pattern10 {

    public static void fun(int n) {
        //works on local machine
//         for (int i = 0; i < 2*n; i++) {
//             //no. of stars printing is equal to the row number
// 			int stars = i;
// 			// once it exceeds the row number it'll follow below condition
//      this approach may not correctly handle the case where the number of stars decreases to 1.
//      The condition if (i > n) might not catch the rows where i becomes equal to n,
//      which could lead to incorrect output
// 			if(i>n)
// 			    //i.e., for 6th row no. of stars = 2*5-6=10-6=4, 7th row = 10-7 =3 and so on
// 				stars = 2*n-i;
// 			for(int j = 0; j<stars;j++) {
// 				System.out.print("* ");
// 			}
// 			System.out.println();
// 		}
        for (int i = 1; i <= 2*n-1; i++){
            //here if "i" is <= n then stars = i, else stars = 2 * n -i
            //it'll ensure no. of stars in each row inc from 1 to n and dec from n-1 to 1
            int stars = i<=n ? i: 2*n-i;
            for (int j = 1; j<=stars; j++){
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
