import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


class expanda implements ActionListener {

	public void actionPerformed(ActionEvent event) {
		JButton button = (JButton) event.getSource();
		String action = button.getText();
		if (action.equals("Expand")){
			uimain.expand.setEnabled(false);
			expandm.turn = 4;
			uimain.expand.setText("Turns Left: " + expandm.turn);
		}
		
	}
	
}