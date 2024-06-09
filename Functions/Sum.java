import java.util.*;

public class Sum {
    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int calculateProduct(int a, int b) {
        int product = a * b;
        return product;
    }

    public static int calculateSubstract(int a, int b) {
        int substract = a - b;
        return substract;
    }

    public static int calculateDivide(int a, int b) {
        int divide = a / b;
        return divide;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" choose any operations(+,*,-,/)");
        String character = sc.next();
        System.out.println(" Enter two number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        switch (character) {
            case "+": {
                int sum = calculateSum(a, b);
                System.out.println("sum 0f two number is : " + sum);
                break;
            }
            case "*": {
                int product = calculateProduct(a, b);
                System.out.println("Product 0f two number is : " + product);
                break;
            }
            case "-": {
                int substract = calculateSubstract(a, b);
                System.out.println("Substract 0f two number is : " + substract);
                break;
            }
            case "/": {
                int divide = calculateDivide(a, b);
                System.out.println("Divide 0f two number is : " + divide);
                break;
            }

            default: {
                System.out.println(" Wrong operations");
            }

        }

    }
}
