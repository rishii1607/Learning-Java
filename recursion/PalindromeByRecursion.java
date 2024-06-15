import java.util.Scanner;

public class PalindromeByRecursion {
    public static void main(String args[]) {
        String str;
        int start = 0, end;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Alphabet in terms of string");
        str = sc.next();
        int lenstr = str.length();
        end = lenstr - 1;
        System.out.println(end);
        System.out.println(isPalindrome(str,start,end));

    }

    static boolean isPalindrome(String str, int start, int end) {
        if (start >= end)
            return true;
        return (str.charAt(start) == str.charAt(end)) &&
                isPalindrome(str, start + 1, end - 1);
    }
}