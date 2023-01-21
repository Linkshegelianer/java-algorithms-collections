import org.apache.commons.lang3.ArrayUtils;

class MakeCensored {
	public static String makeCensored(String text, String[] stopWords) {
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
	public static void main(String[] args) {
		String example1 = "word1 word2 word3 word4";
		String[] example2 = {"word2", "word3"};
		System.out.println(makeCensored(example1, example2));
	}
}
