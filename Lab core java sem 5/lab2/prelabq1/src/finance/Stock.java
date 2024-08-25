package finance;

public class Stock {
	// Private data fields
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;

	// Constructor to initialize the Stock object
	public Stock(String symbol, String name) {
		this.symbol = symbol;
		this.name = name;
	}

	// Getter for symbol
	public String getSymbol() {
		return symbol;
	}

	// Getter for name
	public String getName() {
		return name;
	}

	// Getter for previousClosingPrice
	public double getPreviousClosingPrice() {
		return previousClosingPrice;
	}

	// Setter for previousClosingPrice
	public void setPreviousClosingPrice(double previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
	}

	// Getter for currentPrice
	public double getCurrentPrice() {
		return currentPrice;
	}

	// Setter for currentPrice
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}

	// Method to calculate and return the percentage change
	public double getChangePercent() {
		return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
	}
}
