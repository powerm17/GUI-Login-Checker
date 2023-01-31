import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.HashMap;
import java.awt.Color;

//ActionListener interface receives Login page action events
public class LoginPage implements ActionListener {

	JFrame frame = new JFrame();
	// Creates buttons
	JButton loginButton = new JButton("Login");
	JButton resetButton = new JButton("Reset");
	JButton registerButton = new JButton("Register");
	JButton showPassButton = new JButton("view");

	JTextField userIDField = new JTextField();
	// Password Field to conceal password typed with ***
	JPasswordField userPasswordField = new JPasswordField();

	// Creates Labels
	JLabel userIDLabel = new JLabel("Username:");
	JLabel userPasswordLabel = new JLabel("Password:");
	JLabel messageLabel = new JLabel();

	HashMap<String, String> logininfo = new HashMap<String, String>();
	// Hash table based implementation of the Map interface

	LoginPage(HashMap<String, String> loginInfoOriginal) {

		logininfo = loginInfoOriginal;

		userIDLabel.setBounds(50, 100, 75, 25);
		userPasswordLabel.setBounds(50, 150, 75, 25);

		messageLabel.setBounds(125, 250, 250, 35);
		messageLabel.setFont(new Font("Ariel", Font.ITALIC, 25));

		userIDField.setBounds(125, 100, 200, 25);
		userPasswordField.setBounds(125, 150, 200, 25);

		loginButton.setBounds(125, 200, 100, 25);
		loginButton.setFocusable(false);
		loginButton.addActionListener(this);

		resetButton.setBounds(125, 225, 200, 25);
		resetButton.setFocusable(false);
		resetButton.addActionListener(this);

		registerButton.setBounds(225, 200, 100, 25);
		registerButton.setFocusable(false);
		registerButton.addActionListener(this);

		showPassButton.setBounds(325, 150, 70, 25);
		showPassButton.setFocusable(false);
		showPassButton.addActionListener(this);

		frame.add(userIDLabel);
		frame.add(userPasswordLabel);
		frame.add(messageLabel);
		frame.add(userIDField);
		frame.add(userPasswordField);
		frame.add(loginButton);
		frame.add(resetButton);
		frame.add(registerButton);
		frame.add(showPassButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == showPassButton) {
			if (userPasswordField.getEchoChar() != '\u0000');
			userPasswordField.setEchoChar('\u0000');
		} else {
			@SuppressWarnings("unused")
			char c = (Character) UIManager.get("PasswordField.echoChar");
			userPasswordField.repaint();
			userPasswordField.revalidate();

		}

		if (e.getSource() == resetButton) {
			userIDField.setText("");
			userPasswordField.setText("");
		}

		if (e.getSource() == registerButton) {
			userIDField.setText("");
			userPasswordField.setText("");
			@SuppressWarnings("unused")
			RegisterPage registerPage = new RegisterPage(logininfo);
		}

		loginCheck(e);
	}

	private void loginCheck(ActionEvent e) { //Method checks, implementing login button
		if (e.getSource() == loginButton) {

			String userID = userIDField.getText();
			String password = String.valueOf(userPasswordField.getPassword());

			if (logininfo.containsKey(userID)) {
				if (logininfo.get(userID).equals(password)) {

					messageLabel.setForeground(Color.green);
					messageLabel.setText("Login successful");
					frame.dispose();
					@SuppressWarnings("unused")
					StopWatch welcomePage = new StopWatch();
				}

			} else {
				messageLabel.setForeground(Color.red);
				messageLabel.setText("Incorrect Username");
			}

		} else {
			messageLabel.setForeground(Color.red);
		}
	}
}
