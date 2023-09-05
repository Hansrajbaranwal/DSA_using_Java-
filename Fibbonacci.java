import java.util.*;

public class Fibbonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int firstNumber = 0;
        int secondNumber = 1;
        if (input == 0) {
            System.out.println(firstNumber);
        } else if (input == 1) {
            System.out.println(secondNumber);
        } else {
            int sum = 0;
            for (int i = 1; i < input; i++) {
                sum = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = sum;
            }
            System.out.println(sum);
        }
    }

}
