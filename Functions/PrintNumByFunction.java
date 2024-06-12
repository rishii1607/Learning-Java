import java.util.Scanner;

public class PrintNumByFunction {
    public static void main(String args[]) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        a = sc.nextInt();
        printNum(a);
    }

    public static void printNum(int a) {
        int i;
        for (i = a; i >= 0; i--)
            System.out.println(i);
    }
}