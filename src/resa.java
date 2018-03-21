import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;


class resa implements ActionListener {

	public void actionPerformed(ActionEvent event) {
		JButton button = (JButton) event.getSource();
		String resn = button.getText();
		uimain.res.setText(resn);
		if (!uimain.res.equals(null) && !uimain.res.equals("") && !uimain.rest.equals("0")){
			String res = uimain.res.getText();
			research.req = main.res[Arrays.asList(main.resn).indexOf(res)] * 10 / budget.effrese;
			research.rest = (int)Math.ceil(research.req / budget.effrese);
			uimain.rest.setText(String.valueOf(research.rest));
		}
		
	}
	
}