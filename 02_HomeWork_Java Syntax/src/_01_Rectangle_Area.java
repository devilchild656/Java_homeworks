import java.util.Scanner;


public class _01_Rectangle_Area {
	public static void main(String[] args){
		
		Scanner src = new Scanner(System.in);
		String input = src.nextLine();
		String[] spliter = input.split(" ");
		int widght = Integer.parseInt(spliter[0]);
		int height = Integer.parseInt(spliter[1]);
		System.out.println(widght*height);
		
		
	}

}
