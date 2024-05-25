import java.util.Scanner;
public class PrintDescendingNo{
     public static void main(String args[]){
          int a ,i;
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter number");
           a=sc.nextInt();
           for(i=a;i>=0;i--){
           System.out.println(i);
           }
     }
}