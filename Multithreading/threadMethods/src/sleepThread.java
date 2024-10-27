public class sleepThread extends  Thread {
	public  void  run() {
		for(int i = 1;i<=5;i++){
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}

			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		System.out.println("Sleep thread in java ");
		sleepThread th = new sleepThread();
		th.start();
//		public static native void sleep(long millis) throws InterruptedException;
	}
}
