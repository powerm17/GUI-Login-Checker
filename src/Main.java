import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) {

		IDandPasswords idandPasswords = new IDandPasswords();

		@SuppressWarnings("unused")
		LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfo());

		@SuppressWarnings("unused")
		ImageIcon image = new ImageIcon("image.png");

		JLabel label = new JLabel();

		MyFrame myFrame = new MyFrame();
		myFrame.add(label);

	}

}
