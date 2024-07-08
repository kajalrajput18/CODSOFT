import java.util.Scanner;

public class NumberGuessGame {
    private static final int MAX_ATTEMPTS = 5; // Maximum attempts allowed per game

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain;

        int totalAttempts = 0;
        int totalGames = 0;

        do {
            totalGames++;
            int randomNum = (int)(Math.random() * 101);  

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I'm thinking of a number between 1 and 100.");
            System.out.println("You have " + MAX_ATTEMPTS + " attempts to guess it.");

            int attempts = 0;
            boolean guessedCorrectly = false;

            while (attempts < MAX_ATTEMPTS && !guessedCorrectly) {
                System.out.print("Enter your guess between 1 to 100: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess < randomNum) {
                    System.out.println("Too low! Try again.");
                } else if (guess > randomNum) {
                    System.out.println("Too high! Try again.");
                } else {
                    guessedCorrectly = true;
                    System.out.println("Congratulations! You guessed the number " + randomNum + " correctly.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry!! You lose. The number was: " + randomNum);
            }

            totalAttempts += attempts;


            System.out.println("Game Over.");
            System.out.println("Attempts taken: " + attempts);

            System.out.print("Do you want to play again? (yes/no): ");
            String sc = scanner.next().toLowerCase();
            playAgain = sc.equals("yes") || sc.equals("y");

        } while (playAgain);

        System.out.println("\nThank you for playing!");
        System.out.println("Total games played: " + totalGames);
        System.out.println("Total attempts made: " + totalAttempts);

        scanner.close();
    }
}
