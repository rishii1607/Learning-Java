import java.util.Scanner;
public class PerfectNo{
    public static void main(String args[]){
        int a,i, sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        a=sc.nextInt();
        for(i=1;i<=a/2;i++){
           if(a%i==0){
             sum=sum+i;
           }
           }
         System.out.println(sum);
        if(sum==a){
            System.out.println("Perfect no.");
        }
        else{
            System.out.println("Not a Perfect no.");
        }

    }
}