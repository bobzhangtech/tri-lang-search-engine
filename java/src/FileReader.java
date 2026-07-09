import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileReader {
    public static void storeFile(String folderName, String fileName, List<String> wordsList) {
        Path filePath = Path.of(folderName, fileName);
        try {
            String stringContent = Files.readString(filePath);
            String messyContentWithOnlyWordsAndIrregularSpaces = stringContent.replaceAll("[^a-zA-Z0-9]", " ");
            // System.out.println(messyContentWithOnlyWordsAndIrregularSpaces);
            String[] words = messyContentWithOnlyWordsAndIrregularSpaces.split(" ");
            for (String word : words) {
                // System.out.println("[" + word + "]");
                if (word.equals("")) {
                    continue;
                }
                // System.out.println("[" + word + "]");
                String standardizedWord = word.toLowerCase();
                wordsList.add(standardizedWord);
            }
            // for (String word : wordsList) {
            // System.out.println("[" + word + "]");
            // }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
