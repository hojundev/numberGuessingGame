import java.util.Scanner;

public class playGame {
    final Scanner scanner = new Scanner(System.in);
    private int numberOfGuesses;
    private final randomNumber numberSelector = new randomNumber();
    private int numberToGuess;

    public void startGame() {
        char difficultyChar;
        while (true) {
            System.out.print("Select the difficulty (Easy/Medium/Hard): ");
            String difficulty = scanner.next();
            difficultyChar = difficulty.toLowerCase().charAt(0);
            if (difficultyChar == 'e') {
                this.numberOfGuesses = 10;
                break;
            } else if (difficultyChar == 'm') {
                this.numberOfGuesses = 8;
                break;
            } else if (difficultyChar == 'h') {
                this.numberOfGuesses = 7;
                break;
            } else {
                System.out.println("Invalid difficulty!");
            }
        }
        this.numberToGuess = this.numberSelector.chooseNumber(difficultyChar);
        onGoingGame();
    }

    private void onGoingGame() {
        while (this.numberOfGuesses > 0) {
           System.out.print("Guess: ");
           int playerGuess = scanner.nextInt();
           if (playerGuess < this.numberToGuess) {
               System.out.println("Your guess is lower than the number!");
               this.numberOfGuesses--;
               System.out.println("Guess(es) left: " + this.numberOfGuesses);
           } else if (playerGuess > this.numberToGuess) {
               System.out.println("Your guess is higher than the number!");
               this.numberOfGuesses--;
               System.out.println("Guess(es) left: " + this.numberOfGuesses);
           } else {
               System.out.println("Your guess is correct!");
               return;
           }
        }
        System.out.println("Number to guess was " + this.numberToGuess);
    }
}