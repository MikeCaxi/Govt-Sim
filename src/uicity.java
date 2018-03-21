import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class uicity{
	public static JFrame ui = new JFrame();
	public static JTextField ar = new JTextField(8);
	public static JTextField in = new JTextField(8);
	public static JTextField fi = new JTextField(8);
	public static JTextField to = new JTextField(8);
	public uicity(int i){
		ui.getContentPane().removeAll();
		ui.setTitle(main.cname.get(i));
		int [] citystats = citycon.cmap.get(main.cname.get(i));
		
		ui.setLayout(new GridLayout(5, 4));
		
		ui.add(new JLabel("Land Fertility: "));
		ui.add(new JLabel(String.valueOf(citystats[0])));
		ui.add(new JLabel("Natural Resource: "));
		ui.add(new JLabel(String.valueOf(citystats[1])));
		ui.add(new JLabel("Ease of Travel: "));
		ui.add(new JLabel(String.valueOf(citystats[2])));
		ui.add(new JLabel("Culture:"));
		ui.add(new JLabel(String.valueOf(citystats[3])));
		
		ui.add(new JLabel("Agriculture: "));
		ar.setText(String.valueOf(citystats[4]));
		ui.add(ar);
		ui.add(new JLabel("Industrial:"));
		in.setText(String.valueOf(citystats[5]));
		ui.add(in);
		ui.add(new JLabel("Finacial:"));
		fi.setText(String.valueOf(citystats[6]));
		ui.add(fi);
		ui.add(new JLabel("Tourism:"));
		to.setText(String.valueOf(citystats[7]));
		ui.add(to);
	
		ui.add(new JLabel());
		ui.add(new JLabel());
		JButton cancel = new JButton("Cancel");
		ui.add(cancel);
		JButton save = new JButton("Save");
		ui.add(save);
		
		cancel.addActionListener(new ccancela());
		save.addActionListener(new csavea());
		
		ui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		ui.pack();
		ui.setVisible(true);
	}
	
}
