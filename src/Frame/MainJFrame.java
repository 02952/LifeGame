package Frame;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Config.Config;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MainJFrame extends JFrame{
	private JPanel centerJPanel, bottomJPanel;
	private JButton next, run, stop, clear;
	public MainJFrame() {
		super("Life Game");
		this.setSize(830, 850);
		centerJPanel = new JPanel();
		centerJPanel.setSize(800, 700);
		centerJPanel.setLayout(new GridLayout());
		bottomJPanel = new JPanel();
		bottomJPanel.setSize(800, 100);
		bottomJPanel.setLayout(new FlowLayout());
		run = new JButton("run");
		run.addActionListener(new runActionListener());
		stop = new JButton("stop");
		stop.addActionListener(new stopActionListener());
		next = new JButton("next");
		next.addActionListener(new nextActionListener());
		clear = new JButton("clear");
		clear.addActionListener(new clearActionListener());
		getContentPane().add(centerJPanel, BorderLayout.CENTER);
		getContentPane().add(bottomJPanel, BorderLayout.SOUTH);
		bottomJPanel.add(run);
		bottomJPanel.add(stop);
		bottomJPanel.add(next);
		bottomJPanel.add(clear);
	}
	
	public static void main(String[] args) {
		MainJFrame mainJFrame = new MainJFrame();
		
	}
}
class runActionListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
class stopActionListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
class nextActionListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
class clearActionListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}