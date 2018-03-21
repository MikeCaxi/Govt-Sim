import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.JButton;


public class main {
	public static String nation;
	public static int year;
	public static int season;
	public static double money;
	public static double indgoods;
	public static double agrgoods;
	public static double pop;
	public static double infla;
	public static double repre;
	public static double happy;
	//public static double unhap;
	public static double sup;
	public static int era;
	public static int numcity;
	
	public static double budwork;
	public static double budrese;
	public static double budmili;
	public static double budheal;
	public static double budadmi;
	public static double budcens;
	public static double budenvi;
	public static double budjust;
	
	public static String resn [] = {"Education", "Administration", "Health", "Military", "Censorship", "Enviroment", "Agricultre", "Mining", "Quality Control", "Diplomacy"};
	
	public static double [] res = new double[10];
	//public static int reseduc;
	//public static int resadmi;
	//public static int resheal;
	//public static int resmili;
	//public static int rescens;
	//public static int resenvi;
	//public static int resagri;
	//public static int resmine;
	//public static int resqual;
	//public static int resdip;
	
	public static double taxinco;
	//public static double taxsale;
	public static double taxtarr;
	public static double taxprod;
	
	public static int ele;
	public static int eley;
	
	public static ArrayList<String> cname = new ArrayList<String>();
	//public static Map<String, int[]> resmap = new HashMap<String, int[]>();
	//public static Map<String,Double> budmap = new HashMap<String,Double>();

	public static void main(String[] args) {

		new uistartg();
		

		
	}

}
