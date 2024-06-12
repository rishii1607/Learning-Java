import java.util.Scanner;

public class Print1toN {
    public static void main(String args[]) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        num = sc.nextInt();
        Print1toN(num);

    }

    public static void Print1toN(int num) {
        if (num == 0)
            return;
        Print1toN(num - 1);
        System.out.print(num + " ");

    }

}