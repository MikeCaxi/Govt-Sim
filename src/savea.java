import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class savea implements ActionListener {

	public void actionPerformed(ActionEvent event) {
		newsaveload.saveg();
		newsaveload.csave();
		System.out.println("Game Saved");
	}
	
}