import javax.swing.SwingUtilities;


public class nextturn {
	static int con;
	static int pre;
	public static void nextturn(){
		if (pre == 1){
			if (main.season == 3){
				main.season = 0;
				main.year++;
				if (main.ele >= 1){
					if (main.eley == 0){
						if (main.sup > 0){
						System.out.println("You have won the Election of " + main.year + ", next election in 4 years");
						} else{
							System.out.println("You have been voted out of office, your reign of rule lasted " + (main.year - 1900) + " years.");
							new uistartg();
							uimain.ui.dispose();
							con = 1;
						}
					} else{
						main.eley--;
					}
				}
			} else{
				main.season++;
				main.infla = main.infla + 0.05;
				if (main.year == 1914 || main.year == 1919 || main.year == 1945 || main.year == 1991){
					main.era++;
					diplomacy.dip1 = 0;
					diplomacy.dip2 = 0;
					System.out.println("An new era has dawn!");
				}
				}
			//expandm.expandm();
			diplomacy.dip1();
			diplomacy.dip2();
			military.mili1();
			military.mili2();
			military.milis();
			income.in();
			income.out();
			if (main.money < 0){
				main.happy = main.happy + (main.money / 2);
			}
			if (main.agrgoods < 0){
				main.happy = main.happy + main.agrgoods;
			}
			if (main.indgoods < 0){
				main.happy = main.happy + main.indgoods;
			}
			main.pop = main.pop + (main.agrgoods / 100) - (main.pop * 0.1 / main.res[2]);
			main.happy = main. happy + budget.effwork + budget.effjust - (main.taxinco - 5) - (main.taxprod - 5) - (main.repre / 2);
			//main.unhap = main.unhap + main.repre + (main.taxinco - budget.effadmi) + (main.taxprod - budget.effadmi) + (main.res[0] * main.pop) + main.numcity;
			if (main.ele == 1){
				main.sup = (main.happy + (main.repre / 2) - 25);
			} else if (main.ele == 2){
				main.sup = (main.happy + (main.repre / 8));
			}
			expandm.expandm();

		} else{
			pre = 1;
		}
		research.res();
		budget.budget();
		if (con == 0){
		new uitemp();
		uimain.ui.dispose();
		new uimain();
		uitemp.ui.dispose();
		}
	}

}
