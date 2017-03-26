import java.util.Scanner;s

public class mathijnPractise{
	
	public static int c;

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		mathijnPractise obj = new mathijnPractise();
		System.out.println("Give two numbers, I will do some calculations with them");
		System.out.print("Number a: ");
		int a = key.nextInt();
		System.out.print("Number b: ");
		int b = key.nextInt();

		int answer = subtract(a,b);
		System.out.println(a+" - "+b+" = "+answer);
		mathijnPractise.whatIsC();
	}

	public static int subtract(int a, int b){
		mathijnPractise obj = new mathijnPractise();
		obj.c = (a-b);
		return obj.c;
	}

	public static void whatIsC(){
		mathijnPractise obj = new mathijnPractise();
		System.out.println(obj.c);
	}

}