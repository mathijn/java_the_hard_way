import java.util.Scanner;

public class HighLow{
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		//need to set a random numer

		//ask for input
		//check if input is higher or lower

		//if (input > number)
		//then print: too high
		//if (input < number)
		//then print: too low
		//if(input == number)
		// guessed right

		int number = (int) (100*Math.random());
		
		//System.out.println(number);

		System.out.println("Guess a number between 0-99");
		int guess = key.nextInt();
		while(guess != number){
			if(guess > number){
				System.out.println("You guessed too high");
				
			}else if(guess < number){
				System.out.println("You guessed too low");
			}
			System.out.println("Try again:");
			guess = key.nextInt();
		}
		System.out.println("You guessed right!");
	}
}