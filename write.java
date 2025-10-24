package coding; // ✅ only include this if your file is in a folder named 'coding'

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption; // ✅ required import
import java.util.List;

public class write {  // ✅ file name must be 'write.java'
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\HP\\Desktop\\adarsh.txt");

        try {
            // Write a line to the file
            Files.writeString(path, "Writing to file using Java NIO Files API.\n");

            // Append more lines instead of overwriting
            Files.write(path, List.of("Line 1", "Line 2", "Line 3"), StandardOpenOption.APPEND);

            System.out.println("File written successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
