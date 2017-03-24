import java.util.Scanner;

public class DictionaryOrder {
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		String input;

		System.out.print("Write a programming language: ");
		input = key.next();
		String cplusplus = "c++";
		String php = "PhP";

		if(input.toLowerCase().compareTo(cplusplus.toLowerCase()) < 0){
			System.out.println(input+" comes BEFORE "+cplusplus);
		}
		if(input.toLowerCase().compareTo(cplusplus.toLowerCase()) == 0){
			System.out.println(cplusplus+" is already is a programming language");
		}
		if(input.toLowerCase().compareTo(cplusplus.toLowerCase()) > 0){
			System.out.println(input+" comes AFTER "+cplusplus);
		}

		if(input.toLowerCase().compareTo(php.toLowerCase()) < 0){
			System.out.println(input+" comes BEFORE "+php);
		}
		if(input.toLowerCase().compareTo(php.toLowerCase()) == 0){
			System.out.println(php+" is already is a programming language");
		}
		if(input.toLowerCase().compareTo(php.toLowerCase()) > 0){
			System.out.println(input+" comes AFTER "+php);
		}

	}
}