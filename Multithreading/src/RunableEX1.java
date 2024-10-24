public class RunableEX1 implements  Runnable {
	// override run methods
	public  void run() {
		System.out.println("thread start ");
	}
	public static void main(String[] args) {
		Runnable obj = new RunableEX1();
		Thread th = new Thread(obj);
		th.start();

	}
}
