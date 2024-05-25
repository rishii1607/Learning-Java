import java.util.Scanner;
public class ArmStrong{
    public static void main(String args[]){
        int value,i,temp ,count=0, rem,total=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        value=sc.nextInt();
         temp=value;

        while(temp>0){
            temp=temp/10;
            count++;
        }
    temp=value;
    while(temp>0){
       rem=temp%10;
       total+=(Math.pow(rem,count));
        temp=temp/10;
    }
System.out.println(total);
        
    }
}