import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class DirectoryScanner {
    public static void scanDirectory(String directoryName) {
        Path directoryPath = Paths.get(directoryName);
        try (Stream<Path> stream = Files.list(directoryPath)) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            System.err.println("Error reading directory: " + e.getMessage());
        }
    }
}
