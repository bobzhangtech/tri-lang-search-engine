import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class DirectoryScanner {
    public static void getFileNames(List<String> fileNamesList, String directoryName) {
        Path directoryPath = Paths.get(directoryName);
        try (Stream<Path> stream = Files.list(directoryPath)) {
            stream.forEach(path -> fileNamesList.add(path.getFileName().toString()));
        } catch (IOException e) {
            System.err.println("Error reading directory: " + e.getMessage());
        }
    }
}
