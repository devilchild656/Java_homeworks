import java.util.Scanner;

public class _04_Sequance {

	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);
		String[] array = sr.nextLine().split(" ");
		int[] numbers = new int[(array.length)];

		for (int i = 0; i < numbers.length; i++) {

			numbers[i] = Integer.parseInt(array[i]);

		}
		int br = 1;
		int tempbr = 1;
		int position = 0;

		for (int i = 1; i < array.length; i++) {
			if (numbers[i] > numbers[i - 1]) {
				tempbr++;

			} else {
				tempbr = 1;
			}

			if (tempbr > br) {

				br = tempbr;
				position = i;

			}

		}
		for (int j = 0; j < br; j++) {
			System.out.print(numbers[position - br + 1 + j] + " ");

		}

	}

}
