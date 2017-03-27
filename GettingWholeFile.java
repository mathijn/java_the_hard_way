import java.io.File;
import java.util.Scanner;

public class GettingWholeFile {
	public static void main(String[] args) throws Exception {
		int fourLetter = 0;
		int caps = 0;

		String fn1 = "some-words.txt";
		String fn2 = "GettingWholeFile.java";

		Scanner fileReader = new Scanner(new File(fn1));

		while (fileReader.hasNext()){
			String w = fileReader.next();
			if (w.length() == 4){
				fourLetter++;
			}
		}
		fileReader.close();

		System.out.println(fourLetter + " words have length 4 in "+fn1);

		Scanner readFile = new Scanner(new File(fn2));
		/*

		Dit werkt niet omdat .isUpperCase een char wil als parameter. Subsring(0,1) levert een string.

		while (readFile.hasNext()){
			String word = readFile.next();
			word = word.substring(0,1);
			if(Character.isUpperCase(word)){
				caps++;
			}
		}
		*/

		while (readFile.hasNext()){
			String word = readFile.next();
			if(Character.isUpperCase(word.charAt(0))){
				caps++;
			}
		}

		System.out.println(caps + " Words in \""+fn2+"\" start with a capital");
	}
}