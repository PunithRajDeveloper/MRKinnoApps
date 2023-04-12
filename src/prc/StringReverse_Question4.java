package prc;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringReverse_Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the sentence
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        scanner.close();

        // Remove duplicate characters and extra spaces
        String cleanedSentence = cleanSentence(input);

        // Reverse the sentence with reverse in word characters
        String reversedSentence = reverseSentence(cleanedSentence);

        // Print the reversed sentence
        System.out.println("Reversed Sentence: " + reversedSentence);
    }

    public static String cleanSentence(String sentence) {
        StringBuilder cleanedSentence = new StringBuilder();
        Set<Character> uniqueChars = new HashSet<>();
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (c != ' ' || !uniqueChars.contains(c)) {
                cleanedSentence.append(c);
                uniqueChars.add(c);
            }
        }
        return cleanedSentence.toString();
    }

    public static String reverseSentence(String sentence) {
        StringBuilder reversedSentence = new StringBuilder();
        String[] words = sentence.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(reverseWord(words[i]));
            if (i > 0) {
                reversedSentence.append(" ");
            }
        }
        return reversedSentence.toString();
    }

    public static String reverseWord(String word) {
        return new StringBuilder(word).reverse().toString();
    }
}

