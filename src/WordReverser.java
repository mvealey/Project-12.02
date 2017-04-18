import java.util.Stack;

public class WordReverser {

	private static Stack<Character> wordStack;
	
	public WordReverser() {
		wordStack = new Stack<Character>();
	}
	
	public static String reverse(String iSentence) {
		
		String finalString = "";
		Character currentChar = ' ';
		
		//walk the sentence
		for(int i = 0; i < iSentence.length(); i++) {

			currentChar = iSentence.charAt(i); 

			//word separator?
			if (currentChar.equals(' ')) {
				//get the reversed word
				finalString += reversedWord() + " ";
			} else {
				//load the next character
				wordStack.push(currentChar);
			}
		}

		//get the final word
		finalString += reversedWord();

		return finalString;
	}

	private static String reversedWord() {
		String word = "";
		int i = 0;
		int stackSize = wordStack.size(); 
		
		do {
			word += (wordStack.pop()).toString();
			i++;
		} while (i < stackSize);
		
		//did we have a period?
		if (word.charAt(0) == '.') {
			word = word.substring(1) + word.substring(0, 1);
		}
		
		return word;
	}

}
