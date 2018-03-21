import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ordera implements ActionListener {

	public void actionPerformed(ActionEvent event) {
		main.ele = 1;
		new uimain();
		uichoosestart.ui.dispose();
		
	}
	
}