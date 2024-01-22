import javax.swing.*;
import java.awt.event.*;

public class ass_13_prac {
    public static void main(String args[]) {
        JFrame frame = new JFrame("While loop example");
        JLabel label = new JLabel("Count: 0");
        JButton startButton = new JButton("Start");
        JButton stopButton = new JButton("Stop");
        frame.setLayout(null);
        label.setBounds(100, 50, 80, 30);
        startButton.setBounds(50, 100, 80, 30);
        stopButton.setBounds(150, 100, 80, 30);
        frame.add(label);
        frame.add(startButton);
        frame.add(stopButton);

        int[] cnt = { 0 };

        Timer timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Count: " + cnt[0]);
                cnt[0]++;
            }
        });

        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                timer.start();
            }
        });

        stopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                timer.stop();
            }
        });

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
