import java.util.Scanner;

public class CeasarCipher {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		String plaintext="YZAB", cipher="";
		int shift = 1;

		for(int i=0; i<plaintext.length();i++){
			// System.out.println((int)plaintext.charAt(i));
			// System.out.print(shiftLetter(plaintext.charAt(i),shift));
			cipher += shiftLetter(plaintext.charAt(i),shift);
		}

		System.out.println("\n"+cipher);
	}

	public static char shiftLetter(char c, int n){
		int u = c;
		if(!Character.isLetter(c)){
			return c;
		}
		u = u+n;
		if(Character.isUpperCase(c) && u > 'Z' 
		|| Character.isLowerCase(c) && u > 'z'){
			u -= 26;
		}
		if(Character.isUpperCase(c) && u < 'A' 
		|| Character.isLowerCase(c) && u < 'a'){
			u += 26;
		}
		return (char)u;
	}
}