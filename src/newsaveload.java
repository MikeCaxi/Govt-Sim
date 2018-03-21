import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Scanner;
public class newsaveload {
	
	public static void newg(){
		main.year = 1900;
		main.season = 0;
		main.money = 1;
		main.indgoods = 0;
		main.agrgoods = 0;
		main.pop = 1;
		main.infla = 1;
		main.era = 1;
		
		main.budwork = 0;
		main.budrese = 0;
		main.budmili = 0;
		main.budheal = 0;
		main.budadmi = 0;
		main.budcens = 0;
		main.budenvi = 0;
		main.budjust = 0;
		
		main.res[0] = 1;
		main.res[1] = 1;
		main.res[2] = 1;
		main.res[3] = 1;
		main.res[4] = 1;
		main.res[5] = 1;
		main.res[6] = 1;
		main.res[7] = 1;
		main.res[8] = 1;
		main.res[9] = 1;
		
		//main.reseduc = 1;
		//main.resadmi = 1;
		//main.resheal = 1;
		//main.resmili = 1;
		//main.rescens = 1;
		//main.resenvi = 1;
		//main.resagri = 1;
		//main.resmine = 1;
		//main.resqual = 1;
		
		main.taxinco = 0;
		main.taxtarr = 0;
		main.taxprod = 0;
		
		expandm.freet = 16;
		
		//main.resmap.put("Education", main.res);
		
		//budget.effwork = main.budwork / (main.infla * main.pop);
		//budget.effrese = main.budrese  * (main.res[0] / 2) / main.infla;
		//System.out.println(main.budrese);
		//System.out.println(main.res[0] / 2);
		//budget.effmili = main.budmili  * (main.res[3] / 2) / main.infla;
		//budget.effheal = main.budheal  * (main.res[2] / 2) / main.infla;
		//budget.effadmi = main.budadmi  * (main.res[1] / 2) / main.infla;
		//budget.effcens = main.budcens * (main.res[4] / 2) / main.infla;
		//budget.effenvi = main.budenvi  * (main.res[5] / 2) / main.infla;
		//budget.effjust = main.budjust / (main.infla * main.pop);
		
		//uimain.effwork.setText(String.valueOf(budget.effwork));
		//uimain.effrese.setText(String.valueOf(budget.effrese));
		//uimain.effmili.setText(String.valueOf(budget.effmili));
		//uimain.effheal.setText(String.valueOf(budget.effheal));
		//uimain.effadmi.setText(String.valueOf(budget.effadmi));
		//uimain.effcens.setText(String.valueOf(budget.effcens));
		//uimain.effenvi.setText(String.valueOf(budget.effenvi));
		//uimain.effjust.setText(String.valueOf(budget.effjust));
		
		uimain.budwork.setText(String.valueOf(main.budwork));
		uimain.budrese.setText(String.valueOf(main.budrese));
		uimain.budmili.setText(String.valueOf(main.budmili));
		uimain.budheal.setText(String.valueOf(main.budheal));
		uimain.budadmi.setText(String.valueOf(main.budadmi));
		uimain.budcens.setText(String.valueOf(main.budcens));
		uimain.budenvi.setText(String.valueOf(main.budenvi));
		uimain.budjust.setText(String.valueOf(main.budjust));
		
		uimain.res.setText(".");
		
	}
	
	public static void saveg(){
		try{
			PrintWriter rsave = new PrintWriter("save.txt");
			rsave.println(main.nation);
			rsave.println(main.year);
			rsave.println(main.season);
			rsave.println(main.money);
			rsave.println(main.indgoods);
			rsave.println(main.agrgoods);
			rsave.println(main.pop);
			rsave.println(main.infla);
			rsave.println(main.repre);
			rsave.println(main.happy);
			//rsave.println(main.unhap);
			rsave.println(main.sup);
			rsave.println(main.era);
			rsave.println(main.numcity);
			
			rsave.println(main.budwork);
			rsave.println(main.budrese);
			rsave.println(main.budmili);
			rsave.println(main.budheal);
			rsave.println(main.budadmi);
			rsave.println(main.budcens);
			rsave.println(main.budenvi);
			rsave.println(main.budjust);
			
			rsave.println(main.res[0]);
			rsave.println(main.res[1]);
			rsave.println(main.res[2]);
			rsave.println(main.res[3]);
			rsave.println(main.res[4]);
			rsave.println(main.res[5]);
			rsave.println(main.res[6]);
			rsave.println(main.res[7]);
			rsave.println(main.res[8]);
			rsave.println(main.res[9]);
			
			rsave.println(uimain.res.getText());
			rsave.println(research.rest);
			
			rsave.println(main.taxinco);
			rsave.println(main.taxtarr);
			rsave.println(main.taxprod);
			
			rsave.println(main.ele);
			rsave.println(main.eley);
			
			rsave.println(diplomacy.dip1);
			rsave.println(diplomacy.dip2);
			
			rsave.println(military.milis);
			
			rsave.println(expandm.freet);
			rsave.println(expandm.turn);
			
			rsave.close();
		} catch (IOException e){
			e.printStackTrace();
		}
		
	}
	
	public static void csave(){
		
			try{
				PrintWriter rsave = new PrintWriter("city.txt");
				for (int i = 0; i < main.numcity; i++){
				int[] saving = citycon.cmap.get(String.valueOf(main.cname.get(i)));
				rsave.println(main.cname.get(i));
				rsave.println(saving[0]);
				rsave.println(saving[1]);
				rsave.println(saving[2]);
				rsave.println(saving[3]);
				rsave.println(saving[4]);
				rsave.println(saving[5]);
				rsave.println(saving[6]);
				rsave.println(saving[7]);
				if (i == main.numcity - 1){
					rsave.close();
				}
				}
			} catch (IOException e){
				e.printStackTrace();
			}
		
	}
	
	public static void loadg(){
		File in = new File("save.txt");
		try {
			Scanner read = new Scanner(in);
			while (read.hasNext()){
				main.nation = read.next();
				main.year = read.nextInt();
				main.season = read.nextInt();
				main.money = read.nextDouble();
				main.indgoods = read.nextDouble();
				main.agrgoods = read.nextDouble();
				main.pop = read.nextDouble();
				main.infla = read.nextDouble();
				main.repre = read.nextDouble();
				main.happy = read.nextDouble();
				//main.unhap = read.nextDouble();
				main.sup = read.nextDouble();
				main.era = read.nextInt();
				main.numcity = read.nextInt();
				
				main.budwork = read.nextDouble();
				main.budrese = read.nextDouble();
				main.budmili = read.nextDouble();
				main.budheal = read.nextDouble();
				main.budadmi = read.nextDouble();
				main.budcens = read.nextDouble();
				main.budenvi = read.nextDouble();
				main.budjust = read.nextDouble();
				
				main.res[0] = read.nextDouble();
				main.res[1] = read.nextDouble();
				main.res[2] = read.nextDouble();
				main.res[3] = read.nextDouble();
				main.res[4] = read.nextDouble();
				main.res[5] = read.nextDouble();
				main.res[6] = read.nextDouble();
				main.res[7] = read.nextDouble();
				main.res[8] = read.nextDouble();
				main.res[9] = read.nextDouble();
				
				uimain.res.setText(read.next());
				research.rest = read.nextInt();
				
				uimain.rest.setText(String.valueOf(research.rest));
				
				main.taxinco = read.nextDouble();
				main.taxtarr = read.nextDouble();
				main.taxprod = read.nextDouble();
				
				main.ele = read.nextInt();
				main.eley = read.nextInt();
				
				diplomacy.dip1 = read.nextDouble();
				diplomacy.dip2 = read.nextDouble();
				
				military.milis = read.nextDouble();
				
				expandm.freet = read.nextInt();
				expandm.turn = read.nextInt();
				
				//main.resmap.put("Education", main.res);

				//budget.effwork = main.budwork / (main.infla * main.pop);
				//budget.effrese = main.budrese  * (main.res[0] / 2) / main.infla;
				//System.out.println(main.budrese);
				//budget.effmili = main.budmili  * (main.res[3] / 2) / main.infla;
				//budget.effheal = main.budheal  * (main.res[2] / 2) / main.infla;
				//budget.effadmi = main.budadmi  * (main.res[1] / 2) / main.infla;
				//budget.effcens = main.budcens * (main.res[4] / 2) / main.infla;
				//budget.effenvi = main.budenvi  * (main.res[5] / 2) / main.infla;
				//budget.effjust = main.budjust / (main.infla * main.pop);
				
				//uimain.effwork.setText(String.valueOf(budget.effwork));
				//uimain.effrese.setText(String.valueOf(budget.effrese));
				//uimain.effmili.setText(String.valueOf(budget.effmili));
				//uimain.effheal.setText(String.valueOf(budget.effheal));
				//uimain.effadmi.setText(String.valueOf(budget.effadmi));
				//uimain.effcens.setText(String.valueOf(budget.effcens));
				//uimain.effenvi.setText(String.valueOf(budget.effenvi));
				//uimain.effjust.setText(String.valueOf(budget.effjust));
				
				uimain.budwork.setText(String.valueOf(main.budwork));
				uimain.budrese.setText(String.valueOf(main.budrese));
				uimain.budmili.setText(String.valueOf(main.budmili));
				uimain.budheal.setText(String.valueOf(main.budheal));
				uimain.budadmi.setText(String.valueOf(main.budadmi));
				uimain.budcens.setText(String.valueOf(main.budcens));
				uimain.budenvi.setText(String.valueOf(main.budenvi));
				uimain.budjust.setText(String.valueOf(main.budjust));

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void cload(){
		File cin = new File("city.txt");
		try {
			Scanner cread = new Scanner(cin);
			for (int i = 0; i < main.numcity; i++){
				String name = cread.nextLine();
				String lf = cread.nextLine();
				String nr = cread.nextLine();
				String et = cread.nextLine();
				String cu = cread.nextLine();
				String ag = cread.nextLine();
				String in = cread.nextLine();
				String fi = cread.nextLine();
				String to = cread.nextLine();
				new citycon(String.valueOf(name), Integer.parseInt(lf), Integer.parseInt(nr), Integer.parseInt(et), Integer.parseInt(cu), Integer.parseInt(ag), Integer.parseInt(in), Integer.parseInt(fi), Integer.parseInt(to));
		}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		}
		
	}


