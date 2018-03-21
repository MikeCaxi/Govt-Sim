import java.util.Arrays;


public class research {
	static double req;
	static int rest;
	public static void res(){
		 if(!uimain.res.getText().equals(".") && req <= 0){
			String resn = uimain.res.getText();
			main.res[Arrays.asList(main.resn).indexOf(resn)]++;
			System.out.println("Research Complete, please select new research");
			uimain.rest.setText("0");
			rest = 0;
			uimain.res.setText(".");
		} else if(!uimain.res.getText().equals(".") && req > 0){
			req = req - budget.effrese;
			rest = (int)Math.ceil(req / budget.effrese);
			uimain.rest.setText(String.valueOf(rest));
		}
	}

}
