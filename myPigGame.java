import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class myPigGame{

	/*
	Voor de Pig game gebruik ik een aantal methods, echter is dat niet noodzakelijk maar doe ik het puur als oefening
	*/

	public static int counterPlayer, counterComp, dice, maxScore = 30;

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Welcome to the Pig game! The goal of this game is to get 100 by rolling a dice.");
		System.out.println("If you hit 1 your score goes back to 0 and the next player can give a go. You can choose to stop play once you scored enough");
		System.out.println("\nComputer is going first");
		do{
			myPigGame.computerPlays();
			if(counterComp < maxScore){
				myPigGame.playerPlays();
			}else{
				System.out.println("Computer wins!");
			}
		}while(counterPlayer < maxScore && counterComp < maxScore);

		if(counterComp < counterPlayer){
			System.out.println("Player wins!");
		}
	}

	public static void computerPlays(){
		int again=0;
		Scanner key = new Scanner(System.in);
		System.out.println("\nComputer plays");
		do{
			try {
			    Thread.sleep(750);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}

			dice = myPigGame.randomDice();
			counterComp = counterComp+=dice;
			again = again+=dice;
			System.out.println("\n\tComputer rolled: "+dice);
			if(dice != 1 && counterComp < maxScore){
				System.out.println("\tComputer scored: "+counterComp);
			}else if(counterComp >= maxScore){
				System.out.println("\tComputer scored: "+counterComp);
			}else{
				System.out.println("\n\tOuch! computer rolled 1, which means.. ");
				counterComp = 0;
			}
		}while(again < 20 && dice != 1);

		System.out.println("\tComputer's total score is: "+counterComp);
		System.out.println("\n----------------------------------------------------------");
	}

	public static void playerPlays(){
		String again;
		Scanner key = new Scanner(System.in);
		System.out.println("\nPlayer plays");
		System.out.print("Are you ready? (Y/N): ");
		String ready = key.next().toLowerCase();
		if(ready.equals("n")){
			myPigGame.playerPlays();
		}else{
			do{
				dice = myPigGame.randomDice();
				counterPlayer = counterPlayer+=dice;
				System.out.println("\n\tYou rolled: "+dice);
				if(dice != 1 && counterPlayer < maxScore){
					System.out.println("\tYou scored: "+counterPlayer);
					System.out.print("\nDo you want to roll again? (Y/N): ");
					again = key.next().toLowerCase();
				}else if (counterPlayer >= maxScore){
					System.out.println("\tYou scored: "+counterPlayer);
					again = "n"; 
				}else{
					System.out.println("\tOuch! you rolled 1, which means.. ");
					again = "n";
					counterPlayer = 0;
				}
			}while(again.equals("y") && dice != 1);
		}
		System.out.println("\tYour total score is: "+counterPlayer);
		System.out.println("\n----------------------------------------------------------");
	}

	public static int randomDice(){
		return (int)(6*Math.random())+1;
	}
}