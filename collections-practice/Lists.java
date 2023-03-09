/*
The method represents a game called "scrabble" where you create words from random strings of characters.
It takes a string of characters and a word as an input: if this word can be created from given characters, the method
returns true.
 */

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static boolean scrabble(String characters, String word) {
        ArrayList<Character> charList = new ArrayList<>(); // declate a new ArrayList which will hold separate characters
        for (int i = 0; i < characters.length(); i++) {
            charList.add(Character.toLowerCase(characters.charAt(i))); // add lowercase version of each characters
        }

        for (int i = 0; i < word.length(); i++) { // iterate over each character in the given word
            char c = Character.toLowerCase(word.charAt(i));
            if (!charList.remove((Character) c)) { // if we cannot remove a char from word --
                return false; // it means it does not exist in the ArrayList, return false
            }
        }
        return true; // if all chars can be removed, it means they are all present in the ArrayList
    }

    public static void main(String[] args) {
        System.out.println(scrabble("rkqodlw", "woRld")); // must be true
        System.out.println(scrabble("jvayu", "java")); // must be false
        System.out.println(scrabble("", "java")); // must be false
    }
}