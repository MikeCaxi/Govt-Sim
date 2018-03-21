import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class freea implements ActionListener {

	public void actionPerformed(ActionEvent event) {
		main.ele = 2;
		new uimain();
		uichoosestart.ui.dispose();
		
	}
	
}