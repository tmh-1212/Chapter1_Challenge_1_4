/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1_challenge_1_4;
import java.io.*;

public class Chapter1_Challenge_1_4 {

    public static void main(String[] args) {

        BufferedReader reader = null;

        try {
            File configFile = new File("config.txt");

            // 1. Try to open the config.txt file
            reader = new BufferedReader(new FileReader(configFile));

            // 2. Read the first line (should be a number)
            String versionLine = reader.readLine();
            int version;

            try {
                version = Integer.parseInt(versionLine);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("First line is not a valid number.");
            }

            // 3. Check if version is less than 2
            if (version < 2) {
                throw new Exception("Config version too old!");
            }

            // 4. Read the second line (should be a file path)
            String filePath = reader.readLine();
            File targetFile = new File(filePath);

            // 5. Check if the file path exists
            if (!targetFile.exists()) {
                throw new IOException("File path in config does not exist: " + filePath);
            }

            // If all is well
            System.out.println("Config read successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("Error: Config version too old!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format in config file.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());  // Custom error for version check
        } finally {
            System.out.println("Config read attempt finished.");

            // Close the reader if it was opened
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                // Optional: handle error during reader close
            }
        }
    }
}
