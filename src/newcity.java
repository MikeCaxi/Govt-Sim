import java.util.*;
public class newcity {
	
	public static void newcity(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the desired name for your new city:");
		String name = in.next();
		Random ran = new Random();
		int trait = ran.nextInt(4);
		int lf = ran.nextInt(101);
		int nr = ran.nextInt(101);
		int et = ran.nextInt(101);
		int cu = ran.nextInt(101);
		if (trait == 0){
			lf = lf + 25;
		} else if (trait == 1){
			nr = nr + 25;
		} else if (trait == 2){
			et = et + 25;
		} else if (trait == 3){
			cu = cu + 25;
		}
		new citycon(name, lf, nr, et, cu, 25, 25, 25, 25);
		main.numcity++;
		
	}

}
