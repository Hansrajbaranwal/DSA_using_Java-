public class IfElse {
    public static String compareIfElse(int a, int b) {
        // Write your code here
        // Scanner scanner = new Scanner(System.in);
        // a = scanner.nextInt();
        // b = scanner.nextInt();
        if(a>b){
            return "greater";
        }
        else if(a==b){
            return "equal";
        }
        else{
            return "smaller";
        }
    }
}
