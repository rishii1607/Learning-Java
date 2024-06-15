import java.util.*;

public class PalindromeByFunction {

    public static void main(String args[]) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Alphabet in Terms of String ");
        str = sc.next();
        boolean strdemo = isPalindrome(str);
        if (strdemo) {
            System.out.println("It is palindrome");
        } else {
            System.out.println("It is not palindrome");
        }

    }

    static boolean isPalindrome(String str) {
        int end = str.length() - 1;
        String news = "";
        for (int i = end; i >= 0; i--) {
            news = news + str.charAt(i);

        }
        System.out.println(news);
        if (news.equals(str)) {
            return true;

        } else {
            return false;
        }

    }

}
