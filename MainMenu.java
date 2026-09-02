
/**
 * Default "menu" to ask the user for inputs,
 * will pull strings/questions from other classes,
 * feeds back the answers to the other classes
 */

import java.util.Scanner;

public class MainMenu {

    private final Scanner scanner;

    public MainMenu(Scanner scanner) {
        this.scanner = scanner;
    }

    // Varaible to store user input
    int userChoice;

    /**
     * Displays the main menu to the user and prompts for an input
     * 
     * @return userChoice
     */
    public int displayMainMenu() {

        // Displays the main menu
        System.out.println("Welcome to the Gym Tracker! What would you like to do?");
        System.out.println("1. Log A New Exercise");
        System.out.println("2. Log A New PR (Personal Record)");
        System.out.println("3. View Most Recent Exercise");
        System.out.println("4. View Most Recent PR");
        System.out.println("5. Exit Program");

        userChoice = scanner.nextInt();

        // Check to see if the input is working
        System.out.println(userChoice);

        return userChoice;
    }

    /**
     * uses a switch case to use userChoice to display the user's desired menu
     * it'll call the selected menu from the other classes allowing the user to interact with it
     * 
     */

    public void displayMenus(int userChoice) {
        switch(userChoice) {
        case 1:
            // Insert Code
            break;
        case 2:
            //Insert Code
            break;
        case 3:
            //Insert Code
        case 4:
            //Insert Code
        case 5:
            System.out.println("Exiting Program. Thanks for using the Gym Tracker!");
            break;
        default:
            System.out.println("Invalid input. Please try again.");
    }
    }

}
