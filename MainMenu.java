
/**
 * Default "menu" to ask the user for inputs,
 * will pull strings/questions from other classes,
 * feeds back the answers to the other classes
 */

import java.util.Scanner;

public class MainMenu {

    // Method to create a scanner object
    private final Scanner scanner;

    public MainMenu(Scanner scanner) {
        this.scanner = scanner;
    }

    // Varaible to store user input
    private int userChoice;
    private boolean quit = false;

    /**
     * Displays the main menu to the user and prompts for an input
     * 
     * @return userChoice
     */
    public void loopMainMenu() {
        while (!quit) {
            int choice = displayMainMenu();
            displayMenus(choice);
        }
    }

    public int displayMainMenu() {

        // Displays the main menu
        System.out.println("Welcome to the Gym Tracker! What would you like to do?");
        System.out.println("1. Log A New Exercise");
        System.out.println("2. Log A New PR (Personal Record)");
        System.out.println("3. View Most Recent Exercise");
        System.out.println("4. View Most Recent PR");
        System.out.println("5. Exit Program");

        userChoice = Integer.parseInt(scanner.nextLine().trim());

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
            ExerciseMenu exerciseMenu = new ExerciseMenu(scanner);
            String exerciseDetails = exerciseMenu.logNewExercise();
            System.out.println(exerciseDetails);
            break;
        case 2:
            PRMenu prMenu = new PRMenu(scanner);
            String prDetails = prMenu.logNewPR();
            System.out.println(prDetails);
            break;
        case 3:
            //Insert Code
            System.out.println("Feature not yet implemented. Please select another option.");
            break;
        case 4:
            //Insert Code
            System.out.println("Feature not yet implemented. Please select another option.");
            break;
        case 5:
            System.out.println("Exiting Program. Thanks for using the Gym Tracker!");
            quit = true;
            break;
        default:
            System.out.println("Invalid input. Please try again.");
            break;
    }
    }

}
