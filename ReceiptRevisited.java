import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;


public class ReceiptRevisited {
	public static void main(String[] args) throws Exception{
	PrintWriter fileout = new PrintWriter("receipt.txt");
	Scanner key = new Scanner(System.in);
	
	System.out.print("Gas price: ");
	double price = key.nextDouble();
	System.out.print("# liters: ");
	double liters = key.nextDouble();
	System.out.println("\tGas cost E"+price+" per liter");
	System.out.println("\tTotal liters "+liters+" L");
	System.out.println("\tTotal cost E"+(price*liters)+"");
	System.out.println("\n\tPrinting receipt... done!");

	fileout.println("+---------------------------+");
	fileout.println("                             ");
	fileout.println("        CORNER STORE         ");
	fileout.println("                             ");
	fileout.println("  2015-03-29       04:38PM   ");
	fileout.println("                             ");
	fileout.println("  Liters:          "+liters+" L");
	fileout.println("  Price/liter      "+price+" E");
	fileout.println("                             ");
	fileout.println("  Fuel total:      "+(price*liters)+" E");
	fileout.println("                             ");
	fileout.println("+---------------------------+");
	fileout.close();
	}
}