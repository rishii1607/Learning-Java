import java.util.Scanner;
public class SumOddNo{
    public static void main(String args[]){
        int a,i, sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        a=sc.nextInt();
        for(i=0;i<=a;i++){
           sum=sum+(++i);
          System.out.println(i);  
        }
         System.out.println("The sum of odd no is " +sum); 
    }
    
}