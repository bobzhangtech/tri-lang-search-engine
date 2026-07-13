import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<String> fileNamesList = new ArrayList<>();
        Map<String, Integer> outputMap = new HashMap<>();
        String folderName = "sample_data";

        DirectoryScanner.getFileNames(fileNamesList, folderName);

        String userInput = "the"; // For testing only, delete later

        for (String fileName : fileNamesList) {
            List<String> wordsList = new ArrayList<>();

            FileReader.extractWords(wordsList, folderName, fileName);

            int count = 0;

            for (String word : wordsList) {
                if (userInput.equals(word)) {
                    count++;
                }
            }

            outputMap.put(fileName, count);
        }

        outputMap.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));
    }
}
