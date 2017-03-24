import java.util.Scanner;

public class SafeSquareRoot{
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		double x, y;

		System.out.println("Give me a number and let me calculate it's square root");
		x = key.nextDouble();

		while(x < 0){
			System.out.println("A negative number does not have a aquare root, you want I change it into a positive number? (Y/N)");
			String change = key.next();
			if(change.toLowerCase().equals("y")){
				x = Math.abs(x);
			}else{
				System.out.print("Give a new number: ");
				x = key.nextDouble();
			}	
		}

		y = Math.sqrt(x);

		System.out.println("The square root of "+x+" is: "+y);
	}
}