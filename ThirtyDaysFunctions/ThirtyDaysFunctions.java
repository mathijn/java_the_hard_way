import java.util.Scanner;

public class ThirtyDaysFunctions {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		/**
		*Contains functions that make it easier to work with months.
		*/
		System.out.print("With month? (1-12): ");
		int month = key.nextInt();

		System.out.println(monthDays(month) + " days hath " + monthName(month));

	}

	/**
	*	Returns the name for the given month
	*
	*	@author	Mathijn van Dijk
	*	@param	month the month number (1-12)
	*	@return the English name of the month, or "error" if out of range
	*/

	public static String monthName(int month) {
		String monthName = "Error";

		if (month == 1){
			monthName = "January";
		}else if (month == 2){
			monthName = "Februari";
		}else if (month == 3){
			monthName = "March";
		}else if (month == 4){
			monthName = "April";
		}else if (month == 5){
			monthName = "May";
		}else if (month == 6){
			monthName = "June";
		}else if (month == 7){
			monthName = "July";
		}else if (month == 8){
			monthName = "August";
		}else if (month == 9){
			monthName = "September";
		}else if (month == 10){
			monthName = "October";
		}else if (month == 11){
			monthName = "November";
		}else if (month == 12){
			monthName = "December";
		}
		return monthName;
	}

	/**
	*	Returns the number of days for the given month
	*
	*	@author	Mathijn van Dijk
	*	@param	month the month number (1-12)
	*	@return returns the number of days for a given month or 31 if out of range
	*/

	public static int monthDays(int month){
		int days;

		/*
			30 days hath: September, April, June and November
			31 Januari, Februari, March, May, July, August, October December
			28 Februari
		*/

		switch(month){
			case 4:
			case 6:
			case 9:
			case 11:	days = 31;
			case 2:		days = 28;
			default:	days = 31;
						break;
		}
		return days;
	}
}
