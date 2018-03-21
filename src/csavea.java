import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

class csavea implements ActionListener {

	public void actionPerformed(ActionEvent event) {
		if (Integer.parseInt(uicity.ar.getText()) + Integer.parseInt(uicity.in.getText()) + Integer.parseInt(uicity.fi.getText()) + Integer.parseInt(uicity.to.getText()) == 100){
		String city = uicity.ui.getTitle();
		int [] cityuse = citycon.cmap.get(city);
		cityuse [4] = Integer.parseInt(uicity.ar.getText());
		cityuse [5] = Integer.parseInt(uicity.in.getText());
		cityuse [6] = Integer.parseInt(uicity.fi.getText());
		cityuse [7] = Integer.parseInt(uicity.to.getText());
		System.out.println("City land usage saved!");
		} else{
			System.out.println("Your land use must equal 100!");
		}
	}
	
}