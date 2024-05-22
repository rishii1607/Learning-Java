import java.util.Scanner;
public class VowelConsonant{
     public static void main(String args[]){
          String alphabet;
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter alphabet");
           alphabet=sc.next();
           switch(alphabet){
            case "a":
                 System.out.println("vowel");
                break; 
                 case "e":
                 System.out.println("vowel");
                break; 
                 case "i":
                 System.out.println("vowel");
                break; 
                 case "o":
                 System.out.println("vowel");
                break; 
                 case "u":
                 System.out.println("vowel");
                break; 
                default:
                 System.out.println("consonant"); 
           }
     }
}