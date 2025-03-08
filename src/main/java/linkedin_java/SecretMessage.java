package linkedin_java;

import java.io.*;

public class SecretMessage {
    public static void main(String[] args) {
        String fileName = "sample.txt";  // Change this to your actual file path
        String[] redactedWords = {"secret", "classified", "hidden"};
        redactTextFile(fileName, redactedWords);
    }

    public static void redactTextFile(String fileName, String[] redactedWordsArray) {
        if (!fileName.endsWith(".txt")) {
            System.out.println("This is not a valid text file.");
            File file = new File("src/linkedin_java/ParseCSV/ticketholders.csv");
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("File exists: " + file.exists());
            return;
        }

        File originalFile = new File(fileName);
        if (!originalFile.exists() || !originalFile.isFile()) {
            System.out.println("The file does not exist or is not a valid file.");
            return;
        }

        File tempFile = new File("redacted_" + originalFile.getName());

        try (
                BufferedReader originalFileReader = new BufferedReader(new FileReader(originalFile));
                BufferedWriter redactedFileWriter = new BufferedWriter(new FileWriter(tempFile))
        ) {
            String line;
            while ((line = originalFileReader.readLine()) != null) {
                System.out.println("Original line: " + line);  // Print original line
                for (String word : redactedWordsArray) {
                    line = line.replaceAll("(?i)" + word, "REDACTED");  // Redact words case-insensitively
                }
                redactedFileWriter.write(line);
                redactedFileWriter.newLine();
            }

            // Ensure data is written to the file by flushing the writer
            redactedFileWriter.flush();
            System.out.println("Redacted file created: " + tempFile.getAbsolutePath());

            // Now, let's read the content of the redacted file to confirm the changes
            if (!tempFile.exists()) {
                System.out.println("Redacted file does not exist.");
                return;
            }

            BufferedReader tempFileReader = new BufferedReader(new FileReader(tempFile));
            String line2;
            System.out.println("Content of the redacted file:");
            while ((line2 = tempFileReader.readLine()) != null) {
                System.out.println(line2);  // Print each line of the redacted file
                System.out.println("Hi");
            }
        } catch (IOException e) {
            System.out.println("Trouble reading or writing to file: " + e);
        }
    }
}
