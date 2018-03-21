import java.util.HashMap;
import java.util.Map;


public class citycon {
	static Map<String,int[]> cmap = new HashMap<String,int[]>();

	public citycon(String cname, int LF, int NR, int ET, int CU, int AG, int IN, int FI, int TO){
		main.cname.add(cname);
		
		int [] city;
		city = new int[8];
		city[0] = LF;
		city[1] = NR;
		city[2] = ET;
		city[3] = CU;
		
		city[4] = AG;
		city[5] = IN;
		city[6] = FI;
		city[7] = TO;
		
		cmap.put(cname, city);
		

	}

}
