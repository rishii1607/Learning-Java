import java.util.Scanner;
public class Triangle{
   public static void main(String args[]){
    int  t1,t2,t3;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter three side of Triangle");
    t1=sc.nextInt();
    t2=sc.nextInt();
    t3=sc.nextInt();
    if( t1==t2 && t2==t3){
        System.out.println("Equilateral Triangle");
    }
    else if(t1==t2 || t2==t3 || t3==t1){
        System.out.println("Isosceles Triangle");

    }
    else{
        System.out.println("Scalene Triangle");
    }

   } 
}