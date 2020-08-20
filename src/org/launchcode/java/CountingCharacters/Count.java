package org.launchcode.java.CountingCharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");

        String quote = input.nextLine();

        char[] charactersInQuote = quote.toLowerCase().toCharArray();

        HashMap<Character, Integer> characterCount = new HashMap<>();
        for(char c: charactersInQuote) {
            if (Character.isAlphabetic(c)) {
                if (characterCount.containsKey(c)) {
                    characterCount.put(c, characterCount.get(c) + 1);
                } else {
                    characterCount.put(c, 1);
                }
            }
        }
        for(Map.Entry<Character, Integer> display : characterCount.entrySet()) {
            System.out.println(display.getKey() + ": " + display.getValue());
        }

    }
}
