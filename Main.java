import java.util.Scanner;

/**
 * Main class for the Gym Tracker 2.0
 * All other classes will be directly or indirectly called from here
 * The user will interact with the program via this class
 * 
 */

public class Main {

    public static void main(String[] args) {

        // Scanner reads user input
        Scanner scanner = new Scanner(System.in);

        /**
         * Creates an instance of MainMenu
         * calls displauMainMenu() to display the main menu to the user
         * calls displayMenus() to display the user's desired menu
         */
        MainMenu mainMenu = new MainMenu(scanner);
        mainMenu.loopMainMenu();
    }
}
