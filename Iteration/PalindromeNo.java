import java.util.*;

public class PalindromeNo {
    public static void main(String[] args) {
        int num, temp, temp1, temp2, value;
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int numduc = num;
        temp = num;

        temp = temp % 10;
        num = num / 10;
        temp1 = num % 10;
        temp2 = temp;

        // System.out.println(temp);
        // System.out.println(temp1);
        // System.out.println(temp2);

        total = temp * 10;

        value = temp * 100 + temp1 * 10 + temp2;
        // System.out.println(value);

        if(value==numduc){
        System.out.println("It is Palindrome no.");
        }
        else{
        System.out.println("It is not a Palindrome no.");
        }
    }
}