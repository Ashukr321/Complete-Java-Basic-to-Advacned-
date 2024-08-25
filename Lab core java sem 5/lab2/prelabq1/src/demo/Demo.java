package demo;

import finance.Stock;

public class Demo {
	public static void main(String[] args) {
		// Creating a Stock object
		Stock googleStock = new Stock("GOOGL", "Alphabet Inc.");

		// Setting the previous closing price and current price
		googleStock.setPreviousClosingPrice(2734.87);
		googleStock.setCurrentPrice(2763.43);

		// Displaying stock information
		System.out.println("Stock Symbol: " + googleStock.getSymbol());
		System.out.println("Stock Name: " + googleStock.getName());
		System.out.println("Previous Closing Price: " + googleStock.getPreviousClosingPrice());
		System.out.println("Current Price: " + googleStock.getCurrentPrice());
		System.out.println("Price Change Percentage: " + googleStock.getChangePercent() + "%");
	}
}
