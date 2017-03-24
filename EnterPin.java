import java.util.Scanner;

public class EnterPin {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int pin;

		System.out.println("\nWelcome to the bank of Java");
		System.out.print("Please enter your pin: ");
		pin = key.nextInt();

		while (pin != 1234){
			System.out.println("\nPin is incorrect");
			System.out.print("Please enter your pin: ");
			pin = key.nextInt();
		}

		System.out.println("\nYour bankstatement is $ 5.000.000");
	}
}