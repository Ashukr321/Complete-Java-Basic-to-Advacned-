import java.awt.*;
import java.awt.event.*;

public class LoginPage extends Frame {
	private Label usernameLabel;
	private Label passwordLabel;
	private TextField usernameField;
	private TextField passwordField;
	private Button loginButton;
	private Button cancelButton;

	LoginPage() {
		this.setTitle("Login Page");
		setSize(300, 250);
		this.setVisible(true);
		this.setBackground(Color.lightGray);
		this.setLayout(new BorderLayout());

		// Create UI components
		Panel panel = new Panel();
		panel.setLayout(new GridLayout(3, 2));

		usernameLabel = new Label("Username:");
		passwordLabel = new Label("Password:");
		usernameField = new TextField(20);
		passwordField = new TextField(20);
		passwordField.setEchoChar('*'); // hide password input
		loginButton = new Button("Login");
		cancelButton = new Button("Cancel");

		panel.add(usernameLabel);
		panel.add(usernameField);
		panel.add(passwordLabel);
		panel.add(passwordField);
		panel.add(new Label()); // add a blank label to fill the space
		panel.add(new Label()); // add a blank label to fill the space

		Panel buttonPanel = new Panel();
		buttonPanel.setLayout(new FlowLayout());

		buttonPanel.add(loginButton);
		buttonPanel.add(cancelButton);

		this.add(panel, BorderLayout.CENTER);
		this.add(buttonPanel, BorderLayout.SOUTH);

		// Add action listener to the login button
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = usernameField.getText();
				String password = passwordField.getText();
				if (username.equals("admin") && password.equals("password")) {
					System.out.println("Login successful!");
				} else {
					System.out.println("Invalid username or password");
				}
			}
		});

		// Add action listener to the cancel button
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		LoginPage lp = new LoginPage();
	}
}