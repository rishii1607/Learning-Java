import java.util.*;

public class PrimeFactor {
   

    public static void main(String[] args) {
        int num;
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for (int i = 2; i < num; i++) {
            if (isPrime(i)) {
                int x = i;
                while (num % x == 0) {
                    System.out.println(i);
                    x = x * i;

                }

            }
        }
    }
    private static boolean isPrime(int num) {
        boolean check = true;
        if (num == 1) {
            return check;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
            }
            return check;
        }

    }
}
