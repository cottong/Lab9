package circles;

import java.util.Scanner;

public class MainCircle {
	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		String choice = "yes";
		System.out.println("Welcome to the Circle Tester");
		while (choice.equalsIgnoreCase("yes")) {

			System.out.println("Enter radius: ");
			Circle circle1 = new Circle();
			double input = scan1.nextInt();
			scan1.nextLine();
			circle1.setRadius(input);

			System.out.println("The area is: " + circle1.getFormattedArea());
			System.out.println("The circumference is: "
					+ circle1.getCircumferenceFormat());

			System.out.println("Continue? (yes/no)");

			choice = scan1.nextLine();

		}scan1.close();
	}
}
