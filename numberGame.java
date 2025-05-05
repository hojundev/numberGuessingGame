import java.util.Scanner;

public class numberGame {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello player!");
        } else {
            System.out.println("Hello " + args[0]);
        }
        System.out.println("Welcome to the guess game!");
        while (true) {
            System.out.print("Do you want to play guess the number?(Y/N/Rules): ");
            String agreement = scanner.next();
            if (agreement.toLowerCase().charAt(0) == 'n') {
                System.exit(0);
            } else if (agreement.toLowerCase().charAt(0) == 'r') {
                System.out.println();
                System.out.println("In this game, players try to guess the random number within given number of chances");
                System.out.println("For every guess, the game will provide you with a hint.");
                System.out.println("There are three difficulty level to this game");
                System.out.println("Easy mode: random number is between 0 to 30 inclusive with 10 guesses");
                System.out.println("Medium mode: random number is between 0 to 60 inclusive with 8 guesses");
                System.out.println("Hard mode: random number is between -50 to 50 inclusive with 7 guesses\n");
            } else {
                break;
            }
        }
        playGame game = new playGame();
        game.startGame();
    }
}