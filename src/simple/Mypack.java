package simple;
import java.util.Scanner;
public class Mypack {
    public static void main(String[]arg){
        Scanner square = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = square.nextInt();

        int sqr = num * num;
        int cube = num * num* num;
        int forth = num* num* num*num;

        System.out.println(sqr);
        System.out.println(cube);
        System.out.println(forth);
    }

}
