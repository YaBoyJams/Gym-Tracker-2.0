import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Will list out the options for the user to select from when logging a new PR
 * it'll ask the user to input the PR name, the muscle group and specific muscle
 * hit, the weight lifted, the no of reps
 * it'll log the date automatically using LocalDate
 */

public class PRMenu {

    private final Scanner scanner;
    private String PRDetails;
    private String exerciseName;
    private int weightLifted;
    private int noOfReps;

    public PRMenu(Scanner scanner) {
        this.scanner = scanner;
    }

    /**
     * Logs a new PR by prompting the user for an input and storing the details in a
     * string
     * Uses MuscleGroup and Muscle classes to get the muscles hit
     * 
     * @return PRDetails
     */

    // Can be broken down into a constructor and specific methods with validation
    public String logNewPR() {

        System.out.println("Please enter the muscle group targeted: ");
        MuscleGroup chosenMuscleGroup = inputMuscleGroup();
        System.out.println("Please enter the specific muscle targeted: ");
        Muscle chosenMuscle = inputMuscle(chosenMuscleGroup);
        System.out.print("Please enter the exercise name: ");
        exerciseName = scanner.nextLine().trim();
        System.out.print("Please enter the weight used (in kg): ");
        weightLifted = Integer.parseInt(scanner.nextLine().trim());
        System.out.print("Please enter the number of reps achieved: ");
        noOfReps = Integer.parseInt(scanner.nextLine().trim());

        PRDetails = "Muscle Group: " + chosenMuscleGroup + "\nSpecific Muscle: " + chosenMuscle + "\nExercise Name: "
                + exerciseName + "\nWeightLifted: " + weightLifted + "kg\nNumber of Reps: " + noOfReps
                + "\nDate Logged: " + LocalDate.now();
        return PRDetails;
    }

    private MuscleGroup inputMuscleGroup() {
        MuscleGroup[] muscleGroups = MuscleGroup.values();

        for (int i = 0; i < muscleGroups.length; i++) {
            System.out.println((i + 1) + ". " + muscleGroups[i]);

        }

        int muscleGroupChoice = readChoice(muscleGroups.length);
        return muscleGroups[muscleGroupChoice - 1];
    }

    private Muscle inputMuscle(MuscleGroup chosenMuscleGroup) {
        List<Muscle> musclesInGroup = new ArrayList<>();
        for (Muscle muscle : Muscle.values()) {
            if (muscle.getMuscleGroup() == chosenMuscleGroup) {
                musclesInGroup.add(muscle);
            }
        }

        for (int i = 0; i < musclesInGroup.size(); i++) {
            String name = musclesInGroup.get(i).name().replace("_", " ");
            System.out.println((i + 1) + ". " + name);
        }
        int choice = readChoice(musclesInGroup.size());
        return musclesInGroup.get(choice - 1);
    }

    private int readChoice(int choices) {
        // Validation to be added
        System.out.println("Please select an option: ");

        int choice = Integer.parseInt(scanner.nextLine().trim());

        return choice;
    }

}
