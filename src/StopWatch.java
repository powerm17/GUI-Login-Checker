import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.text.DecimalFormat;
import javax.swing.*;

public class StopWatch extends JFrame {
	static final int THREE = 3; //grid layout 
    static final int DELAY = 1; //Millisecond delay 
    
    static final int WIDTH = 400;
    static final int HEIGHT = 100;
    
    static final float DELAY_MODIFER = 0.002f; //delay to modifier

    public class StopWatchPanel extends JPanel {

        private JButton start = new JButton("Start");
        private JButton stop =  new JButton("Stop");
        private JLabel time = new JLabel("00.00", JLabel.CENTER);
        private JButton reset = new JButton("Reset");
        private DecimalFormat fmt = new DecimalFormat("0.##"); //Pattern for decimal
        private ButtonListener listener = new ButtonListener();
        
        private float setTimer;

        private Timer timer = new Timer(DELAY, new TimerListener());
        private StopWatchPanel() {
            setLayout(new GridLayout(THREE, 2));
            start.addActionListener(listener);
            stop.addActionListener(listener);
            reset.addActionListener(listener);
            add(start);
            add(stop);
            add(reset);
            add(time);

        }
        private class TimerListener implements ActionListener {
           
            public void actionPerformed(ActionEvent event) {
                setTimer += DELAY * DELAY_MODIFER;
                time.setText(fmt.format(setTimer));      
            }
        }
        private class ButtonListener implements ActionListener {
           
            public void actionPerformed(ActionEvent event) {
            	
            	//Start source
                if (event.getSource() == start) {
                    timer.start();
                    
                //stop timer 
                } else if (event.getSource() == stop) {
                    timer.stop();
                } else {
                    timer.stop();
                    setTimer = 0;
                    time.setText(fmt.format(setTimer));
                }
            }
        }
    }
    public StopWatch() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new StopWatchPanel());
        setSize(WIDTH, HEIGHT);
        setVisible(true);
    }
    public static void main(String[] args) {
        new StopWatch();
    }

}