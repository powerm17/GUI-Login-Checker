import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.HashMap;

public class RegisterPage implements ActionListener { // class Register page calls for action event

	JFrame frame = new JFrame();
	JButton login2Button = new JButton("Login");

	JTextField newUserIDField = new JTextField();
	JTextField UserFirstNameField = new JTextField();
	JTextField UserLastNameField = new JTextField();
	JPasswordField newUserPasswordField = new JPasswordField();

	JLabel newUserIDLabel = new JLabel("Username:");
	JLabel newUserPasswordLabel = new JLabel("Password:");
	JLabel UserFirstNameLabel = new JLabel("First Name: ");
	JLabel UserLastNameLabel = new JLabel("Last Name: ");

	HashMap<String, String> registerinfo = new HashMap<String, String>();

	RegisterPage(HashMap<String, String> registerInfoOriginal) {

		registerinfo = registerInfoOriginal;
		
		newUserIDLabel.setBounds(50, 100, 75, 25);
		newUserPasswordLabel.setBounds(50, 150, 75, 25);
		UserFirstNameLabel.setBounds(50, 200, 75, 25);
		UserLastNameLabel.setBounds(50, 250, 75, 25);
		
		newUserIDField.setBounds(125, 100, 200, 25);
		newUserPasswordField.setBounds(125, 150, 200, 25);
		UserFirstNameField.setBounds(125, 200, 200, 25);
		UserLastNameField.setBounds(125, 250, 200, 25);

		login2Button.setBounds(125, 300, 100, 25);
		login2Button.setFocusable(false);
		login2Button.addActionListener(this);

		// Labels
		frame.add(newUserIDLabel);
		frame.add(newUserPasswordLabel);
		frame.add(UserFirstNameLabel);
		frame.add(UserLastNameLabel);

		// Field
		frame.add(newUserIDField);
		frame.add(newUserPasswordField);
		frame.add(UserFirstNameField);
		frame.add(UserLastNameField);
		frame.add(login2Button);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);

	}

	// Login button will store the user input
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == login2Button) { // Action event object for login2 button
			newUserIDField.setText("");
			newUserPasswordField.setText("");
			UserFirstNameField.setText("");
			UserLastNameField.setText("");
			
			new LoginPage(registerinfo);
		}
	}
}
