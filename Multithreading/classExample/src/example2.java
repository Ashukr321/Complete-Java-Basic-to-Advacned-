public class example2 {
	static class ThDemo extends Thread {
		public void run() {
			System.out.println("run methods override inthe thDemo class");
		}
	}

	public static void main(String[] args) {
		ThDemo obj = new ThDemo();
		obj.start();

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

	}


}
