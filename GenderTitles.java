import java.util.Scanner;

public class GenderTitles{
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		String title;

		System.out.print("First name: ");
		String fname = key.next();
		System.out.print("Last name: ");
		String lname = key.next();
		System.out.print("Gender (M/F): ");
		String gender = key.next();

		if(gender.equals("F")){
			System.out.print("Are you married "+fname+"? (Y/N) ");
			String married = key.next();
			if(married.equals("Y")){
				title = "Mrs. ";
			}else{
				title = "Ms. ";
			}
		}else {
			//if this would become an other if statement like if(gender.equals("M")), then the compiler will give an error becaues there is a way for title not to be set, which gives an error.
			title = "Mr. ";
		}

		System.out.println("\n"+title+" "+fname+" "+lname);
	}
}