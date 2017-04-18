import java.util.Scanner;

public class WordReverserDriver {

	public static void main(String[] args) {
		
		WordReverser reverser = new WordReverser();

		String sentenceIn;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a sentence: ");
		sentenceIn = scan.nextLine();
		
		System.out.println(reverser.reverse(sentenceIn));
		
		scan.close();
		
	}

}
