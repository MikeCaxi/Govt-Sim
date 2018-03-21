import java.util.Random;


public class military {
	static double milis;
	public static void milis(){
		if (nextturn.pre == 1){
			milis = milis - (milis * (main.infla - 1));
			milis = milis + budget.effmili;
		}
		if (uimain.ally1.isSelected()){
			milis = milis + (diplomacy.dip1 / 2);
		}
		if (uimain.ally2.isSelected()){
			milis = milis + (diplomacy.dip2 / 2);
		}
		milis = milis / (main.numcity / 4);
	}
	
	public static void mili1(){
		if (uimain.nation1.getText().equals("Request Peace")){
			if (milis > (-diplomacy.dip1)){
				milis = milis + (diplomacy.dip1 / 2);
				newcity.newcity();
			} else if (milis < (-diplomacy.dip1)){
				milis = milis - ((milis / main.numcity) * 2);
				Random ran = new Random();
				int city = ran.nextInt(main.numcity);
				System.out.println("Your nation lost " + main.cname.get(city) + " as a result of war.");
				main.cname.remove(city);
			}
		}
	}
		
		public static void mili2(){
			if (uimain.nation2.getText().equals("Request Peace")){
				if (milis > (-diplomacy.dip2)){
					milis = milis + (diplomacy.dip2 / 2);
					newcity.newcity();
				} else if (milis < (-diplomacy.dip2)){
					milis = milis - ((milis / main.numcity) * 2);
					Random ran = new Random();
					int city = ran.nextInt(main.numcity);
					System.out.println("Your nation lost " + main.cname.get(city) + " as a result of war.");
					main.cname.remove(city);
				}
			}
	}

}
