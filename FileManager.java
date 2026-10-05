import java.io.*;

public class FileManager {
    // Add method to save PRDetails and exerciseDetails

    public void writeExerciseToFile(String exerciseDetails) {
        // Workout details are passed to the method, and is saved to the file

        try{
            File file = new File("ExerciseHistory.txt");

            // Checks if the file exists, if it doesn't then it creates a new file
            if(!file.exists()){
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(exerciseDetails);
            bw.newLine();
            bw.close();

            // Print message indicating success
            System.out.println("Exercise details saved successfully.");
        }catch(IOException e){
            // Print message indicating failure
            System.out.println("An error occurred while saving the exercise details.");
        }
    }

    // Add method to load PRDetails and exerciseDetails
    // Update method to add reading from the most recent entry, and specific entries
    public void readExerciseFromFile() {
        // Reads all the exercises from the file and prints them

        try{
            File file = new File("ExerciseHistory.txt");
            
            // Checks if the file exists, if not terminates the method
            if(!file.exists()){
                System.out.println("No exercise history found.");
                return;
            }

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            // Reads all the lines from the file and prints them if not null
            String line = null;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }

            br.close();
            fr.close();

            // Print message if there is no entries in the file

        }catch(IOException e){
            // Print message indicating failure
            System.out.println("An error occurred while loading the exercise details.");
        }

    }
}
