package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
	public static boolean scrabble(String characters, String word) {
		ArrayList<Character> charList = new ArrayList<>();
		for (int i = 0; i < characters.length(); i++) {
			charList.add(Character.toLowerCase(characters.charAt(i)));
		}

		for (int i = 0; i < word.length(); i++) {
			char c = Character.toLowerCase(word.charAt(i));
			if (!charList.remove((Character) c)) {
				return false;
			}
		}
		return true;
	}
}
//END
