import java.util.Scanner;
public class MonthMaxNo{
     public static void main(String args[]){
          int a;
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter Month");
           a=sc.nextInt();
           switch(a){
                case 2:
                    System.out.println(" no. of days is 28");
                break;
            case 4:
                System.out.println("no. of days is 31");
                break;
                case 6:
                System.out.println("no. of days is 31");
                break;
                case 9:
                System.out.println(" no. of days is 31");
                break;
                case 11:
                System.out.println(" no. of days is 31");
                break;
                default:
                     System.out.println(" no. of days is 30");

                
           }
     }
}