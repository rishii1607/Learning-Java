import java.util.*;

public class PrimeNo {
    public static void main(String[] args) {
        int num, i,check=0;
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if (num == 1) {
            System.out.println("Not a Prime No.");
        }
        else{
            for(i=2;i<num/2;i++)
            {
                if(num % i == 0){
                    System.out.println("Not a Prime No.");
                    check=1;
                    break;
                }
            }
        }
            if (check==0) 
            {
                System.err.println("a Prime No.");
            }
    }
}