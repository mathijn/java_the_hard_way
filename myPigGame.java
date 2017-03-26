import java.util.Scanner;

public class myPigGame{

	public static int counterPlayer, counterComp;
	public static int dice;

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		String fPlayer;
		System.out.print("C for comp, P for player: ");
		fPlayer = key.next().toLowerCase();
		if(fPlayer.equals("c")){
			myPigGame.computerPlays();
		}else{
			System.out.println("Player plays");
			myPigGame.playerPlays();
			if(myPigGame.playerPlays()){
				// myPigGame.computerPlays();
				System.out.println("COMPUTERRRR");
			}
		}
	}

	public static int computerPlays(){
		System.out.println("Computer plays");
		counterComp = counterComp++;
		return counterComp;
	}

	public static boolean playerPlays(){
		String again = "y";
		Scanner key = new Scanner(System.in);
		do{
			dice = myPigGame.randomDice();
			counterPlayer = counterPlayer+=dice;
			System.out.println("\tYou rolled: "+dice);
			if(dice == 1){
				again = "n";
				counterPlayer = 0;
				System.out.print("\tOuch! you rolled 1, which means.. ");
				return true;
			}else{
				System.out.println("\tYou scored: "+counterPlayer);
				System.out.print("\nDo you want to roll again? (Y/N)");
				again = key.next().toLowerCase();
				again = "y";
			}
		}while(again.equals("y") && dice != 1);
		System.out.println("Your score is: "+counterPlayer);
		return true;
	}

	public static int randomDice(){
		return (int)(6*Math.random())+1;
	}
}