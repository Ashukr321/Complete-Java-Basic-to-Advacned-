public class DeamonThread  extends Thread { 
	public  void run(){
		System.out.println("start run mehtods ");
	}

	public static void main(String[] args) {
		System.out.println("Daemon thread in the java ");
		// create the object of the thread class
		DeamonThread obj1 = new DeamonThread();
		System.out.println(obj1.isDaemon());// this is false 
		// set the obj1 is daemon thread 
		obj1.setDaemon(true);
		System.out.println("After setting daemon thread");
		System.out.println(obj1.isDaemon());// true
	}
}

/*
	Daemon thread : which is run behind the thread
	example : garbage collector	:error checker thread
	method : setDaemon(boolean)
	isDaemon(;
	main methods is can not  be a  daemon thread
 */