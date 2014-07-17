import java.util.Scanner;

import javax.security.auth.x500.X500Principal;


public class _03_Points_inside_a_Figure {

	public static void main(String[] args) {
		
		
		Scanner sr = new Scanner(System.in);
		String input = sr.nextLine();
		String[] point = input.split(" ");
		double x = Double.parseDouble(point[0]);
		double y = Double.parseDouble(point[1]);
		
		if (y>13.5|| y < 6) {
			
			System.out.println("Outside");
		}
		else {
			if (x<12.5 || x>22.5) {
				System.out.println("Outside");
			}
			else {
				if (x>17.5 && x<20 && y>8.5 ) {
					System.out.println("Outside");
				}
				else {
					System.out.println("Inside");
				}
			}
		}
			
			
			
	}

	
	}



