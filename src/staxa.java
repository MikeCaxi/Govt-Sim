import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

class staxa implements ActionListener {

	public void actionPerformed(ActionEvent event) {
		if (Double.valueOf(uitax.taxinco.getText()) <= 100){
			main.taxinco = Double.valueOf(uitax.taxinco.getText());
			System.out.println("Income tax saved");
		} else{
			System.out.println("Tax rate must be inbewtween 0 - 100");
		}
		
		if (Double.valueOf(uitax.taxprod.getText()) <= 100){
			main.taxprod = Double.valueOf(uitax.taxprod.getText());
			System.out.println("Produce tax saved");
		} else{
			System.out.println("Tax rate must be inbewtween 0 - 100");
		}
	}
	
}