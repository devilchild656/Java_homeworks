import java.util.Scanner;




public class _04_The_Smallest_of_3_Numbers {
	
	public static void main(String[] args) {
		
		Scanner sr = new Scanner(System.in);
		
		int a = sr.nextInt();
		int b = sr.nextInt();
		int c = sr.nextInt();
		
		if (a<b && a<c) {
			System.out.println(a);
			
		}
		if (b<a &&  b<c ) {
			System.out.println(b);
			
		}
		if (c<a && c<b ) {
			System.out.println(c);
			
		}
		
	}

}
