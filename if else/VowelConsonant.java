import java.util.Scanner;
public class VowelConsonant{
     public static void main(String args[]){
          String alphabet;
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter alphabet");
           alphabet=sc.next();
           if(alphabet=="A"|| alphabet=="a"||alphabet=="E"||alphabet=="e"||alphabet=="I"||alphabet=="i"||alphabet=="O"||alphabet=="o"||alphabet=="U"||alphabet=="u")
           {
            System.out.println("vowel");
           }
           else{
            System.out.println("Consonant");
           }
     }
}