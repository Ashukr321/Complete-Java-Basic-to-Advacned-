class MyPoint {
	// Data fields representing the coordinates
	private double x;
	private double y;

	// No-arg constructor that creates a point (0, 0)
	public MyPoint() {
		this.x = 0;
		this.y = 0;
	}

	// Constructor that constructs a point with specified coordinates
	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	// Getter methods for x and y
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	// Method to calculate the distance to another point of MyPoint type
	public double distance(MyPoint p) {
		return Math.sqrt(Math.pow(p.getX() - this.x, 2) + Math.pow(p.getY() - this.y, 2));
	}

	// Method to calculate the distance to another point with specified x- and y-coordinates
	public double distance(double x, double y) {
		return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
	}

	public static void main(String[] args) {
		// Create two points: (0, 0) and (10, 30.5)
		MyPoint point1 = new MyPoint();
		MyPoint point2 = new MyPoint(10, 30.5);

		// Display the distance between them
		System.out.println("Distance between point1 and point2: " + point1.distance(point2));
	}
}


// class diagram
//+----------------------------------+
//		|            MyPoint               |
//		+----------------------------------+
//		| - x: double                      |
//		| - y: double                      |
//		+----------------------------------+
//		| + MyPoint()                      |
//		| + MyPoint(x: double, y: double)  |
//		| + getX(): double                 |
//		| + getY(): double                 |
//		| + distance(p: MyPoint): double   |
//		| + distance(x: double, y: double): double |
//		+----------------------------------+
