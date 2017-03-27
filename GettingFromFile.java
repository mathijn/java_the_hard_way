import java.io.File;
import java.util.Scanner;

public class GettingFromFile {
	public static void main(String[] args) throws Exception {
		String name;
		int a, b, c, sum;

		System.out.print("Getting name and three numbers from file...");
		Scanner fileIn = new Scanner(new File("gettingfromfile.txt"));
		name = fileIn.nextLine();
		a = fileIn.nextInt();
		b = fileIn.nextInt();
		c = fileIn.nextInt();
		fileIn.close();

		sum = a+b+c;
		System.out.println("\nYour name is: "+name);
		System.out.println(a+" + "+b+" + "+c+" = "+sum);

	}
}