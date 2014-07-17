import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//Write a program to enter a number n and n integer numbers and sort and print them. 
//Keep the numbers in array of integers: int[]. Examples:

public class _01_Sort_Array {

	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);
		int sizeofarray = sr.nextInt();
		int[] numbers = new int[sizeofarray];

		for (int i = 0; i < numbers.length; i++) {

			numbers[i] = sr.nextInt();

		}

		Arrays.sort(numbers);
		for (int i : numbers) {
			System.out.println(i + " ");

		}

	}

}