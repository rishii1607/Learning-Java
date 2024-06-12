import java.util.Scanner;

public class PrintNto1 {
    public static void main(String args[]) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        num = sc.nextInt();
        PrintNto1(num);

    }

    public static void PrintNto1(int num) {
        if (num == 0)
            return;
        System.out.print(num + " ");
        PrintNto1(num - 1);
    }

}