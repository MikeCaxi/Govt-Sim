import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class loada implements ActionListener {

	public void actionPerformed(ActionEvent event) {
		newsaveload.loadg();
		newsaveload.cload();
		new uimain();
		uistartg.ui.dispose();
	}
	
}