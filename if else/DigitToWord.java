import java.util.Scanner;
public class DigitToWord{
    public static void main(String args[]){
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        a=sc.nextInt();
        if(a==0){
            System.out.println("zero");
        }
        else if(a==1){
            System.out.println("one");
        }
        else if(a==7){
            System.out.println("Seven");
        }
        else{
            System.out.println("Please enter no.between 0 to 9");
        }

    }

}