import java.util.Scanner;
public class FindMonthNumber{
     public static void main(String args[]){
          int a;
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter Month");
           a=sc.nextInt();
           if(a==1||a==3||a==5||a==7||a==8||a==10||a==12)
           {
               System.out.println("no.of days is 31"); 
           }
           else if(a==2){
              System.out.println("no.of days is 28"); 
           }
           else if(a==4||a==6||a==9||a==11){
              System.out.println("no.of days is 30"); 
           }
           else{
              System.out.println("invalid no."); 
           }
           }
     }
   


