package lab_3;
import java.util.Scanner;
public class Calculator {
    public static void main(String[]arg){
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first value");
        int value1 = scn.nextInt();

        System.out.println("Enter Operator (+, -, *, /, %)");
        char operator = scn.next().charAt(0);


        System.out.println("Enter second value");
        int value2 = scn.nextInt();


        double result;
        switch(operator){
            case '+' : 
            result = value1 + value2;
            System.out.println("Result is : " + result);
            break;
            case '-' : 
            result = value1 - value2;
            System.out.println("Result is : " + result);
            break;
            case '*' : 
            result = value1 * value2;
            System.out.println("Result is : " + result);
            break;
            case '/' : 
            result = value1 / value2;
            System.out.println("Result is : " + result);
            break;
            case '%' : 
            result = value1 % value2;
            System.out.println("Result is : " + result);
            break;
            default :
            System.out.println("Invalid operator");
            break;

        }
        scn.close();

    }

}
