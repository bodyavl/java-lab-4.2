package org.lab;

import static org.lab.Decoder.decodeMessage;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String encryptedMessage1 = "t2st3ng uftujoh";
        String encryptedMessage2 = "h2ll4";

        System.out.println("Encrypted Message 1: " + encryptedMessage1);
        System.out.println("Decoded Message 1: " + decodeMessage(encryptedMessage1));

        System.out.println("\nEncrypted Message 2: " + encryptedMessage2);
        System.out.println("Decoded Message 2: " + decodeMessage(encryptedMessage2));
    }
}