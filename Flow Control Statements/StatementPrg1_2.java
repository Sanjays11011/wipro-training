import java.util.*;
public class StatementPrg1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        lastDigit(a,b);
        sc.close();
    }
    public static void lastDigit(int a, int b) {
        int rem1 = a%10;
        int rem2 = b%10;
        if(rem1 == rem2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
