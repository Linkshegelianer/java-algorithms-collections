/* The method gets a String and an String[] array, which returns new String with Strings listed in the array replaced by "$#%!". 
/* It can be implemented with & without using ArrayUtils class from Apache Commons Lang. 
*/
import org.apache.commons.lang3.ArrayUtils;

class FindAndReplaceStringsInArray {
	
	public static String makeCensoredWithArrayUtils(String text, String[] stopWords) {
		var words = text.split(" ");
		var wordsCount = words.length;
		var censoredWords = new String[wordsCount];
		
		for (var i = 0; i < wordsCount; i++) {
			var word = words[i];
			var newWord = ArrayUtils.contains(stopWords, word) ? "$#%!" : word;
			censoredWords[i] = newWord;
		}
		return String.join(" ", censoredWords);
	}

	public static String makeCensoredWithoutArrayUtils(String text, String[] stopWords) {
		var words = text.split(" ");
		var wordsCount = words.length;
		var censoredWords = new String[wordsCount];
		
        for (var i = 0; i < wordsCount; i++) { // this version of the method uses a nested for loop to check if the current word from the input text is in the array
            var word = words[i];
            boolean found = false;
            for (int j = 0; j < stopWords.length; j++) {
                if (stopWords[j].equals(word)) {
                    found = true;
                    break;
                }
            }
            var newWord = found ? "$#%!" : word;
            censoredWords[i] = newWord;
        }
        return String.join(" ", censoredWords);
    }
	
	public static void main(String[] args) {
		String example1 = "word1 word2 word3 word4";
		String[] example2 = {"word2", "word3"};
		System.out.println(makeCensoredWithArrayUtils(example1, example2)); // must be word1 $#%! $#%! word4
		System.out.println(makeCensoredWithoutArrayUtils(example1, example2)); // results are the same
	}
}
