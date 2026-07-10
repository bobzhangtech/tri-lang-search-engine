import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> fileNamesList = new ArrayList<>();
        List<String> wordsList = new ArrayList<>();
        String folderName = "sample_data";

        DirectoryScanner.getFileNames(fileNamesList, folderName);

        for (String fileName : fileNamesList) {
            FileReader.extractWords(wordsList, folderName, fileName);

            for (String word : wordsList) {
                System.out.println("[" + word + "]");
            }
        }
    }
}
