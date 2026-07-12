import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> fileNamesList = new ArrayList<>();
        String folderName = "sample_data";

        String userInput = "the";

        DirectoryScanner.getFileNames(fileNamesList, folderName);

        for (String fileName : fileNamesList) {
            List<String> wordsList = new ArrayList<>();

            FileReader.extractWords(wordsList, folderName, fileName);

            int count = 0;

            for (String word : wordsList) {
                if (userInput.equals(word)) {
                    count++;
                }
            }

            System.out.println(fileName + " - " + count);
        }
    }
}
