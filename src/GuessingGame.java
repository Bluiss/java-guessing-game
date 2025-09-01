import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {

        Random rand = new Random();
        int guess = rand.nextInt(101);

        int K = 10; // Maximum attempts

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= K; i++) {
            System.out.println("Guess a number between 0 and 100, you have " + (K - i + 1) + " attempts left");
            int number = input.nextInt();

            if(number > guess) {
                System.out.println("Go lower, try again");
            }
            else if(number < guess) {
                System.out.println("Go higher, try again");
            }
            else if(number == guess) {
                System.out.println("Well done! You guessed it in " + i + " attempts!");
                input.close();
                return;
            }
        }

        // This only executes if the loop completes without finding the answer
        System.out.println("You've exhausted all attempts. The correct number was: " + guess);
        input.close();
    }
}