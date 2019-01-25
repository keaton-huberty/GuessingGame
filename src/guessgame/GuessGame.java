package guessgame;
import java.util.Random;
import java.util.Scanner;

public class GuessGame{ 
    public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    int guess;
    Random rand = new Random();
    int randomNumber = rand.nextInt(20) + 0;

    System.out.print("I'm thinking of a number between 0-20. What is the number? ");
    guess = userInput.nextInt();
    
    if (guess == randomNumber) {
        System.out.println("You got it!");
    }
    else {
        System.out.println("Nop. The number is " + randomNumber + ".");
    }
    }
}