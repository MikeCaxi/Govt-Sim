import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

class citya implements ActionListener {

	public void actionPerformed(ActionEvent event) {
		JButton button = (JButton) event.getSource();
		String city = button.getText();
		new uicity(main.cname.indexOf(city));
	}
	
}