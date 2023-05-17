package Package;

import java.util.Scanner;

public class Game {
    private String playerName;
    private Scanner scanner;

    public Game() {
        scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Welcome to the Game!");
        System.out.print("Enter your name: ");
        playerName = scanner.nextLine();
        System.out.println("Hello, " + playerName + "! Let's begin the adventure.");

        boolean playAgain = true;
        while (playAgain) {
            play();
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.nextLine();
            playAgain = playAgainInput.equalsIgnoreCase("yes");
        }
    }

    private void play() {
        System.out.println("You are standing in a dark forest.");
        System.out.println("You come across a fork in the road. Which path do you choose?");
        System.out.println("1. Take the left path.");
        System.out.println("2. Take the right path.");
        System.out.print("Enter your choice (1/2): ");
        int choice = Integer.parseInt(scanner.nextLine());

        if (choice == 1) {
            handleLeftPath();
        } else if (choice == 2) {
            handleRightPath();
        } else {
            System.out.println("Invalid choice. Please try again.");
            play();
        }
    }

    private void handleLeftPath() {
        System.out.println("You chose the left path.");
        System.out.println("You encounter a friendly squirrel. What do you do?");
        System.out.println("1. Give it a nut.");
        System.out.println("2. Ignore it and continue walking.");
        System.out.print("Enter your choice (1/2): ");
        int choice = Integer.parseInt(scanner.nextLine());

        if (choice == 1) {
            System.out.println("The squirrel becomes your friend and guides you out of the forest.");
            System.out.println("Congratulations, " + playerName + "! You win!");
        } else if (choice == 2) {
            System.out.println("You stumble upon a hidden trap and fall into a pit.");
            System.out.println("Game Over, " + playerName + ". Better luck next time!");
        } else {
            System.out.println("Invalid choice. Please try again.");
            handleLeftPath();
        }
    }

    private void handleRightPath() {
        System.out.println("You chose the right path.");
        System.out.println("You find a treasure chest. What do you do?");
        System.out.println("1. Open the chest.");
        System.out.println("2. Leave it and continue walking.");
        System.out.print("Enter your choice (1/2): ");
        int choice = Integer.parseInt(scanner.nextLine());

        if (choice == 1) {
            System.out.println("Congratulations, " + playerName + "! The chest is full of gold.");
            System.out.println("You are now rich and live happily ever after.");
        } else if (choice == 2) {
            System.out.println("You continue walking and encounter a group of bandits.");
            System.out.println("They rob you and leave you stranded in the forest.");
            System.out.println("Game Over, " + playerName + ". Better luck next time!");
        } else {
            System.out.println("Invalid choice. Please try again.");
            handleRightPath();
        }
    }
}
