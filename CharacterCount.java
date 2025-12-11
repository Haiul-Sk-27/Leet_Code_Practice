import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CharacterCount {
    public static void main(String[] args) {

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try (
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"))
        ) {
            String currentLine = reader.readLine();

            while (currentLine != null) {

                lineCount++;

                String[] words = currentLine.trim().split("\\s+");

                if (!currentLine.trim().isEmpty()) {
                    wordCount += words.length;
                }

                for (String word : words) {
                    charCount += word.length();
                }

                currentLine = reader.readLine();
            }

            System.out.println("Number of characters in file: " + charCount);
            System.out.println("Number of words in file: " + wordCount);
            System.out.println("Number of lines in file: " + lineCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
