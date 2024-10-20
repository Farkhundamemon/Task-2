package lab_3;
import java.util.Random;
import java.util.Scanner;
public class GuesingGame {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random randm = new Random();

        int randomNumber = randm.nextInt(100)+1;
       
        int userGuess = 0;

        System.out.println("Guess the number between 1 to 100:");
       
        while(userGuess != randomNumber ){

            System.out.println("Enter your guess: ");
        
            userGuess = scn.nextInt();
            if( userGuess > randomNumber ){
                System.out.println("Too High ! Try again");
            }
            else if( userGuess < randomNumber ){
                System.out.println("Too Low! Try again");
            }
            else 
            {
                System.out.println("Congratulation you guessed the Correct number : " + randomNumber );
            }

        }
        scn.close();

      
    }

}
