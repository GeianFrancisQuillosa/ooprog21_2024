import java.util.Scanner;

public class SpoonerismGenerator {
    
    public static void main(String[] args) {
        SpoonerismGenerator generator = new SpoonerismGenerator();
        generator.run();
    }
    
    // Method to get a word from the user
    private String getWord(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
    
    // Method to find the index of the first vowel in a word
    private int vowelIndex(String word) {
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < word.length(); i++) {
            if (vowels.indexOf(word.charAt(i)) != -1) {
                return i;
            }
        }
        return -1; // Return-1 if no vowel is found
    }
    
    // Method to run the main logic of the program
    private void run() {
        String word1 = getWord("Enter the first word: ");
        String word2 = getWord("Enter the second word: ");
        
        int index1 = vowelIndex(word1);
        int index2 = vowelIndex(word2);
        
        // Check if both words are valid for spoonerism
        if (index1 == -1 || index1 == 0 || index2 == -1 || index2 == 0) {
            System.out.println(word1 + " and " + word2 + " are not good words to spoonerize.");
        } else {
            // swap the initial consonants
            String firstPart1 = word1.substring(0, index1);
            String firstPart2 = word2.substring(0, index2);
            String rest1 = word1.substring(0, index1);
            String rest2 = word2.substring(0, index2);
            
            String spoonerizedWord1 = firstPart2 + rest1;
            String spoonerizedWord2 = firstPart1 + rest2;
            
            System.out.println(word1 + " and " + word2 + " spoonerized are " + spoonerizedWord1 + " " + spoonerizedWord2);
        }
    }
}

