import java.util.Scanner;

public class PigDice {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int roll, ptot, ctot, turnTotal, maxComputer = 20, maxPoints = 30;
		String choice = "";

		ptot = 0;
		ctot = 0;

		do {
			turnTotal = 0;
			System.out.println("You have " + ptot + " points");

			do {
				roll = (int)(6*Math.random())+1;
				System.out.println("\tYou rolled a " + roll);
				if (roll == 1){
					System.out.println("\tThis ends your turn");
					turnTotal = 0;
				} else {
					turnTotal += roll;
					System.out.println("\tYou have "+turnTotal+" points this round so far");
					System.out.println("\tDo you want to roll again? (Y/N) ");
					choice = key.next().toLowerCase();
				}
			} while (roll != 1 && choice.equals("y"));
		
			ptot += turnTotal;
			System.out.println("\n\tYou end the round with "+ptot+" points\n");

			if(ptot < maxPoints){
				turnTotal = 0;
				System.out.println("System has "+ctot+" points");
				
				do {
					roll = (int)(6*Math.random())+1;
					System.out.println("Computer rolled a "+roll);
					if (roll == 1){
						System.out.println("This ends the turn");
						turnTotal = 0;
					} else {
						turnTotal += roll;
						System.out.println("\tComputer has "+ turnTotal+" points so far");
						if( turnTotal < maxComputer){
							System.out.println("\tComputer will roll again");
						}
					}	
				} while ( roll != 1 && turnTotal < maxComputer);
			}
			ctot += turnTotal;
			System.out.println("\n\tComputer ends this round with " + ctot + " points\n");
		} while ( ptot< maxPoints && ctot < maxPoints);
		if ( ptot > ctot){
			System.out.println("Player wins!");
		} else {
			System.out.println("Computer wins!");
		}
	}
}