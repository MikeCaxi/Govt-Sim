import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class uichoosestart{
	static JFrame ui = new JFrame();
	
	public uichoosestart(){
		ui.getContentPane().setLayout(new GridLayout(2, 3));
		ui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		ui.add(new JLabel(""));
		ui.add(new JLabel("Choose your starting Government Type:"));
		ui.add(new JLabel(""));
		JButton autarky = new JButton("Autarky");
		autarky.setPreferredSize(new Dimension(250, 100));
		ui.add(autarky);
		JButton free = new JButton("Freedom");
		free.setPreferredSize(new Dimension(250, 100));
		ui.add(free);
		JButton order = new JButton("Order");
		order.setPreferredSize(new Dimension(250, 100));
		ui.add(order);
		ui.pack();
		ui.setVisible(true);
		
		autarky.addActionListener(new autarkya());
		free.addActionListener(new freea());
		order.addActionListener(new ordera());
		
	}
	
}
