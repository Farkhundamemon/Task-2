package operators;

public class Bitwise {
    public static void main(String[] args) {
        int a = 6; 
        int b = 2;

        System.out.println("Bitwise AND: " + (a & b)); 
        System.out.println("Bitwise OR: " + (a | b)); 
        System.out.println("Bitwise XOR: " + (a ^ b)); 
        System.out.println("Bitwise NOT (~a): " + (~a)); 
        System.out.println("Left Shift: " + (a << 1)); 
        System.out.println("Right Shift: " + (a >> 1)); 
    }
}
