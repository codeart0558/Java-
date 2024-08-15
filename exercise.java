/*
create a class game,which allows a user to play "guess the number"
game once.gam should have the following methods:
1.constructor to generate the random number
2.takeuserinput() to take a user input of number
3.iscorrectnumber() to detect whether the number entered by the user is true
4. getter and setter for no. of guesses 
use properties such as no. of guesses(int),etc to get this take done!
*/
// put

import java.util.Scanner;
import java.util.Random;

class Game {
    private int randomNumber;
    private int numberOfGuesses;

    // Constructor to generate the random number
    public Game() {
        Random random = new Random();
        this.randomNumber = random.nextInt(100) + 1; // Random number between 1 and 100
        this.numberOfGuesses = 0;
    }

    // Method to take user input
    public int takeUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess the number: ");
        int userInput = scanner.nextInt();
        return userInput;
    }

    // Method to check if the guessed number is correct
    public boolean isCorrectNumber(int userInput) {
        numberOfGuesses++;
        if (userInput == randomNumber) {
            System.out.println("Congratulations! You guessed the correct number.");
            return true;
        } else if (userInput > randomNumber) {
            System.out.println("Too high! Try again.");
        } else {
            System.out.println("Too low! Try again.");
        }
        return false;
    }

    // Getter for number of guesses
    public int getNumberOfGuesses() {
        return numberOfGuesses;
    }

    // Setter for number of guesses
    public void setNumberOfGuesses(int numberOfGuesses) {
        this.numberOfGuesses = numberOfGuesses;
    }
}

class GuessNumber {
    public static void main(String[] args) {
        Game game = new Game();  // Create an instance of the game
        boolean hasGuessedCorrectly = false;

        // Keep playing until the user guesses the correct number
        while (!hasGuessedCorrectly) {
            int userInput = game.takeUserInput();  // Take user input
            hasGuessedCorrectly = game.isCorrectNumber(userInput);  // Check if the guess is correct
        }

        // Display the number of guesses it took
        System.out.println("You guessed the number in " + game.getNumberOfGuesses() + " tries.");
    }
}
