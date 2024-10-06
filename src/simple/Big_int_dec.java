package simple;
import java.util.Scanner;
import java.math.BigInteger;
import java.math.BigDecimal;

public class Big_int_dec {
    public static void main(String[] args) {
        Scanner bigint = new Scanner(System.in);
        System.out.println("Enter the Big Integer: ");
        BigInteger num1 = bigint.nextBigInteger();

        Scanner bigdec = new Scanner(System.in);
        System.out.println("Enter the Big Decimal: ");
        BigDecimal num2 = bigint.nextBigDecimal();

        System.out.println("The Big Integer is : " + num1);
        System.out.println("The Big Decimal is : " + num2);
    }
}
