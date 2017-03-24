import java.util.Scanner;

public class RudeQuestions {
	public static void main(String[] args) {
		String name;
		int age;
		double weight, income;

		Scanner key = new Scanner(System.in);

		System.out.println("What is your name? ");
		name = key.next();
		System.out.println("Hi "+name+"! How old are you?");
		age = key.nextInt();
		System.out.println("How much do you weight?");
		weight = key.nextDouble();
		System.out.println("You weigh: "+weight);
	}
}