package coding; // ✅ include only if your file is inside the 'coding' folder

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class read{
    public static void main(String[] args) {
        // Path to the file
        Path path = Path.of("C:\\Users\\HP\\Desktop\\adarsh.txt");

        try {
            // Read all lines from the file into a List
            List<String> lines = Files.readAllLines(path);

            System.out.println("📄 File content:\n");
            for (String line : lines) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("❌ Error reading the file.");
            e.printStackTrace();
        }
    }
}

