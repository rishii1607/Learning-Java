import java.util.*;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int a, b;
        System.out.println("Enter First Number");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("Enter Second Number");
        b = sc.nextInt();
        int result = Math.min(a, b);
        while (result > 0) {
            if (a % result == 0 && b % result == 0){
            break;
            }
          result--;
        }
        System.out.println(result);
       
    }

}