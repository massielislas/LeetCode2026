package org.solutions;

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        final String shorterWord = word1.length() < word2.length() ? word1 : word2;
        final String longerWord = word1.length() >= word2.length() ? word1 : word2;
        StringBuilder combinedWord = new StringBuilder();

        for (int i = 0; i < shorterWord.length(); i++) {
            combinedWord.append(word1.charAt(i));
            combinedWord.append(word2.charAt(i));
        }

        if (word1.length() != word2.length()) {
            combinedWord.append(longerWord.substring(shorterWord.length()));
        }

        return combinedWord.toString();
    }
}
