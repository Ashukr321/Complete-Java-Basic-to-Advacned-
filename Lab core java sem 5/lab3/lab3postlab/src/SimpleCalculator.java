import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator {
	private JFrame frame;
	private JTextField num1Field, num2Field, resultField;
	private JButton addButton, subtractButton, multiplyButton, divideButton;

	public SimpleCalculator() {
		createGUI();
	}

	private void createGUI() {
		frame = new JFrame("Simple Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());

		// Create number fields
		num1Field = new JTextField(10);
		num2Field = new JTextField(10);
		resultField = new JTextField(10);
		resultField.setEditable(false);

		// Create buttons
		addButton = new JButton("+");
		subtractButton = new JButton("-");
		multiplyButton = new JButton("*");
		divideButton = new JButton("/");

		// Add components to frame
		frame.add(new JLabel("Number 1:"));
		frame.add(num1Field);
		frame.add(new JLabel("Number 2:"));
		frame.add(num2Field);
		frame.add(addButton);
		frame.add(subtractButton);
		frame.add(multiplyButton);
		frame.add(divideButton);
		frame.add(new JLabel("Result:"));
		frame.add(resultField);

		// Add action listeners to buttons
		addButton.addActionListener(new AddButtonListener());
		subtractButton.addActionListener(new SubtractButtonListener());
		multiplyButton.addActionListener(new MultiplyButtonListener());
		divideButton.addActionListener(new DivideButtonListener());

		// Set frame size and visibility
		frame.setSize(250, 150);
		frame.setVisible(true);
	}

	private class AddButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int num1 = Integer.parseInt(num1Field.getText());
			int num2 = Integer.parseInt(num2Field.getText());
			int result = num1 + num2;
			resultField.setText(String.valueOf(result));
		}
	}

	private class SubtractButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int num1 = Integer.parseInt(num1Field.getText());
			int num2 = Integer.parseInt(num2Field.getText());
			int result = num1 - num2;
			resultField.setText(String.valueOf(result));
		}
	}

	private class MultiplyButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int num1 = Integer.parseInt(num1Field.getText());
			int num2 = Integer.parseInt(num2Field.getText());
			int result = num1 * num2;
			resultField.setText(String.valueOf(result));
		}
	}

	private class DivideButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int num1 = Integer.parseInt(num1Field.getText());
			int num2 = Integer.parseInt(num2Field.getText());
			if (num2 == 0) {
				resultField.setText("Error: Division by zero!");
			} else {
				int result = num1 / num2;
				resultField.setText(String.valueOf(result));
			}
		}
	}

	public static void main(String[] args) {
		new SimpleCalculator();
	}
}