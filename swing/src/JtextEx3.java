import javax.swing.*;
import java.awt.*;

class MyFrame2 extends JFrame{

	MyFrame2(){
//		create the textField
		JTextField tf1 = new JTextField(50);

		// this is use for only for number
		JFormattedTextField tf2 = new JFormattedTextField(100);
		add(tf2);
		add(tf1);
		this.setLayout(new FlowLayout());
		this.setTitle("JText swing");
		this.setSize(540,400);
		this.setVisible(true);
	}

}
public class JtextEx3 {
	public static void main(String[] args) {
		MyFrame2 fm = new MyFrame2();
	}
}
