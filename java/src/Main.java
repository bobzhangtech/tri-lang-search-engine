import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> fileNamesList = new ArrayList<>();
        List<String> wordsList = new ArrayList<>();
        String folderName = "sample_data";

        String userInput = "very";

        DirectoryScanner.getFileNames(fileNamesList, folderName);

        for (String fileName : fileNamesList) {
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
