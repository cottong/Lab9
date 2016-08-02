package circles;

import java.util.Scanner;

public class MainCircle {
public static void main(String[] args) {
	Scanner scan1 = new Scanner(System.in);
	String choice = "yes";
	while (choice.equalsIgnoreCase("yes")) {
		System.out.println("Welcome to the Circle Tester");
		System.out.println("Enter radius: ");
		Circle circle1 = new Circle();
		circle1.radius = scan1.nextInt();

		circle1.getFormattedArea(circle1.radius);
		circle1.getCircumferenceFormat(circle1.radius);
		
		
		System.out.println(circle1.getFormattedArea(circle1.radius));
		System.out.println(circle1.getCircumferenceFormat(circle1.radius));
	
		
		System.out.println("Continue? (yes/no)");

		choice = scan1.nextLine();
	}
}
}
