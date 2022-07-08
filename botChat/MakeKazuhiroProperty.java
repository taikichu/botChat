package botChat;

import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class MakeKazuhiroProperty extends JFrame{
	JPanel propertyKa;
	final String addWord="追加";
	final String removeWord="削除";
	final String wordList="一覧";
	
	final int r0=0;
	final int p1=1;
	final int n2=2;
	
	
	
	public MakeKazuhiroProperty(String title) {	super(title);}
	public MakeKazuhiroProperty() {	super();}
	public void MakePropertyKa() {
		
		propertyKa=(JPanel)getContentPane();
		JPanel menu=new JPanel();
		JPanel rmenu=new JPanel();
		JPanel pmenu=new JPanel();
		JPanel nmenu=new JPanel();
		
		menu.setLayout(new BoxLayout(menu,BoxLayout.Y_AXIS));
		rmenu.setLayout(new BoxLayout(rmenu,BoxLayout.X_AXIS));
		pmenu.setLayout(new BoxLayout(pmenu,BoxLayout.X_AXIS));
		nmenu.setLayout(new BoxLayout(nmenu,BoxLayout.X_AXIS));
		
		 LineBorder border = new LineBorder(Color.RED, 2, true);rmenu.setBorder(border);
		
		
		JLabel rAction=new JLabel("リアクションリスト");
		JLabel positive=new JLabel("ポジティブリスト");
		JLabel negative=new JLabel("ネガティブリスト");
		
		JButton addAction=new JButton(new PropertyActionKa(propertyKa,addWord,r0,r0));
		JButton addPositive=new JButton(new PropertyActionKa(propertyKa,addWord,p1,r0));
		JButton addNegative=new JButton(new PropertyActionKa(propertyKa,addWord,n2,r0));
		
		JButton removeAction=new JButton(new PropertyActionKa(propertyKa,removeWord,r0,p1));
		JButton removePositive=new JButton(new PropertyActionKa(propertyKa,removeWord,p1,p1));
		JButton removeNegative=new JButton(new PropertyActionKa(propertyKa,removeWord,n2,p1));
		
		JButton showAction=new JButton(new PropertyActionKa(propertyKa,wordList,r0,n2));
		JButton showPositive=new JButton(new PropertyActionKa(propertyKa,wordList,p1,n2));
		JButton showNegative=new JButton(new PropertyActionKa(propertyKa,wordList,n2,n2));
		
		rmenu.add(rAction);rmenu.add(addAction);rmenu.add(removeAction);rmenu.add(showAction);
		pmenu.add(positive);pmenu.add(addPositive);pmenu.add(removePositive);pmenu.add(showPositive);
		nmenu.add(negative);nmenu.add(addNegative);nmenu.add(removeNegative);nmenu.add(showNegative);
		
		menu.add(rmenu);menu.add(pmenu);menu.add(nmenu);
		
		propertyKa.add(menu);
	}
	public JPanel getPane() {
		return propertyKa;
	}
}
