import java.util.Scanner;

public class Pig{

	int maxScore = 100;
	Scanner key = new Scanner(System.in);


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


		Pig.whoGoesFirst();
	}

	public static void whoGoesFirst(){
		Pig obj = new Pig();
		System.out.println("Welcome to the Pig game! The goal of this game is to get 100 by rolling a dice.");
		System.out.println("If you hit 1 your score goes back to 0 and the next player can give a go. You can choose to stop play once you scored enough");
		System.out.println("");
		System.out.println("Who wants to go first? Press \"C\" for computer, press \"P\" for player");
		String firstPlayer = obj.key.next().toLowerCase();
		if(firstPlayer.equals("c")){
			System.out.println("You chose the computer to go first");
			Pig.computerPlays();
		}else{
			System.out.println("You chose to go first, good luck!");
			Pig.playerPlays();
		}
	}


	public static void computerPlays(){
		Pig obj = new Pig();

		int dice, counter = 0, stop = 1, maxComp = 20;

		do {
			dice = 1+(int)(6*Math.random());
			System.out.println("\tComputer rolls and gets a: "+dice);
			if(dice != 1){
				counter = counter += dice;
				System.out.println("\tTotal score is now: "+counter);
				if(counter > maxComp){
					System.out.println("\nComputer stops");
				}
			}else{
				counter = 0;
				System.out.println("\tBummer, you rolled 1, which means....");
			}
		}while(counter < maxComp && dice != 1);

		if(counter >= obj.maxScore){
			System.out.println("\nComputer won!!");
		}else{
			System.out.println("\nTotal points this round: "+counter+" points");
			System.out.println("It is the players turn now");
			Pig.playerPlays();
		}
	}

	public static void playerPlays(){
		Pig obj = new Pig();

		int dice, counter = 0, stop = 1, maxComp = 20;

		do {
			dice = 1+(int)(6*Math.random());
			System.out.println("\tPlayer rolls and gets a: "+dice);
			if(dice != 1){
				counter = counter += dice;
				System.out.println("\tTotal score is now: "+counter);
				if(counter > maxComp){
					System.out.println("\nPlayer stops");
				}
			}else{
				counter = 0;
				System.out.println("\tBummer, you rolled 1, which means....");
			}
		}while(counter < maxComp && dice != 1);

		if(counter >= obj.maxScore){
			System.out.println("\nPlayer won!!");
		}else{
			System.out.println("\nTotal points this round: "+counter+" points");
			System.out.println("It is the computers turn now");
			// Pig.computerPlays(); THIS IS A LOOP
		}
	}
}
