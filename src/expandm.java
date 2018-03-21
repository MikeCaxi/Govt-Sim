
public class expandm {
	static int freet;
	static int turn;
	public static void expandm(){
		if (turn > 1){
			turn--;
		} else if (turn == 1 && freet > 0){
			System.out.println("You have conqured a new city!");
			newcity.newcity();
			uimain.expand.setText("Expand");
			uimain.expand.setEnabled(true);
			freet--;
			turn = 0;
		}
	}

}
