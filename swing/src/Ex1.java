import javax.swing.*;

public class Ex1 extends JFrame {
	String[] listitem = {"apple","mango"};

	Ex1(){
		JList<String> l = new JList<>(listitem);
		setTitle("Welcome Him Bhai");
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(l);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex1();
	}
}