import java.util.Scanner;

public class _04_Longest_Increasing_Sequence {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		String[] arr = in.nextLine().split(" ");
		int counterTemp = 1;
		int counter = 1;
		int positionOfWord = 0; 

		for (int i = 1; i < arr.length; i++) {
			if (arr[i].equals(arr[i - 1])) {
				counterTemp++;
			} else {
				counterTemp = 1;
			}
			if (counterTemp > counter) {
				counter = counterTemp;
				positionOfWord = i;
			}
		}
		for (int j = 0; j < counter ; j++) {
			System.out.print(arr[positionOfWord] + " ");
		}
	}

}
