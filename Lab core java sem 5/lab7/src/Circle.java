// Circle.java
public class Circle extends Shape {
	private int radius;

	public Circle(String fillColor, String borderColor, boolean fill, int borderWidth, int radius) {
		super(fillColor, borderColor, fill, borderWidth);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle{" +
				"radius=" + radius +
				"} " + super.toString();
	}
}