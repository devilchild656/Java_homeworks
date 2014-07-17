import java.util.Scanner;


public class Sum_Of_Two_Number {
	public static void main(String[] args){
	
	Scanner numbers = new Scanner(System.in);
	
	int FirstNumber = numbers.nextInt();
	int SecondNumber = numbers.nextInt();
	
	int sum = FirstNumber+SecondNumber;
	System.out.println(sum);
	numbers.close();
	}
}
