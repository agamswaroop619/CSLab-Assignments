import java.util.Scanner;

public class _2104373_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();
        scanner.close();

        int wordCount = countWords(inputSentence);
        int charCount = countNonSpaceCharacters(inputSentence);

        int product = wordCount * charCount;
        System.out.println("Output: " + product);
    }

    public static int countWords(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }

    public static int countNonSpaceCharacters(String sentence) {
        return sentence.replaceAll("\\s", "").length();
    }
}
