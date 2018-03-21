import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class uistartg{
	static JFrame ui = new JFrame();
	
	public uistartg(){
		ui.getContentPane().removeAll();
		ui.getContentPane().setLayout(new GridLayout(1, 2));
		ui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JButton newg = new JButton("New Game");
		newg.setPreferredSize(new Dimension(250, 100));
		ui.add(newg);
		JButton loadg = new JButton("Load Last Save");
		loadg.setPreferredSize(new Dimension(250, 100));
		ui.add(loadg);
		ui.pack();
		ui.setVisible(true);
		
		newg.addActionListener(new newa());
		loadg.addActionListener(new loada());
		
	}
	
}
