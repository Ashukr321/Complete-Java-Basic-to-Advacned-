public class StopWatch {
	// Private data fields
	private long startTime;
	private long endTime;

	// No-arg constructor that initializes startTime with the current time
	public StopWatch() {
		this.startTime = System.currentTimeMillis();
	}

	// Method to start the stopwatch by setting startTime to the current time
	public void start() {
		this.startTime = System.currentTimeMillis();
	}

	// Method to stop the stopwatch by setting endTime to the current time
	public void stop() {
		this.endTime = System.currentTimeMillis();
	}

	// Getter method for startTime
	public long getStartTime() {
		return startTime;
	}

	// Getter method for endTime
	public long getEndTime() {
		return endTime;
	}

	// Method to get the elapsed time in milliseconds
	public long getElapsedTime() {
		return endTime - startTime;
	}

	// Main method for testing the StopWatch class
	public static void main(String[] args) {
		StopWatch stopwatch = new StopWatch();
		// Simulating some elapsed time
		stopwatch.start();
		try {
			Thread.sleep(2000); // Sleep for 2 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		stopwatch.stop();
		System.out.println("Elapsed time in milliseconds: " + stopwatch.getElapsedTime());
	}
}


//---------------------------
//		|        StopWatch        |
//		---------------------------
//		| - startTime: long       |
//		| - endTime: long         |
//		---------------------------
//		| + StopWatch()           |
//		| + start(): void         |
//		| + stop(): void          |
//		| + getStartTime(): long  |
//		| + getEndTime(): long    |
//		| + getElapsedTime(): long|
//		---------------------------
