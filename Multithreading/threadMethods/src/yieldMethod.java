public class yieldMethod extends  Thread {
	public  void  run(){
		for (int i = 1; i<=5;i++){
			System.out.println(Thread.currentThread().getName()+" "+i);
		}

	}
	public static void main(String[] args) {
		System.out.println("yield methods in java ");
		System.out.println("this stop the current execution thread and give the chance to another thread to executed !");
		System.out.println("this is use internally sleep methods");
		yieldMethod th = new yieldMethod();
		th.start();
		for(int i = 1; i<=5; i++){
			Thread.yield();
			System.out.println(	Thread.currentThread().getName()+" "+i);
		}
	}
}
