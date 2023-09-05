import java.util.*;
public class SumofEVenOdd {

    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int sumeven=0;
        int sumodd=0;
        int n = sc.nextInt();
        while(n>0){
            int d=n%10;
            if(d%2==0)
                sumeven=sumeven+d;
            else
                sumodd=sumodd+d;
            n=n/10;
        }
        System.out.println(sumeven + " "+sumodd);
    }
}
