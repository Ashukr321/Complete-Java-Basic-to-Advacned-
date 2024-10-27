public class Ex1 extends Thread {
	// we have to override the run methods
	public  void run(){
		System.out.println("start run by :"+Thread.currentThread().getName());
	}


	public static void main(String[] args) {
		System.out.println("Welcome to learn about the multithreading library");
		System.out.println(Thread.currentThread().getName());
		// set the current thread name
		Thread.currentThread().setName("Ashu");
		System.out.println(Thread.currentThread().getName());
		
		// create the therad 
		Ex1 t1 = new Ex1();
		t1.start();
		Ex1 t2 = new Ex1();
		t2.start();
	}
}
