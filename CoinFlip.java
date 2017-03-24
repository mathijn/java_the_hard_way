import java.util.Scanner;

public class CoinFlip{
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		String coin, again;
		int streak = 0;
		boolean gotHeads;
		do{
			double rnd = Math.random();
			gotHeads = rnd < 0.5;
			// System.out.println(rnd);
			// System.out.println(gotHeads);
			if (gotHeads){
				coin = "heads";
			}
			else{
				coin = "tailes";
			}
			
			System.out.println("You flipped the coin and it is..."+coin);
			
			if (gotHeads){
				streak++;
				System.out.println("\tThat's "+streak+" in a row!");
				System.out.print("\tDo you want to go again? (Y/N) ");
				again = key.next();
			}else{
				if(streak == 0){
					System.out.println("Your first try was tales, you lose! :-(");
					streak = 0;
					again = "n";
				}else{
					System.out.println("\tYou lost everything");
					System.out.println("\tYou should have quit while you were ahead!");
					streak = 0;
					again = "n";
				}
			}
		}while (again.toLowerCase().equals("y"));
		

		System.out.println("Final score: "+streak);

	}
}