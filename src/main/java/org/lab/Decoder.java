package org.lab;

public class Decoder {
    public static String decodeVowelReplacement(String input) {
        return input.replaceAll("1", "a")
                .replaceAll("2", "e")
                .replaceAll("3", "i")
                .replaceAll("4", "o")
                .replaceAll("5", "u");
    }

    public static String decodeConsonantReplacement(String input) {
        StringBuilder decoded = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                char decodedChar = (char) (c - 1);
                if (decodedChar > 'z') {
                    decodedChar = 'a';
                } else if (!Character.isLetter(decodedChar)) {
                    decodedChar++; // Skip non-alphabetic characters
                }
                decoded.append(decodedChar);
            } else {
                decoded.append(c);
            }
        }
        return decoded.toString();
    }

    public static String decodeMessage(String message) {
        StringBuilder result = new StringBuilder();
        String[] words = message.split("\\s+");

        for (String word : words) {
            if (isVowelReplacementEncoded(word)) {
                result.append(decodeVowelReplacement(word)).append(" ");
            } else if (isConsonantReplacementEncoded(word)) {
                result.append(decodeConsonantReplacement(word)).append(" ");
            } else {
                // If the encoding type is unknown, leave the word unchanged
                result.append(word).append(" ");
            }
        }

        return result.toString().trim();
    }

    private static boolean isVowelReplacementEncoded(String word) {
        return word.matches(".*\\d.*");
    }

    private static boolean isConsonantReplacementEncoded(String word) {
        return word.matches("[a-zA-Z]+");
    }
}
