import java.util.Scanner;

public class ArmstrongByFunction {
    public static void main(String args[]) {
        int value;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        value = sc.nextInt();
        armStrong(value);
        checkpalindromeNo(value);
    }
    public static void armStrong(int value){
        int count = 0, rem, total = 0;
        int temp = value;
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }
        temp = value;
        while (temp > 0) {
            rem = temp % 10;
            total += (Math.pow(rem, count));
            temp = temp / 10;
        }
        System.out.println(total);
    }
    public static void checkpalindromeNo(int num) {
        int temp, rev = 0, lastdig, original;
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