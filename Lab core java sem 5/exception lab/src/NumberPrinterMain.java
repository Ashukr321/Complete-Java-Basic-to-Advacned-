// Implementing Runnable interface
class NumberPrinter implements Runnable {
	private String threadName;

	// Constructor to initialize thread name
	public NumberPrinter(String name) {
		this.threadName = name;
	}

	// Method to print the first five natural numbers
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(threadName + ": " + i);
			try {
				// Sleep for a short duration to simulate work and allow context switching
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println(threadName + " interrupted.");
			}
		}
	}
}

// Main class to run the threads
public class NumberPrinterMain {
	public static void main(String[] args) {
		// Create three threads
		Thread thread1 = new Thread(new NumberPrinter("Thread 1"));
		Thread thread2 = new Thread(new NumberPrinter("Thread 2"));
		Thread thread3 = new Thread(new NumberPrinter("Thread 3"));

		// Run the threads three times
		for (int j = 0; j < 3; j++) {
			System.out.println("Run " + (j + 1) + ":");
			thread1.start();
			thread2.start();
			thread3.start();

			// Wait for threads to finish before starting the next run
			try {
				thread1.join();
				thread2.join();
				thread3.join();
			} catch (InterruptedException e) {
				System.out.println("Main thread interrupted.");
			}
			System.out.println(); // Print a new line for better readability
		}
	}
}
//  class diagram
//+---------------------+
//		|      NumberPrinter  |
//		+---------------------+
//		| - threadName: String|
//		+---------------------+
//		| + NumberPrinter(String) |
//		| + run() : void      |
//		+---------------------+
//
//		+---------------------+
//		|        Main         |
//		+---------------------+
//		| + main(String[])    |
//		+---------------------+