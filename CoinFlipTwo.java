import java.util.Scanner;

public class CoinFlipTwo{
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		boolean gotHeads;
		int streak = 0;
		String coin, again = "y";

		while(again.toLowerCase().equals("y")){
			double rnd = Math.random();
			gotHeads = rnd < 0.5;

			if (gotHeads){
				coin = "head";
			}else{
				coin = "tales";
			}

			System.out.println("You flipped a coin and it is: "+coin);

			if(gotHeads){
				streak++;
				System.out.println("\tThat is "+streak+" in a row!");
				System.out.println("\tDo you want to flip again? (Y/N)");
				again = key.next();
			}else{
				streak = 0;
				again = "n";
				if(streak == 0){
					System.out.println("\tYour first try was "+coin+", you lose big time!");
				}else{
					System.out.println("\tYou lost everything, you should have stopped while ahead");
				}
			}
		}

		System.out.println("\tYour score is "+streak);
	}
}