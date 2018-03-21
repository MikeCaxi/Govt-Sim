import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import java.util.Scanner;

class nation1a implements ActionListener {

	public void actionPerformed(ActionEvent event) {
		JButton button = (JButton) event.getSource();
		String action = button.getText();
		if (action.equals("Attack")){
			uimain.nation1.setText("Request Peace");
		} else if (action.equals("Request Peace")){
			if (military.milis > diplomacy.dip1){
				System.out.println("Request for peace accepted");
				uimain.nation1.setText("Attack");
			} else {
				System.out.println("The demand for peace is " + diplomacy.dip1 / 10 + "(y/n)");
				Scanner in = new Scanner(System.in);
				if (in.nextLine().equals("y")){
					main.money = main.money - (diplomacy.dip1 / 10);
					uimain.nation1.setText("Attack");
				}
			}
			
		}
	}
	
}