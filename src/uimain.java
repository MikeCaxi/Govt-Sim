import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class uimain{
	static JFrame ui = new JFrame();
	static Map<String,JButton> bmap = new HashMap<String,JButton>();
	static JButton nation1 = new JButton("Attack");
	static JButton nation2 = new JButton("Attack");
	static JButton expand = new JButton("Expand");
	
	static JTextField budwork = new JTextField(8);
	static JTextField budrese = new JTextField(8);
	static JTextField budmili = new JTextField(8);
	static JTextField budheal = new JTextField(8);
	static JTextField budadmi = new JTextField(8);
	static JTextField budcens = new JTextField(8);
	static JTextField budenvi = new JTextField(8);
	static JTextField budjust = new JTextField(8);
	static JLabel effwork = new JLabel();
	static JLabel effrese = new JLabel();
	static JLabel effmili = new JLabel();
	static JLabel effheal = new JLabel();
	static JLabel effadmi = new JLabel();
	static JLabel effcens = new JLabel();
	static JLabel effenvi = new JLabel();
	static JLabel effjust = new JLabel();
	
	static JLabel res = new JLabel();
	static JTextField rest = new JTextField(String.valueOf(research.rest));
	
	static JTextField fund1 = new JTextField();
	static JTextField fund2 = new JTextField();
	static JTextField agri1 = new JTextField();
	static JTextField agri2 = new JTextField();
	static JTextField indu1 = new JTextField();
	static JTextField indu2 = new JTextField();
	static JTextField tarr1 = new JTextField();
	static JTextField tarr2 = new JTextField();
	static JTextField rese1 = new JTextField();
	static JTextField rese2 = new JTextField();
	static JButton rela1 = new JButton(String.valueOf(diplomacy.dip1));
	static JButton rela2 = new JButton(String.valueOf(diplomacy.dip2));
	static JCheckBox trad1 = new JCheckBox();
	static JCheckBox trad2 = new JCheckBox();
	static JCheckBox pric1 = new JCheckBox();
	static JCheckBox pric2 = new JCheckBox();
	static JCheckBox subs1 = new JCheckBox();
	static JCheckBox subs2 = new JCheckBox();
	static JCheckBox ally1 = new JCheckBox();
	static JCheckBox ally2 = new JCheckBox();
	
	static JTextField taxinco = new JTextField();
	static JTextField taxprod = new JTextField();
	
	public uimain(){
		
		if (nextturn.pre == 0){
			System.out.println("This is pre-game setup, time will not pass, please insert all your values.");
		}
		
		ui.getContentPane().removeAll();
		ui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JTabbedPane jtp = new JTabbedPane();
		JPanel cities = new JPanel();
		JPanel mainp = new JPanel();
		JPanel budget = new JPanel();
		JPanel militaryp = new JPanel();
		JPanel research = new JPanel();
		//JPanel tax = new JPanel();
		
		ui.getContentPane().add(jtp);
		
		ImageIcon era1 = new ImageIcon("era" + main.era + "1.png");
		ImageIcon era2 = new ImageIcon("era" + main.era + "2.png");
		mainp.setLayout(new GridLayout(11, 5));
		
		String seasons [] = {"Spring", "Summer", "Autumn", "Winter"};
		String era [] = {"Age of Sail", "World War 1", "World War 2", "Cold War", "Modern Era"};
		mainp.add(new JLabel("Year: " + main.year + "|" + seasons[main.season] + "|" + era[main.era - 1]));
		mainp.add(new JLabel(era1));
		mainp.add(new JLabel(era2));
		mainp.add(new JLabel("Population:"));
		mainp.add(new JLabel(String.valueOf(main.pop)));
		
		mainp.add(new JLabel("Funding:"));
		mainp.add(fund1);
		mainp.add(fund2);
		mainp.add(new JLabel("National Treasury:"));
		mainp.add(new JLabel(String.valueOf(main.money)));
		
		mainp.add(new JLabel("Export Agri. goods: "));
		mainp.add(agri1);
		mainp.add(agri2);
		mainp.add(new JLabel("Tons Agri. goods"));
		mainp.add(new JLabel(String.valueOf(main.agrgoods)));
		
		mainp.add(new JLabel("Export Ind. goods:"));
		mainp.add(indu1);
		mainp.add(indu2);
		mainp.add(new JLabel("Tons of Ind. goods:"));
		mainp.add(new JLabel(String.valueOf(main.indgoods)));
		
		mainp.add(new JLabel("Tarriff:"));
		mainp.add(tarr1);
		mainp.add(tarr2);
		mainp.add(new JLabel("Happiness:"));
		mainp.add(new JLabel(String.valueOf(main.happy)));
		
		mainp.add(new JLabel("Joint Research Funding:"));
		mainp.add(rese1);
		mainp.add(rese2);
		mainp.add(new JLabel("Repression:"));
		mainp.add(new JLabel(String.valueOf(main.repre)));
		
		mainp.add(new JLabel("Relations:"));
		mainp.add(rela1);
		mainp.add(rela2);
		mainp.add(new JLabel("Taxes:"));
		//mainp.add(new JLabel(String.valueOf(main.unhap)));
		JButton tax = new JButton("Edit Taxes");
		mainp.add(tax);
		
		tax.addActionListener(new taxa());
		
		mainp.add(new JLabel("Trading:"));
		mainp.add(trad1);
		mainp.add(trad2);
		mainp.add(new JLabel("Support:"));
		mainp.add(new JLabel(String.valueOf(main.sup)));
		
		mainp.add(new JLabel("Price adjustment:"));
		mainp.add(pric1);
		mainp.add(pric2);
		mainp.add(new JLabel("Next election at:"));
		mainp.add(new JLabel());
		
		mainp.add(new JLabel("Subsidies:"));
		mainp.add(subs1);
		mainp.add(subs2);
		JButton next = new JButton("Next");
		JButton turn = new JButton("Turn");
		mainp.add(next);
		mainp.add(turn);
		
		next.addActionListener(new nextturna());
		turn.addActionListener(new nextturna());
		
		mainp.add(new JLabel("Allies:"));
		mainp.add(ally1);
		mainp.add(ally2);
		JButton save = new JButton("Save");
		mainp.add(save);
		JButton savenquit = new JButton("Save and Quit");
		mainp.add(savenquit);
		
		save.addActionListener(new savea());
		savenquit.addActionListener(new savenquita());
		
		budget.setLayout(new GridLayout(9, 3));
		
		budget.add(new JLabel("Departments"));
		budget.add(new JLabel("Funding"));
		budget.add(new JLabel("Effectiveness"));
		
		budget.add(new JLabel("Worker Rights:"));
		budget.add(budwork);
		budget.add(effwork);
		
		budget.add(new JLabel("Research:"));
		budget.add(budrese);
		budget.add(effrese);
	
		budget.add(new JLabel("Military:"));
		budget.add(budmili);
		budget.add(effmili);
		
		budget.add(new JLabel("Health:"));
		budget.add(budheal);
		budget.add(effheal);
		
		budget.add(new JLabel("Administration:"));
		budget.add(budadmi);
		budget.add(effadmi);
		
		budget.add(new JLabel("Censorship:"));
		budget.add(budcens);
		budget.add(effcens);
		
		budget.add(new JLabel("Enviroment:"));
		budget.add(budenvi);
		budget.add(effenvi);
		
		budget.add(new JLabel("Justice:"));
		budget.add(budjust);
		budget.add(effjust);
		
		
		research.setLayout(new GridLayout(7, 4));
		
		research.add(new JLabel("Technology"));
		research.add(new JLabel("Level"));
		research.add(new JLabel("Technology"));
		research.add(new JLabel("Level"));
		
		JButton reseduc = new JButton("Education");
		research.add(reseduc);
		research.add(new JLabel(String.valueOf(main.res[0])));
		JButton resadmi = new JButton("Administration");
		research.add(resadmi);
		research.add(new JLabel(String.valueOf(main.res[1])));
		
		JButton resheal = new JButton("Health");
		research.add(resheal);
		research.add(new JLabel(String.valueOf(main.res[2])));
		JButton resmili = new JButton("Military");
		research.add(resmili);
		research.add(new JLabel(String.valueOf(main.res[3])));

		JButton rescens = new JButton("Censorship");
		research.add(rescens);
		research.add(new JLabel(String.valueOf(main.res[4])));
		JButton resenvi = new JButton("Enviroment");
		research.add(resenvi);
		research.add(new JLabel(String.valueOf(main.res[5])));

		JButton resagri = new JButton("Agriculture");
		research.add(resagri);
		research.add(new JLabel(String.valueOf(main.res[6])));
		JButton resmine = new JButton("Mining");
		research.add(resmine);
		research.add(new JLabel(String.valueOf(main.res[7])));
		
		JButton resqual = new JButton("Quality Control");
		research.add(resqual);
		research.add(new JLabel(String.valueOf(main.res[8])));
		JButton resdip = new JButton("Diplomacy");
		research.add(resdip);
		research.add(new JLabel(String.valueOf(main.res[9])));
		
		research.add(new JLabel("Researching:"));
		research.add(res);
		research.add(new JLabel("Turns Left:"));
		research.add(rest);
		
		reseduc.addActionListener(new resa());
		resadmi.addActionListener(new resa());
		resheal.addActionListener(new resa());
		resmili.addActionListener(new resa());
		rescens.addActionListener(new resa());
		resenvi.addActionListener(new resa());
		resagri.addActionListener(new resa());
		resmine.addActionListener(new resa());
		resqual.addActionListener(new resa());
		resdip.addActionListener(new resa());
		
		cities.setLayout(new GridLayout((int) (Math.ceil(Double.valueOf(main.numcity)) / 4), 8));
		for (int i = 0; i < Double.valueOf(main.numcity); i++){
			JButton cityb= new JButton(String.valueOf(main.cname.get(i)));
			cities.add(cityb);
			cities.add(new JLabel());
			bmap.put(main.cname.get(i), cityb);
			bmap.get(main.cname.get(i)).addActionListener(new citya());
		}
		
		
		militaryp.setLayout(new GridLayout(4, 4));
		
		militaryp.add(new JLabel());
		militaryp.add(new JLabel(String.valueOf(main.year) + "|" + seasons [main.season]));
		militaryp.add(new JLabel(era [main.era - 1]));
		militaryp.add(new JLabel("'Free' Territories Left: " + String.valueOf(expandm.freet)));
		
		militaryp.add(new JLabel("Nation:"));
		militaryp.add(new JLabel(era1));
		militaryp.add(new JLabel(era2));
		militaryp.add(new JLabel("country"));
		
		militaryp.add(new JLabel("Military Strength: "));
		militaryp.add(new JLabel(String.valueOf(diplomacy.dip1)));
		militaryp.add(new JLabel(String.valueOf(diplomacy.dip2)));
		militaryp.add(new JLabel(String.valueOf(military.milis)));
		
		militaryp.add(new JLabel("Available Action:"));
		militaryp.add(nation1);
		militaryp.add(nation2);
		militaryp.add(expand);
		
		nation1.addActionListener(new nation1a());
		nation2.addActionListener(new nation2a());
		expand.addActionListener(new expanda());
		
		
		jtp.addTab("Main", mainp);
		jtp.addTab("Budget", budget);
		jtp.addTab("Research", research);
		jtp.addTab("Cities", cities);
		jtp.addTab("Military", militaryp);
		 
		ui.pack();
		ui.setVisible(true);
	}
	
}
