import java.util.Scanner;

public class SumOfDigitRecursion {
    public static void main(String args[]) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        num = sc.nextInt();
        System.out.println(sumDigit(num));
    }

    // public static int sumDigit(int num) {
    //    int res=0;
    //    while(num>=0)
    //    {
    //     res=res+num%10;
    //     num=num/10;
    //    }
    //    return res;
        
    // }

    public static int sumDigit(int num) {
        if(num==0)
        return 0;
        else
        return sumDigit(num/10)+num%10;
    }
   
}