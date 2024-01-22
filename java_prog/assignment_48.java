//Wap in java which will copy the content of one file into another.
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class assignment_48 {

    public static void main(String[] args) {
        // Specify the paths of the source and destination files
        String sourceFilePath = "source.txt";
        String destinationFilePath = "destination.txt";

        try (
            // Create a FileInputStream to read from the source file
            FileInputStream fis = new FileInputStream(sourceFilePath);

            // Create a FileOutputStream to write to the destination file
            FileOutputStream fos = new FileOutputStream(destinationFilePath)
        ) {
            // Create a buffer to hold data read from the source file
            byte[] buffer = new byte[4096]; // 4 KB buffer size

            int bytesRead;

            // Read data from the source file into the buffer and write it to the destination file
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("File copy successful!");
        } catch (IOException e) {
            // Handle IOException if any error occurs during file copy
            System.err.println("Error copying file: " + e.getMessage());
        }
    }
}
