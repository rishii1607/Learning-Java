import java.util.*;

public class ComputingPower {

    public static void main(String[] args) {
        int x, i, n, result = 1;
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        System.out.println("Enter power");
        n = sc.nextInt();
        for (i = 0; i < n; i++) {
            result = result * x;

        }
        System.out.println("Final result is : " + result);
    }
}