import java.util.Scanner;

public class addNumbers{
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int current=1, total=0;

		System.out.println("Give me a value and I will add them together, to stop input 0");

		while(current != 0){
			System.out.print("Value: ");
			current = key.nextInt();
			if (current == 0){
				System.out.println("\n The total value of all numbers is: "+total);
			}else{
				total = total += current;
				System.out.println("The total value is: "+total);
			}		
		}

	}
}