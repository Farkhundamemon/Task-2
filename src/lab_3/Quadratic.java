package lab_3;
import java.util.Scanner;
public class Quadratic {
   public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);

        
        System.out.print("Enter value a: ");
        double a = scn.nextDouble();
        System.out.print("Enter value b: ");
        double b = scn.nextDouble();
        System.out.print("Enter value c: ");
        double c = scn.nextDouble();

        double root1, root2;

        
        double determind = b * b - 4 * a * c;

       
    	if(a==0 && b==0)
	{
	
		System.out.println("This is not a quadratic equation");
	}
	else 
	{
	   determind = b*b - 4*a*c;
	   if(determind >= 0)
	   {
 		 root1 = (-b + Math.sqrt(determind)) /( 2*a);
 		  root2 = (-b -  Math.sqrt(determind)) / (2*a);
           System.out.println("This is real root");
 		
	   }
	   else 
	   {
        System.out.println("This is not real root");
 		
	
	   }
	}

        scn.close();
    }
}


