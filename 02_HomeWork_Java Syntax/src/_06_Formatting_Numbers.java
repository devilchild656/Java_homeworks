import java.util.Scanner;

public class _06_Formatting_Numbers {
	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);

		int a = 0;
		
	do {
		 a = sr.nextInt();
		if (a<=0 || a>=500) 
		{
			System.out.println("Invalid input");
		}
		
	}
	while (a<=0 || a>=500);

		double b = sr.nextDouble();
		double c = sr.nextDouble();
		
		String hexnumber = Integer.toHexString(a);
		String binaryumber = Integer.toBinaryString(a);
		
		System.out.printf("|%-10s|%s|%10.2f|%-10.0f|",hexnumber,binaryumber,b,c);

	}

}
