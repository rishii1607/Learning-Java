import java.util.Scanner;
public class TrialZeroFact{
    public static void main(String args[]){
        int a,i ,fact=1,result=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        a=sc.nextInt();
        for(i=2;i<=a;i++){
        fact=fact*i;
        
        }
        System.out.println("The Factorial is: "+ fact);
        while (fact%10==0) {
            result++;
            fact=fact/10;

        }
        System.out.println(result);  
    }
}