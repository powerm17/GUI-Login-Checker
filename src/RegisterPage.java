import java.awt.*;
import javax.swing.*;

import java.awt.event.*;
import java.util.ArrayList;
import java.util.Scanner;


import java.util.HashMap;
 
public class RegisterPage implements ActionListener { //class Register page calls for action event


			JFrame frame = new JFrame();
			JLabel welcomeLabel = new JLabel("Hello!");
			JButton login2Button = new JButton("Login");
			
			JTextField newUserIDField = new JTextField();
			JTextField UserFirstNameField = new JTextField();
			JTextField UserLastNameField = new JTextField();
			JPasswordField newUserPasswordField = new JPasswordField();
			
			JLabel newUserIDLabel = new JLabel("Username:");
			JLabel newUserPasswordLabel = new JLabel("Password:");
			JLabel messageLabel = new JLabel();
			JLabel UserFirstNameLabel = new JLabel("First Name: ");
			JLabel UserLastNameLabel = new JLabel("Last Name: ");
			
			
			ArrayList<String> newUserIDLabel1 = new ArrayList<String>();
	        ArrayList<Integer> newUserPasswordLabel1 = new ArrayList<Integer>();
	        
	        //while (true) {
	            // while loop for stored user and pass
	        
			
			 
			
			HashMap<String,String> registerinfo = new HashMap<String,String>();
			
			RegisterPage(HashMap<String,String> registerInfoOriginal){
				
				//add function to store information
				
				registerinfo = registerInfoOriginal;
				//RegisterPage(String userID){
					
					newUserIDLabel.setBounds(50,100,75,25);
					newUserPasswordLabel.setBounds(50,150,75,25);
					UserFirstNameLabel.setBounds(50,200,75,25);
					UserLastNameLabel.setBounds(50,250,75,25);
					messageLabel.setBounds(125,250,250,35);
					
					messageLabel.setFont(new Font(null,Font.ITALIC,25));
					
					newUserIDField.setBounds(125,100,200,25);
					newUserPasswordField.setBounds(125,150,200,25);
					UserFirstNameField.setBounds(125,200,200,25);
					UserLastNameField.setBounds(125,250,200,25);
					
					login2Button.setBounds(125,300,100,25);
					login2Button.setFocusable(false);
					login2Button.addActionListener(this);
					
					//Labels
					frame.add(newUserIDLabel);
					frame.add(newUserPasswordLabel);
					frame.add(UserFirstNameLabel);
					frame.add(UserLastNameLabel);
					frame.add(messageLabel);
					
					//Field
					frame.add(newUserIDField);
					frame.add(newUserPasswordField);
					frame.add(UserFirstNameField);
					frame.add(UserLastNameField);
					frame.add(messageLabel);
					frame.add(login2Button);
					
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setSize(420,420);
					frame.setLayout(null);
					frame.setVisible(true);
					
				}
			
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource() == login2Button) { //Action event object for login2 button 
					newUserIDField.setText("");
					newUserPasswordField.setText("");
					UserFirstNameField.setText("");
					UserLastNameField.setText("");
					@SuppressWarnings("unused")
					LoginPage loginPage = new LoginPage(registerinfo); //brings user back to Loginpage
				}	
			}
	}
