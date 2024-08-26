// Shape.java
public abstract class Shape {
	private String fillColor;
	private String borderColor;
	private boolean fill;
	private int borderWidth;

	public Shape(String fillColor, String borderColor, boolean fill, int borderWidth) {
		this.fillColor = fillColor;
		this.borderColor = borderColor;
		this.fill = fill;
		this.borderWidth = borderWidth;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getBorderColor() {
		return borderColor;
	}

	public void setBorderColor(String borderColor) {
		this.borderColor = borderColor;
	}

	public boolean isFill() {
		return fill;
	}

	public void setFill(boolean fill) {
		this.fill = fill;
	}

	public int getBorderWidth() {
		return borderWidth;
	}

	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}

	@Override
	public String toString() {
		return "Shape{" +
				"fillColor='" + fillColor + '\'' +
				", borderColor='" + borderColor + '\'' +
				", fill=" + fill +
				", borderWidth=" + borderWidth +
				'}';
	}
}