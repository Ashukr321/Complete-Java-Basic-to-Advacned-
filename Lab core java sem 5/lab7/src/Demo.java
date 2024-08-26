public class Demo {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle("red", "black", true, 2, 10, 20);
		Circle circle = new Circle("blue", "white", false, 1, 15);

		System.out.println(rectangle.toString());
		System.out.println(circle.toString());

		rectangle.setFillColor("green");
		circle.setBorderWidth(3);

		System.out.println(rectangle.toString());
		System.out.println(circle.toString());
	}
}


//+---------------+
//		|     Shape    |
//		+---------------+
//		| - fillColor   |
//		| - borderColor |
//		| - fill        |
//		| - borderWidth |
//		| + getFillColor() |
//		| + setFillColor() |
//		| + getBorderColor() |
//		| + setBorderColor() |
//		| + isFill()      |
//		| + setFill()     |
//		| + getBorderWidth() |
//		| + setBorderWidth() |
//		| + toString()    |
//		+---------------+
//		|
//		|
//v
//+---------------+
//		|   Rectangle  |
//		+---------------+
//		| - length      |
//		| - width       |
//		| + getLength()  |
//		| + setLength()  |
//		| + getWidth()   |
//		| + setWidth()   |
//		| + toString()    |
//		+---------------+
//		|
//		|
//v
//+---------------+
//		|     Circle    |
//		+---------------+
//		| - radius      |
//		| + getRadius()  |
//		| + setRadius()  |
//		| + toString()    |
//		+---------------+