public class priorityThread extends  Thread {
	public  void run(){
		System.out.println("start run methods ");
		System.out.println("priority of the thread "+ Thread.currentThread().getPriority());

	}
	public static void main(String[] args) {

		System.out.println("priority thread in java ");
		System.out.println(Thread.currentThread().getPriority()); // 5
		System.out.println("Types of priority of the thread !");
		System.out.println("MIN_PRIORITY"); // 1
		System.out.println("NORM_PRIORITY");// 5
		System.out.println("MAX_PRIORITY");// 5
		System.out.println("when we execute the another thread from other thread the priority of that thread is set according to execute thread ");
		// create the object of the thread
		priorityThread th = new priorityThread();
		th.setPriority(7);
		System.out.println("Priority range is in between 1 to 10 ");
		th.start();
	}

}

