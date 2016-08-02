package circles;

import java.text.DecimalFormat;

public class Circle {

	private double radius;

	public void setRadius(double radius) {
		this.radius = radius;
	}

	private double getCircumference() {
		double circumference = 2 * (Math.PI) * radius;

		return circumference;
	}

	public String getCircumferenceFormat() {
		DecimalFormat df = new DecimalFormat("#.000");
		String formattedCircumference = df.format(getCircumference());

		return formattedCircumference;
	}

	private double getArea() {
		double area = (Math.PI) * radius * radius;

		return area;
	}

	public String getFormattedArea() {
		DecimalFormat df = new DecimalFormat("#.000");
		String formattedArea = df.format(getArea());

		return formattedArea;
	}
}
