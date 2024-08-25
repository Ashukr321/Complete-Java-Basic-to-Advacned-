public class QuadraticEquation {
	// Private data fields to store coefficients a, b, and c
	private double a;
	private double b;
	private double c;

	// Constructor to initialize the coefficients
	public QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// Getter method for a
	public double getA() {
		return a;
	}

	// Getter method for b
	public double getB() {
		return b;
	}

	// Getter method for c
	public double getC() {
		return c;
	}

	// Method to calculate the discriminant (b^2 - 4ac)
	public double getDiscriminant() {
		return (b * b) - (4 * a * c);
	}

	// Method to calculate the first root
	public double getRoot1() {
		double discriminant = getDiscriminant();
		if (discriminant < 0) {
			return Double.NaN;  // No real roots, return NaN
		} else {
			return (-b + Math.sqrt(discriminant)) / (2 * a);
		}
	}

	// Method to calculate the second root
	public double getRoot2() {
		double discriminant = getDiscriminant();
		if (discriminant < 0) {
			return Double.NaN;  // No real roots, return NaN
		} else {
			return (-b - Math.sqrt(discriminant)) / (2 * a);
		}
	}

	// Main method to test the QuadraticEquation class
	public static void main(String[] args) {
		// Example usage
		QuadraticEquation equation = new QuadraticEquation(1, -3, 2);

		// Get the roots
		double root1 = equation.getRoot1();
		double root2 = equation.getRoot2();

		// Display the roots
		System.out.println("Root 1: " + root1);
		System.out.println("Root 2: " + root2);
	}
}
