import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class MyFrame extends JFrame implements ActionListener {

	JButton button;
	JLabel label;
	JButton continueButton = new JButton("Continue");

	MyFrame() {

		label = new JLabel();
		label.setBounds(300, 0, 175, 150);
		label.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}
}