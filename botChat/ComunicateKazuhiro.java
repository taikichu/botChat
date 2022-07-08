package botChat;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ComunicateKazuhiro extends JFrame{
	
	private static int count=0;
	public ComunicateKazuhiro() {super();}
	public  boolean RAComunicate(JPanel pane2,JTextField chatFieldKa,String reply) {
		int randomValue;
		StockValue value=new StockValue();
		String[] reactionList=value.getreactionList();
		String[] reactionP=value.getPList();
		String[] reactionN=value.getNList();
		
		
		
		value.RetMeword(reply);
		
		Random random=new Random();
		
		
			//反応するワードか検索する
			for(int i=0;reactionList.length>i;i++) {
				if(reply.contains(reactionList[i])) {
					count=0;
					break;
				}
				else if(reactionList.length==(i+1)) {
					count++;
					break;
				}
				else if(reply.equals("もうやめたい")) return false;
			}
			if(count==0) {
				randomValue=random.nextInt(reactionP.length);
				chatFieldKa.setText(reactionP[randomValue]);
				value.RetKaword(reactionP[randomValue]);
				return  true;
				}
			else if(count>=5) {
				count=0;
				return false;
				}
			else {
				randomValue=random.nextInt(reactionN.length);
				chatFieldKa.setText( reactionN[randomValue]);
				 value.RetKaword(reactionN[randomValue]);
				return true;
				}
	}
}
