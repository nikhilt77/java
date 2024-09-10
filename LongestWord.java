import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        scanner.close();

        String longestWord = findLongestWord(text);

        System.out.print("The longest word in the text is: " + longestWord);
    }

    public static String findLongestWord(String text) {
        String[] words = text.split("\\s+");

        String longestWord = "";
        int maxLength = 0;

        for (String word : words) {
            if (word.length() > maxLength) {
                longestWord = word;
                maxLength = word.length();
            }
        }

        return longestWord;
    }
}
