public class Runnable_interface_thread {
	static class Test implements  Runnable{

		public  void  run(){
			for(int i = 1; i<=10; i++){

			System.out.println("thread task"+i);
			}
		}
	}

	public static void main(String[] args) {
//	to run the runnable interface we have to  create the object of the
		// thread class and pass in the Test object ref. into their constructor
		Test t = new Test();
		Thread th = new Thread(t);
		th.start();
	}
}
