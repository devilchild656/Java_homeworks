import java.util.Scanner;

import javax.xml.soap.Text;

public class _06_Count_Specifited_Word {

	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);
		String text = sr.nextLine().toLowerCase();
		String TargetWord = sr.nextLine().toLowerCase();
		String[] textarray = text.split("\\W+");
		int counter = 0;

		for (int i = 0; i < textarray.length; i++) {
			String Matchword = TargetWord;
			if (Matchword.equals(textarray[i])) {
				counter++;

			}
		}
		System.out.println(counter);

	}

}
