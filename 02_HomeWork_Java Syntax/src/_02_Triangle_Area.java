import java.util.Scanner;


public class _02_Triangle_Area {

	public static void main(String[] args){
		
		Scanner sr = new Scanner(System.in);
		String first = sr.nextLine();
		String [] Firstdot = first.split(" ");
		int ax = Integer.parseInt(Firstdot[0]);
		int ay = Integer.parseInt(Firstdot[1]);
		
		String second = sr.nextLine();
		String [] Seconddot = second.split(" ");
		int bx = Integer.parseInt(Seconddot[0]);
		int by = Integer.parseInt(Seconddot[1]);
		
		String third = sr.nextLine();
		String [] Thirddot = third.split(" ");
		int cx = Integer.parseInt(Thirddot[0]);
		int cy = Integer.parseInt(Thirddot[1]);
		
		int area = (ax*(by-cy) + bx*(cy-ay) + cx*(ay-by))/2;
		if (area>=0)
		{
			System.out.println(Math.round(area));
		}
		
		else	
		{
			System.out.println(Math.round(area*-1));
		}
		
		
	}
}
