class Example1 extends Thread {
	public void run() {
		System.out.println("Starting");
	}

}

public class Ex {
	public static void main(String[] args) {
	 //	create the object of the Example1 class
		Example1 example1 = new Example1();
		example1.start();	// this will start the thread
//		System.out.println(example1.getName());
//		example1.setName("first thread");
//		System.out.println(example1.getName());

	}
}
