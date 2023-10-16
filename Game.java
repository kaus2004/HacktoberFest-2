import java.util.Scanner;

public class TextGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean gameOver = false;

        // Game loop
        while (!gameOver) {
            System.out.println("Welcome to the Text-based Game!");
            System.out.println("1. Start Game");
            System.out.println("2. Quit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Starting the game...");
                    // Implement your game logic here
                    break;
                case 2:
                    System.out.println("Goodbye!");
                    gameOver = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
