import java.awt.*;
import java.awt.event.*;

class windowListenerImp implements  WindowListener{

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("window open");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("window close");
	}

	@Override
	public void windowClosed(WindowEvent e) {

	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("window iconifid");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("window deiconified");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("windowActivated");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("window Deactivated");
	}
}


public class Ex1  extends  Frame{
	Ex1(){
		this.setTitle("Window Listener DEMO  ");
		this.setSize(400,500);
		this.setVisible(true);
		this.addWindowListener(new windowListenerImp());
	}
	public static void main(String[] args) {
	Ex1  obj = new Ex1();
	}
}
