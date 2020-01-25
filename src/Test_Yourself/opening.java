package Test_Yourself;

import java.awt.*;
import javax.swing.*;

public class opening extends JPanel {
JProgressBar pb;
	
	public opening() {
		setLayout(new BorderLayout());
		setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 15));
		Icon icon = new ImageIcon(getClass().getResource("/images/cover.jpg"));
		add(new JLabel(icon), BorderLayout.CENTER);
		pb = new JProgressBar(0, 100);
		pb.setForeground(new Color(73, 137, 255));
		pb.setString("LOADING....");
		pb.setStringPainted(true);
		add(pb, BorderLayout.SOUTH);
	}
	public void setProgress(int progress) {
		pb.setValue(progress);
	}
	public static void main(String args[]) {
		opening p = new opening();
		JWindow win = new JWindow();
		win.setContentPane(p);
		win.pack();
		win.setLocationRelativeTo(null);
		win.setVisible(true);
		try {
			for (int i = 1; i <= 100; i++) {
				Thread.sleep(50);
				p.setProgress(i);
			}
		} catch (Exception e) {
		}
		win.setVisible(false);
		win.dispose();
		Test_Yourself frame = new Test_Yourself();
		frame.setTitle("    "+QuestionSeries.testtitle);
		frame.setVisible(true);
	}
}