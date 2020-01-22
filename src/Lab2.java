import java.util.Scanner;

	/*
	 * 
	 * @ David Breitenbeck
	 * 
	 */
public class Lab2 {
	
		public static void main (String[] args) {
			double width;
			double length; 
			double height; 
			double area;
			double perimeter;
			double volume;
			String answer;
			int looper = 0;
			Scanner scanner = new Scanner(System.in);
			
			
			do
			 {
				
			System.out.println("Enter width");
			width = scanner.nextDouble(); 

			System.out.println("Enter length");
			length = scanner.nextDouble();
			
			System.out.println("Enter height");
			height = scanner.nextDouble();
			
			area = width * length;
			perimeter = (2*width) + (2*length);
			volume = width * length * height;
			
			System.out.println("The room area is " + area + " feet");
			System.out.println("The room perimeter is " + perimeter + " feet");
			System.out.println("The room volume is " + volume + " square feet");
			System.out.println();
			
			System.out.println("Do you wish to continue Y/N?"); 
			
			answer = scanner.next().toLowerCase(); 
			
			if (answer.contains("y")) {
				looper = 0;
			} else if (answer.contains("n")) {
				System.out.println("Goodbye");
				looper = 1;
			}
			
			} while (looper == 0);
			
			scanner.close();
		}
	}



