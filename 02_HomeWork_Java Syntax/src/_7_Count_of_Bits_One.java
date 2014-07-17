import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

import org.w3c.dom.css.Counter;


public class _7_Count_of_Bits_One {
	public static void main(String[] args) {
		
		
		Scanner sr = new Scanner(System.in);
		
		BigInteger number = sr.nextBigInteger();
		int counter = 0;
		
		for (int i = 0; i < 16; i++) {
			if(number.testBit(i)==true){
				counter++;
				
			
			}
			
		}
	
		System.out.println(counter);
		
	}
}
