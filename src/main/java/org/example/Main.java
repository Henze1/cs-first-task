package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String inputString = "The sun sets, casting golden hues over the tranquil lake. Birds return to their nests, while crickets begin their evening symphony.";

        int choice;
        do {
            System.out.print("""
                1. See uppercase words
                2. See lowercase words
                Choose an option:""");
            choice = sc.nextInt();
        } while (choice < 1 || choice > 2);
        if (choice == 1) {
            List<String> uppercaseWords = findUppercaseWords(inputString);
            System.out.println("Uppercase words: " + uppercaseWords);
        } else {
            List<String> lowercaseWords = findLowercaseWords(inputString);
            System.out.println("Lowercase words: " + lowercaseWords);
        }
    }

    public static List<String> findUppercaseWords(String inputString) {
        String[] words = inputString.split("\\s+");
        List<String> uppercaseWords = new ArrayList<>();

        for (String word : words) {
            if (Character.isUpperCase(word.charAt(0))) {
                uppercaseWords.add(word);
            }
        }

        return uppercaseWords;
    }

    public static List<String> findLowercaseWords(String inputString) {
        String[] words = inputString.split("\\s+");
        List<String> lowercaseWords = new ArrayList<>();

        for (String word : words) {
            if (Character.isLowerCase(word.charAt(0))) {
                lowercaseWords.add(word);
            }
        }

        return lowercaseWords;
    }
}