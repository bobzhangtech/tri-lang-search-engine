import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    public static void main(String[] args) {
        List<String> wordsList = new ArrayList<>();
        Path filePath = Path.of("sample_data", "sd1.txt");
        try {
            String stringContent = Files.readString(filePath);
            String messyContentWithOnlyWords = stringContent.replaceAll("[^a-zA-Z0-9]", " ");
            // System.out.println(messyContentWithOnlyWords);
            String[] words = messyContentWithOnlyWords.split(" ");
            for (String word : words) {
                if (word.equals("")) {
                    continue;
                }
                // System.out.println("[" + word + "]");
                String standardizedWord = word.trim().toLowerCase();
                wordsList.add(standardizedWord);
            }

            for (String word : wordsList) {
                System.out.println("[" + word + "]");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
