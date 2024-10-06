package simple;

import java.util.Scanner;

public class Sumdigitnum {
    public static void main(String[] args) {
        try (Scanner digit = new Scanner(System.in)) {
            System.out.println("Enter the Number");
            int num = digit.nextInt();

            int a = num%10;
            num=num/10;
            int b = num%10;
            num=num/10;
            int c = num%10;
            num=num/10;
            int d = num%10;
            num=num/10;
            int e = num%10;
            // num = num/10;
            int sum = a+b+c+d+e;
            System.out.println(sum);
        }

         
    }

}
