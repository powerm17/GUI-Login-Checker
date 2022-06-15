import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class MyFrame extends JFrame implements ActionListener {
	
	JButton button;
	JLabel label;
	JButton continueButton = new JButton("Continue");
	
	
	HashMap<String,String> logininfo = new HashMap<String,String>();	
	MyFrame(){
	
	label = new JLabel();
	label.setBounds(300,0,175,150);
	label.setVisible(true);
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}