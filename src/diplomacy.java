
public class diplomacy {
	static double dip1;
	static double dip2;
	public static void dip1(){
		if (nextturn.pre == 1){
			dip1 = dip1 + (Double.valueOf(uimain.fund1.getText()) / main.infla) + main.res[9];
			dip1 = dip1 + (Double.valueOf(uimain.rese1.getText()) / 2 / main.infla)+ main.res[9];
			if (uimain.trad1.isSelected() && uimain.trad1.isEnabled()){
				dip1 = dip1 + (25 / Double.valueOf(uimain.tarr1.getText())) + main.res[9];
			}
			if (uimain.pric1.isSelected() && uimain.pric1.isEnabled()){
				dip1 = dip1 - (dip1 * 0.25) + main.res[9];
			}
			if (uimain.subs1.isSelected() && uimain.subs1.isEnabled()){
				dip1 = dip1 - (dip1 * 0.5) + main.res[9];
			}
			if (uimain.ally1.isSelected() && uimain.ally1.isEnabled()){
				dip1 = dip1 + 5 + main.res[9];
				dip2 = dip2 - (dip2 / main.res[9]);
			}
		
			uimain.trad1.setEnabled(false);
			uimain.pric1.setEnabled(false);
			uimain.subs1.setEnabled(false);
			uimain.ally1.setEnabled(false);
			
			if (uimain.nation1.getText().equals("Request Peace")){
				if (dip1 > 0){
					dip1 = 0;
					dip1 = dip1 - 25;
				} else{
					dip1 = dip1 -25;
				}
			}
			if (dip1 >= 5){
				uimain.trad1.setEnabled(true);
			}
			if (dip1 >= 25){
				uimain.pric1.setEnabled(true);
			}
			if (dip1 >= 50){
				uimain.subs1.setEnabled(true);
			}
			if (dip1 >= 75){
				uimain.ally1.setEnabled(true);
			}
			if (dip1 < -75){
				System.out.println("A faction has declared war on you");
				uimain.nation1.setText("Request Peace");
			}
		}
	}
	
	public static void dip2(){
		if (nextturn.pre == 1){
			dip2 = dip2 + (Double.valueOf(uimain.fund2.getText()) / main.infla) + main.res[9];
			dip2 = dip2 + (Double.valueOf(uimain.rese2.getText()) / 2 / main.infla);
			if (uimain.trad2.isSelected() && uimain.trad2.isEnabled()){
				dip2 = dip2 + (25 / Double.valueOf(uimain.tarr2.getText())) + main.res[9];
			}
			if (uimain.pric2.isSelected() && uimain.pric2.isEnabled()){
				dip2 = dip2 - (dip2 * 0.25) + main.res[9];
			}
			if (uimain.subs2.isSelected() && uimain.subs2.isEnabled()){
				dip2 = dip2 - (dip2 * 0.5) + main.res[9];
			}
			if (uimain.ally2.isSelected() && uimain.ally2.isEnabled()){
				dip2 = dip2 + 5 + main.res[9];
				dip1 = dip1 - (dip1 / main.res[9]);
			}
		
			uimain.trad2.setEnabled(false);
			uimain.pric2.setEnabled(false);
			uimain.subs2.setEnabled(false);
			uimain.ally2.setEnabled(false);
			
			if (uimain.nation2.getText().equals("Request Peace")){
				if (dip2 > 0){
					dip2 = 0;
					dip2 = dip2 - 25;
				} else{
					dip2 = dip2 -25;
				}
			}
		
			if (dip2 >= 5){
				uimain.trad2.setEnabled(true);
			}
			if (dip2 >= 25){
				uimain.pric2.setEnabled(true);
			}
			if (dip2 >= 50){
				uimain.subs2.setEnabled(true);
			}
			if (dip2 >= 75){
			uimain.ally2.setEnabled(true);
			}
			if (dip2 < -75){
				System.out.println("A faction has declared war on you");
				uimain.nation2.setText("Request Peace");
			}
		}
	}

}
