import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame {
	// create Object of the Font
	Font font = new Font("Dialog", Font.BOLD, 18);

	private Button sum;
	private Button sub;
	private Button mul;
	private Button div;
	private Button clear;
	private TextField tf1;
	private TextField tf2;
	private TextField tf3;

	public MyFrame() {
		Label lb1 = new Label("Num1");
		Label lb2 = new Label("Num2");
		Label lb3 = new Label("Result");

		// text field object
		tf1 = new TextField(40);
		tf2 = new TextField(40);
		tf3 = new TextField(40);

		sum = new Button("Sum");
		sum.setPreferredSize(new Dimension(100, 30));
		sum.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		sum.setFont(font);

		sub = new Button("Sub");
		sub.setPreferredSize(new Dimension(100, 30));
		sub.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		sub.setFont(font);

		mul = new Button("Mul");
		mul.setPreferredSize(new Dimension(100, 30));
		mul.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mul.setFont(font);

		div = new Button("Div");
		div.setPreferredSize(new Dimension(100, 30));
		div.setFont(font);
		div.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		clear = new Button("Clear");
		clear.setPreferredSize(new Dimension(100, 30));
		clear.setFont(font);
		clear.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		// Add components
		this.add(lb1);
		this.add(tf1);

		this.add(lb2);
		this.add(tf2);
		this.add(lb3);
		this.add(tf3);

		this.add(sum);
		this.add(sub);
		this.add(mul);
		this.add(div);
		this.add(clear);

		// setTitle of frame
		this.setTitle("Product Design by Ashutosh - Simple Calculator");
		//set background Color
		this.setBackground(Color.orange);
		// set the size of frame
		this.setSize(500, 300);

		// set flowLayout
		this.setLayout(new FlowLayout());
		// set the frame visible true

		// set listener
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		MyFrameListener listener = new MyFrameListener(this);
		this.setVisible(true);
	}

	// button getter
	public Button getSumBtn() {
		return sum;
	}

	public Button getSubBtn() {
		return sub;
	}

	public Button getMulBtn() {
		return mul;
	}

	public Button getDivBtn() {
		return div;
	}

	public Button getClearBtn() {
		return clear;
	}

	public TextField getTf1() {
		return tf1;
	}

	public TextField getTf2() {
		return tf2;
	}

	public TextField getTf3() {
		return tf3;
	}
}

