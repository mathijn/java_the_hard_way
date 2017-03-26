import java.util.Scanner;

public class myPigGame{

	public static int counterPlayer, counterComp;
	public static int dice;

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		boolean stop;
		System.out.print("Computer is goign first: ");
		do{
			myPigGame.computerPlays();
			if(counterComp < 30){
				myPigGame.playerPlays();
			}else{
				System.out.println("\n\n\nCOMPUTER WINS!!");
			}
			if(counterPlayer < 30 ){
				myPigGame.computerPlays();
			}else{
				System.out.println("\n\n\n PLAYERRRR WINS!!");
			}
		}while(counterPlayer < 30 || counterComp < 30);
	}

	public static void computerPlays(){
		int again=0;
		Scanner key = new Scanner(System.in);
		System.out.println("Computer plays");
		do{
			dice = myPigGame.randomDice();
			counterComp = counterComp+=dice;
			again = again+=dice;
			System.out.println("\n\tComputer rolled: "+dice);
			if(dice != 1){
				System.out.println("\tComputer scored: "+counterComp);
			}else{
				System.out.println("\n\tOuch! computer rolled 1, which means.. ");
				counterComp = 0;
			}
		}while(again < 20 && dice != 1);
		System.out.println("\tComputer's total score is: "+counterComp);
		System.out.println("------------------------------");
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
				if(dice != 1){
					System.out.println("\tYou scored: "+counterPlayer);
					System.out.print("\nDo you want to roll again? (Y/N): ");
					again = key.next().toLowerCase();
				}else{
					System.out.println("\tOuch! you rolled 1, which means.. ");
					again = "n";
					counterPlayer = 0;
				}
			}while(again.equals("y") && dice != 1);
		}
		System.out.println("\tYour total score is: "+counterPlayer);
		System.out.println("------------------------------");
	}

	public static int randomDice(){
		return (int)(6*Math.random())+1;
	}
}