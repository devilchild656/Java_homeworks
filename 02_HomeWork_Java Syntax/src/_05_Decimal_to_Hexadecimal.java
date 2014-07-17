import java.util.Scanner;

import javax.xml.bind.annotation.adapters.HexBinaryAdapter;


public class _05_Decimal_to_Hexadecimal {
	public static void main(String[] args) {
		
		Scanner sr = new Scanner(System.in);
		
		int decimal = sr.nextInt();
		String hex = Integer.toHexString(decimal).toUpperCase();
		
		System.out.println(hex);
	}
}
