package simple;
import java.util.Scanner;
public class Next {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        System.out.println("Enter one word: ");
        String name = word.next();
        System.out.println("The Name is : "+ name);
    }

}
