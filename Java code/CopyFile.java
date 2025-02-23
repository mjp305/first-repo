/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package copyfile.java;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author maver
 */
public class CopyFile {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Prompt user for source file
            System.out.print("Enter the source file path: ");
            String sourceFilePath = scanner.nextLine();
            File sourceFile = new File(sourceFilePath);

            // Check if source file exists and is readable
            if (!sourceFile.exists()) {
                System.out.println("Source file does not exist.");
                return;
            }
            if (!sourceFile.canRead()) {
                System.out.println("Source file is not readable.");
                return;
            }

            // Prompt user for target file
            System.out.print("Enter the target file path: ");
            String targetFilePath = scanner.nextLine();
            File targetFile = new File(targetFilePath);

            // Copy file content
            try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(targetFile))) {

                String line;
                while ((line = reader.readLine()) != null) {
                    writer.write(line);
                    writer.newLine();
                }
            }

            // Display the content of the target file
            System.out.println("\nContent of the target file:");
            try (BufferedReader targetReader = new BufferedReader(new FileReader(targetFile))) {
                String line;
                while ((line = targetReader.readLine()) != null) {
                    System.out.println(line);
                }
            }

            // Display metadata of the target file
            System.out.println("\nMetadata of the target file:");
            System.out.println("Absolute Path: " + targetFile.getAbsolutePath());
            System.out.println("Writable: " + targetFile.canWrite());
            System.out.println("Readable: " + targetFile.canRead());
            System.out.println("File Size: " + targetFile.length() + " bytes");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
