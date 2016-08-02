package circles;

import java.text.DecimalFormat;

public class Circle {

	public double radius;

	private double getCircumference(double input) {
		double circumference = 2 * (Math.PI) * input;

		return circumference;
	}

	public String getCircumferenceFormat(double input) {
		DecimalFormat df = new DecimalFormat("#.000");
		String formattedCircumference = df.format(getCircumference(input));

		return formattedCircumference;
	}

	private double getArea(double input) {
		double area = (Math.PI) * input * input;

		return area;
	}

	public String getFormattedArea(double input) {
		DecimalFormat df = new DecimalFormat("#.000");
		String formattedArea = df.format(getArea(input));

		return formattedArea;
	}
}
