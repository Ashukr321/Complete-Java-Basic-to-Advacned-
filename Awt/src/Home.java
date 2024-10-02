import java.awt.*;

class About extends Frame{
	// this is the about class constructor
	About(){
		this.setLayout(new BorderLayout()); // Set the layout manager to BorderLayout

		Label l1 = new Label("Enter your name");
		l1.setAlignment(Label.CENTER);

		TextField txt = new TextField();
		txt.setPreferredSize(new Dimension(200, 20)); // Set the preferred size of the text field

		TextArea textArea = new TextArea();
		textArea.setPreferredSize(new Dimension(100, 100)); // Set the preferred size of the text area

		this.add(l1, BorderLayout.NORTH); // Add the label to the north region
		this.add(txt, BorderLayout.CENTER); // Add the text field to the center region
		this.add(textArea, BorderLayout.SOUTH); // Add the text area to the south region

		this.setSize(500,600);
		this.setTitle("welcome Ashutosh");
		this.setBackground(Color.yellow);
		this.setVisible(true);
	}
}

public class Home {
	public static void main(String[] args) {
		About obj = new About();
	}
}