import java.util.Scanner;

public class ForgetfulMachine {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("What city is the capital of France?");
		keyboard.next();
		System.out.println("What is 6*7?");
		keyboard.nextInt();
	}
}