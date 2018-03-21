import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class uitax{
	
	public static JFrame ui = new JFrame();
	public static JTextField taxinco = new JTextField(8);
	public static JTextField taxprod = new JTextField(8);
	//public static JTextField taxtarr = new JTextField(8);
	
	public uitax(){
		ui.getContentPane().removeAll();
		ui.getContentPane().setLayout(new GridLayout(3, 2));
		
		ui.add(new JLabel("Income Tax: "));
		ui.add(taxinco);
		
		ui.add(new JLabel("Produce Tax: "));
		ui.add(taxprod);
		
		//ui.add(new JLabel)
		
		JButton cancel = new JButton("Cancel");
		JButton save = new JButton("Save");
		ui.add(cancel);
		ui.add(save);
		cancel.addActionListener(new ctaxa());
		save.addActionListener(new staxa());

		ui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		ui.pack();
		ui.setVisible(true);
	}
	
}
