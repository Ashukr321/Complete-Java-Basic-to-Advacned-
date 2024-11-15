import javax.swing.plaf.TableHeaderUI;
import java.util.concurrent.ThreadPoolExecutor;

public class example1 {
	public static void main(String[] args) {
		Thread t1 =  new Thread();
		Thread tname = Thread.currentThread();
		System.out.println(tname); // main


		t1.start();
		t1.setName("this is thread 1 ");
		System.out.println(t1.getName());

		Thread t2 = new Thread();
		System.out.println(t2.getName());

	}
}
