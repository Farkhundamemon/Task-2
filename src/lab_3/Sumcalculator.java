package lab_3;
import java.util.Scanner;
public class Sumcalculator {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the positive integer");
        int num = scn.nextInt();

        if (num<=0){
            System.out.println("Please enter the Poitive number");
        }
        else 
        {
            int sum =0;
            int i = 1;
            while(i<=num){
                sum += i;   //sum = sum + i; 
                i++;
                
            }
            System.out.println("The sum of all numbers from 1 to " + num + " Is : " + sum);
        }

    }

}
