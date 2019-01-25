package guessgame;
import java.util.Random;
import java.util.Scanner;

public class GuessGame{ 
    public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    int guess;
    Random rand = new Random();
    int randomNumber = rand.nextInt(20) + 0;
    boolean win = false;
    
    System.out.print("I'm thinking of a number between 0-20. What is the number? ");
    
    while (win == false) {
    guess = userInput.nextInt();
    
    if (guess == randomNumber) {
        win = true;
    }
    else if (guess > randomNumber) {
        System.out.print("Nop. Too high. Try again:");
    }
    else if (guess < randomNumber) {
        System.out.print("Nop. Too low. Try again:");
    }
    }
    System.out.println("You got it!");
    }
}