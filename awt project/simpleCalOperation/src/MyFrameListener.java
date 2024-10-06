import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrameListener implements ActionListener {
	private MyFrame frame;

	public MyFrameListener(MyFrame frame) {
		this.frame = frame;
		frame.getSumBtn().addActionListener(this);
		frame.getSubBtn().addActionListener(this);
		frame.getMulBtn().addActionListener(this);
		frame.getDivBtn().addActionListener(this);
		frame.getClearBtn().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		try {
			double num1 = Double.parseDouble(frame.getTf1().getText());
			double num2 = Double.parseDouble(frame.getTf2().getText());

			if (e.getSource() == frame.getSumBtn()) {
				double result = num1 + num2;
				frame.getTf3().setText(String.valueOf(result));
			} else if (e.getSource() == frame.getSubBtn()) {
				double result = num1 - num2;
				frame.getTf3().setText(String.valueOf(result));
			} else if (e.getSource() == frame.getMulBtn()) {
				double result = num1 * num2;
				frame.getTf3().setText(String.valueOf(result));
			} else if (e.getSource() == frame.getDivBtn()) {
				if (num2 != 0) {
					double result = num1 / num2;
					frame.getTf3().setText(String.valueOf(result));
				} else {
					frame.getTf3().setText("Error: Division by zero");
				}
			} else if (e.getSource() == frame.getClearBtn()) {
				frame.getTf1().setText("");
				frame.getTf2().setText("");
				frame.getTf3().setText("");
			}
		} catch (NumberFormatException ex) {
			frame.getTf3().setText("Error: Invalid input");
		}
	}
}