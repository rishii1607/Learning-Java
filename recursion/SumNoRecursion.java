
import java.util.Scanner;

public class SumNoRecursion {
    public static void main(String args[]) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        num = sc.nextInt();
        System.out.println(sumNum(num));
    }

    public static int sumNum(int num) {
        if(num==0)
        return 0;
        return num+sumNum(num-1);
       
        
    }
}
