import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame {
	Button b, b2;
	Label l;

	MyFrame() {
//		create the object of the font
		Font fs = new Font("", Font.PLAIN, 40);
		b = new Button("click");
		l = new Label("" + 0);
		b2 = new Button("Decrement");

		// here we have to add the component to the frame
		this.add(l);
		this.add(b);
		this.add(b2);
		l.setPreferredSize(new Dimension(100, 30));
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int value = Integer.parseInt(l.getText());
				value++;
				l.setText("" + value);
				System.out.println(value);
			}
		});
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int value = Integer.parseInt(l.getText());
				value--;
				l.setText("" + value);
			}
		});
		b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b.setBackground(Color.GREEN);
		b2.setBackground(Color.red);
		b.setForeground(Color.orange);
		b2.setForeground(Color.WHITE);
		// set layout
		l.setFont(fs);
		b.setPreferredSize(new Dimension(100, 40));
		b2.setPreferredSize(new Dimension(100, 40));
		this.setLayout(new FlowLayout());
		this.setTitle("Swing first App");
		this.setVisible(true);
		this.setSize(400, 400);
	}

}

public class Ex2 {
	public static void main(String[] args) {
		MyFrame fm = new MyFrame();
		fm.getContentPane().setBackground(Color.orange);
	}
}
