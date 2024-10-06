package simple;
import java.util.Scanner;
public class Division {
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dividend");
        int dividend = sc.nextInt();

        System.out.println("Enter the divisor");
        int divior = sc.nextInt();

        int division=Math.floorDiv(dividend, divior);
        int modulus =Math.floorMod(dividend, divior);
        
        System.out.println("FloorDivision : "+ division );
        System.out.println("FloorModulus : "+ modulus );
    }

}
