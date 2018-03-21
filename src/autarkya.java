import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class autarkya implements ActionListener {

	public void actionPerformed(ActionEvent event){
		main.ele = 0;
		main.eley = -1;
		new uimain();
		uichoosestart.ui.dispose();
		
	}
	
}