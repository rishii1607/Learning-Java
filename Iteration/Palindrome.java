import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        int num, temp, rev = 0, lastdig, original;
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        original=num;
        temp = num;
        while (temp != 0) {
            lastdig = temp % 10;
            rev = rev * 10 + lastdig;
            temp = temp / 10;

        }
        if (rev == original) {
            System.out.println("It is Palindrome no.");

        } else {
            System.out.println("It is not a  Palindrome no.");
        }
    }
}