import java.util.Scanner;
import java.util.Arrays;


public class Sort_Array_of_Strings {
	public static void main(String[] args){
		
		Scanner scaner = new Scanner(System.in);
		int n = scaner.nextInt();
		String [] Words = new String[n];
		
		for (int i = 0; i <n; i++) {
			
			Words[i]=scaner.next();
			
			
		}
		Arrays.sort(Words);
		for (int i = 0; i < Words.length; i++) {
			
			
			System.out.println(Words[i]);
		}
		scaner.close();
	}

}
