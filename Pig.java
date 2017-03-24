import java.util.Scanner;

public class Pig{
	public static void main(String[] args) {
		/*
		This program is a Pig game. The goal of this game is to get 100 points by rolling a dice. If you roll 1 your turn is over and your score goes back to 0.
		The player may choose to stop which means the turn goes to the next player.

		steps:
		1. player welcome
		2. player rolls dice = random 1-6
			- check != 1
			- if != 1 -> dice + counter
				- ask if want to roll again
			- if == 1 -> counter == 0

		3. computer will stop when counter == 20
		*/

		int dice, counter = 0, stop = 1;

		System.out.println("Welcome to the Pig game! The goal of this game is to get 100 by rolling a dice.");
		System.out.println("If you hit 1 your score goes back to 0 and the next player can give a go. You can choose to stop play once you scored enough");
		System.out.println("");

		do {
			dice = 1+(int)(6*Math.random());
			System.out.println("\tComputer rolls and gets a: "+dice);
			if(dice != 1){
				counter = counter += dice;
				System.out.println("\tTotal score is now: "+counter);
				if(counter > 20){
					System.out.println("\nComputer stops");
				}
			}else{
				counter = 0;
				System.out.println("\tBummer, you rolled 1, which means....");
			}

		}while(counter < 20 && dice != 1);
		System.out.println("\nTotal this round: "+counter+" points");
	}
}