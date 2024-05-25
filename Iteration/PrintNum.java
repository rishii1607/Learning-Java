import java.util.Scanner;
public class PrintNum{
     public static void main(String args[]){
          int a ,i;
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter number");
           a=sc.nextInt();
           for(i=0;i<=a;i++)
           System.out.println(i);
     }
}