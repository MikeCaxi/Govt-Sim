
public class budget {
	
	static double effwork;
	static double effrese;
	static double effmili;
	static double effheal;
	static double effadmi;
	static double effcens;
	static double effenvi;
	static double effjust;
	
	public static void budget(){
		
		main.budwork = Double.valueOf(uimain.budwork.getText());
		main.budrese = Double.valueOf(uimain.budrese.getText());
		main.budmili = Double.valueOf(uimain.budmili.getText());
		main.budheal = Double.valueOf(uimain.budheal.getText());
		main.budadmi = Double.valueOf(uimain.budadmi.getText());
		main.budcens = Double.valueOf(uimain.budcens.getText());
		main.budenvi = Double.valueOf(uimain.budenvi.getText());
		main.budjust = Double.valueOf(uimain.budjust.getText());
		
		budget.effwork = main.budwork / (main.infla * main.pop);
		budget.effrese = (main.budrese  * (main.res[0] / 2) + (Double.valueOf(uimain.rese1.getText()) / 2) + (Double.valueOf(uimain.rese2.getText()) / 2))/ main.infla;
		budget.effmili = main.budmili  * (main.res[3]) / main.infla;
		budget.effheal = main.budheal  * (main.res[2] / 2) / main.infla;
		budget.effadmi = main.budadmi  * (main.res[1] / 2) / main.infla;
		budget.effcens = main.budcens * (main.res[4] / 2) / main.infla;
		budget.effenvi = main.budenvi  * (main.res[5] / 2) / main.infla;
		budget.effjust = main.budjust / (main.infla * main.pop);
		
		uimain.effwork.setText(String.valueOf(effwork));
		uimain.effrese.setText(String.valueOf(effrese));
		uimain.effmili.setText(String.valueOf(effmili));
		uimain.effheal.setText(String.valueOf(effheal));
		uimain.effadmi.setText(String.valueOf(effadmi));
		uimain.effcens.setText(String.valueOf(effcens));
		uimain.effenvi.setText(String.valueOf(effenvi));
		uimain.effjust.setText(String.valueOf(effjust));
		
		
	}

}
