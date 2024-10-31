import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner; // Importing Scanner
import java.io.FileNotFoundException; // Correct exception for file not found

class File_one {
    public static void main(String[] args) {
        File myFile = new File("File_one.txt");

        // Create the file
        try {
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Unable to create this file.");
            e.printStackTrace();
        }

        // Write to the file
        try {
            FileWriter fileWriter = new FileWriter(myFile);
            fileWriter.write("This is the second file.");
            fileWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Read from the file
        try {
            Scanner sc = new Scanner(myFile);
            System.out.println("Reading from the file:");
            while (sc.hasNextLine()) {
                String line = sc.nextLine(); // Use nextLine() to get the actual line
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) { // Correct exception
            System.out.println("File not found.");
            e.printStackTrace();
        }

        // delete file 
        // if(myFile.delete()){
        //     System.out.println("i have deleted : " + myFile.getName());
        // }
        // else
        // {
        //     System.out.println("some error occure while deleting the file");
        // }
    }
}
