package operators;

public class Ternary {
    public static void main(String[] args) {
        int a = 10, b = 20;
        
 
        int max = (a > b) ? a : b;
        
        System.out.println("The larger number is: " + max);
        
     
        String result = (a % 2 == 0) ? "Even" : "Odd";
        
        System.out.println("The number " + a + " is: " + result); 
        }
}
