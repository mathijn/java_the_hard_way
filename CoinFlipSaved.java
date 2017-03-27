import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class CoinFlipSaved {

	public static String bestName;
	public static int best;
	public static String fileName = "save-high-score-coin-flip.txt";
	 

	public static void main(String[] args) throws Exception{
		/*
			This exercise is the coin flip game
			The goal is to flip a coin, and get as many heads in a row as possible. The streak needs to be saved including the name of player

			Nog leuk om toe te voegen:
			kans op Xheads in row

			6 heads in a row -> 1 op 64
			7 heads in a ros -> 1 op 128
			.
			.
			.
			10 heads in a row -> 1 op 1024
			11 heas in a rod -> 1 op 2048

		*/
		int streak = 0;
		String stop, again;
		Scanner key = new Scanner(System.in);
		System.out.println("\nYour game is starting...");
		best = checkSaveFile();
		do{
			do {
				if(coinFlip()){
					System.out.println("\n\tYou flipped HEADS!!");
					streak++;
					System.out.println("\tYou have now a streak of: "+streak);
					System.out.print("\tDo you want to continue (Y/N): ");
					stop = key.next().toLowerCase();
				}else{
					System.out.println("\n\tYou flipped tales...streak goes back to 0");
					streak = 0;
					stop = "n";
				}
			}while(stop.equals("y"));
			if(streak>best){
				System.out.println("\nYour streak is "+streak+"!!");
				System.out.print("What is your name: ");
				bestName = key.next();
				saveStreak(bestName, streak);
				System.out.println("\n");
			}else{
				System.out.println("\n\tYou did not beat the high score");
			}
			System.out.print("\tDo you want to try again (Y/N)? ");
			again = key.next().toLowerCase();
		}while(again.equals("y"));
	}



	public static int checkSaveFile() throws Exception{
		File f = new File(fileName);
		if(f.exists() && f.length()>0){
			Scanner data = new Scanner(f);
				bestName = data.next();
				best = data.nextInt();
			data.close();
			System.out.println("\nThe current high score is: "+best+" which is held by: "+bestName);
		}else{
			System.out.println("\nThere is no save file or high score set");
			best = -1;
			bestName = "";
		}
		return best;
	}



	public static boolean coinFlip(){
		double flip = 1*Math.random();
		// System.out.println(flip);
		if(flip > 0.5){
			return true;
		}
		return false;
	}



	public static void saveStreak(String bestName, int streak) throws Exception{
		PrintWriter save = new PrintWriter(fileName);
		save.println(bestName);
		save.println(streak);
		save.close();
	}
}