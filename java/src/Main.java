import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> wordsList = new ArrayList<>();
        String folderName = "sample_data";
        String fileName = "sd1.txt";

        FileReader.storeFile(folderName, fileName, wordsList);

        for (String word : wordsList) {
            System.out.println("[" + word + "]");
        }
    }
}
