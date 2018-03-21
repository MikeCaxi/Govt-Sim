
public class income {
	
	static double pric1;
	static double pric2;
	
	public static void in(){
		main.money = main.money + main.pop * (main.taxinco / 10);

		for (int i = 0; i < main.numcity; i++){
			main.agrgoods = main.agrgoods + (citycon.cmap.get(main.cname.get(i))[0] * citycon.cmap.get(main.cname.get(i))[4] * (main.taxprod + main.res[1] / 100) / 1000);
		}
		
		for (int i = 0; i < main.numcity; i++){
			main.indgoods = main.indgoods + (citycon.cmap.get(main.cname.get(i))[1] * citycon.cmap.get(main.cname.get(i))[5] * (main.taxprod + main.res[1] / 100) / 1000);
		}
		
		for (int i = 0; i < main.numcity; i++){
			main.money = main.money + (citycon.cmap.get(main.cname.get(i))[3] * citycon.cmap.get(main.cname.get(i))[7] * (main.taxinco + main.res[1] / 100) / 1000);
		}
		
		if (uimain.trad1.isSelected() && uimain.trad1.isEnabled()){
			for (int i = 0; i < main.numcity; i++){
				main.money = main.money + (citycon.cmap.get(main.cname.get(i))[2] * citycon.cmap.get(main.cname.get(i))[6] * (main.taxtarr + main.res[1] / 100) / 1000);
			}
		}
		
		if (uimain.trad2.isSelected() && uimain.trad2.isEnabled()){
			for (int i = 0; i < main.numcity; i++){
				main.money = main.money + (citycon.cmap.get(main.cname.get(i))[2] * citycon.cmap.get(main.cname.get(i))[6] * (main.taxtarr + main.res[1] / 100) / 1000);
			}
		}
		
		if (uimain.subs1.isSelected() && uimain.trad1.isEnabled()){
			main.money = main.money + (diplomacy.dip1 / 2);
		}
		
		if (uimain.subs2.isSelected() && uimain.trad2.isEnabled()){
			main.money = main.money + (diplomacy.dip2 / 2);
		}
		
		if (!uimain.agri1.getText().equals(null)){
			if (uimain.pric1.isSelected() && uimain.pric1.isEnabled()){
				pric1 = main.res[8] / 2 * 1.25;
			} else{
				pric1 = main.res[8] / 2;
			}
			main.money = main.money +  Double.valueOf(uimain.agri1.getText()) * pric1;
			main.agrgoods = main.agrgoods -  Double.valueOf(uimain.agri1.getText()); 
		}
		
		if (!uimain.indu1.getText().equals(null)){
			if (uimain.pric1.isSelected() && uimain.pric1.isEnabled()){
				pric1 = main.res[8] / 2 * 1.25;
			} else{
				pric1 = main.res[8] / 2;
			}
			main.money = main.money + Double.valueOf(uimain.indu1.getText()) * pric1;
			main.indgoods = main.indgoods -  Double.valueOf(uimain.indu1.getText()); 
		}
		
		if (!uimain.agri2.getText().equals(null)){
			if (uimain.pric2.isSelected() && uimain.pric2.isEnabled()){
				pric2 = main.res[8] / 2 * 2.25;
			} else{
				pric2 = main.res[8] / 2;
			}
			main.money = main.money + Double.valueOf(uimain.agri2.getText()) * pric2;
			main.agrgoods = main.agrgoods -  Double.valueOf(uimain.agri2.getText()); 
		}
		
		if (!uimain.indu2.getText().equals(null)){
			if (uimain.pric2.isSelected() && uimain.pric2.isEnabled()){
				pric2 = main.res[8] / 2 * 2.25;
			} else{
				pric2 = main.res[8] / 2;
			}
			main.money = main.money + Double.valueOf(uimain.indu2.getText()) * pric2;
			main.indgoods = main.indgoods -  Double.valueOf(uimain.indu2.getText()); 
		}
		

		
	}
	
	public static void out(){
		main.money = main.money - main.budwork - main.budrese - main.budmili - main.budheal - main.budadmi - main.budcens - main.budenvi - main.budjust;
	}

}
