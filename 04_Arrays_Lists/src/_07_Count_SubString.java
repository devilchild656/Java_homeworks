import java.util.Scanner;


public class _07_Count_SubString {

public static void main(String[] args){
		
		Scanner sr = new Scanner(System.in);
		String text = sr.nextLine().toLowerCase();
		String match = sr.nextLine().toLowerCase();
		int counter = 0;
	for (int i = 0; i < text.length() - match.length()+1; i++) {
		
		if (text.substring(i, i+match.length()).equals(match)) {
			counter++;
		}
		
		
	}	
		System.out.println(counter);
		
	
		
	}
}
