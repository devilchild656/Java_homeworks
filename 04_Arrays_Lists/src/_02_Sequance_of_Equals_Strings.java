import java.util.Scanner;
//Write a program that enters an array of strings and finds in it all sequences of 
//equal elements. The input strings are given as a single line, separated by a space. 
//Examples:

public class _02_Sequance_of_Equals_Strings {

	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);
		String[] sortarray = sr.nextLine().split(" ");

		for (int i = 0; i < sortarray.length; i++) {
			if (i < sortarray.length - 1) {

				if (sortarray[i].equals(sortarray[i + 1])) {
					System.out.print(sortarray[i] + " ");

				} else {
					System.out.println(sortarray[i] + " ");

				}
			} else {

				if (sortarray.equals(sortarray[i - 1])) {

					System.out.print(sortarray[i]);

				} else {
					System.out.println(sortarray[i]);

				}

			}

		}

	}

}
