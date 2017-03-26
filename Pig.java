import java.util.Scanner;

public class Pig{
	public static void main(String[] args) {
		int roll, total;
		total = 0;
		int maxComputer = 20;
		do{
			roll = (int)(6*Math.random())+1;
			System.out.println("\n\tComputer rolled a "+ roll);
			if (roll == 1){
				System.out.println("\tYou know what happens...");
				total = 0;
			}else{
				total = total+=roll;
				System.out.println("\tComputer has "+total+" points this round");
				if (total < maxComputer){
					System.out.println("\tComputer will roll again");
				}
			}
		} while( roll != 1 && total < 20);
		
		System.out.println("\nComputer ends the round with "+ total + " points.");
	}
}