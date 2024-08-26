// Rectangle.java
public class Rectangle extends Shape {
	private int length;
	private int width;

	public Rectangle(String fillColor, String borderColor, boolean fill, int borderWidth, int length, int width) {
		super(fillColor, borderColor, fill, borderWidth);
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectangle{" +
				"length=" + length +
				", width=" + width +
				"} " + super.toString();
	}
}

