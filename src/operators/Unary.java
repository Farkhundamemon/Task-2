package operators;

public class Unary {
    public static void main(String[] args) {
        int a = 15;
        
        System.out.println("Post-increment: " + (a++)); 
        System.out.println("Pre-increment: " + (++a));
        
        System.out.println("Post-decrement: " + (a--));
        System.out.println("Pre-decrement: " + (--a)); 
    }
}
