import java.util.*;

public class LCM {
    public static void main(String[] args) {
        int a, b;
        System.out.println("Enter First Number");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("Enter Second Number");
        b = sc.nextInt();
        int result = Math.max(a, b);
        while (true) {
            if (result % a == 0 && result % b == 0) {
                break;
            }
            result++;
        }
        System.out.println(result);

    }

}