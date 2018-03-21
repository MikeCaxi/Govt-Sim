import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.Scanner;

import javax.swing.JFrame;


class newa implements ActionListener {

	public void actionPerformed(ActionEvent event) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the name of your country");
		main.nation = in.next();
		newsaveload.newg();
		newcity.newcity();
		new uichoosestart();
		uistartg.ui.dispose();
		in.close();
	}
	
}