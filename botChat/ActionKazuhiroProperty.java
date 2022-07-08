package botChat;

import java.awt.Dimension;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

//AbstractAction

public class ActionKazuhiroProperty extends AbstractAction{
	public ActionKazuhiroProperty() {super();}
	//プロパティが押されたら反応する
	public void actionPerformed(ActionEvent e) {
		MakeKazuhiroProperty propertyArea=new MakeKazuhiroProperty("プロパティ");//プロパティのパネルを表示
		GuiVisible_anotherVisible w=new GuiVisible_anotherVisible();
		w.stopGuimenu1();//メインメニューを見えなくする
		propertyArea.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE);
		propertyArea.setExtendedState(JFrame.MAXIMIZED_BOTH);
		propertyArea.MakePropertyKa();
		propertyArea.setMinimumSize(new Dimension(400,600));
		propertyArea.setLocation(200,200);
	    propertyArea.setSize(100,100);
	    propertyArea.addWindowListener(new WindowClosing());
	    propertyArea.setVisible( true );
	}
}

class PropertyActionKa extends AbstractAction{
	
	JPanel menu;
	int number1;
	int number2;
	JPanel menu2;
	String[] list;
	StockValue value;
	
	
	
	public PropertyActionKa(JPanel menu,String title,int number1,int number2) {
		super(title);
		menu2=new JPanel();
		list=null;
		value=new StockValue();
		this.menu=menu;
		this.number1=number1;
		this.number2=number2;
		}
	public void actionPerformed(ActionEvent e) {
		 StockValue valuelist=new StockValue();
		 if(number1==0) list=valuelist.getreactionList();
		 else if(number1==1)list=valuelist.getPList();
		 else if(number1==2)list=valuelist.getNList();
		 
		 
		 //addする
		 if(number2==0) {
			 String ret = JOptionPane.showInputDialog(menu2);
			 list=value.listAdd(ret,number1,list); 
		 }
		 else if(number2==1) {}
		 

		     
		     if(number2==0||number2==2) {
				 JList<?> lisT = new JList<Object>( list ); // リストボックスの生成
				 JScrollPane scr = new JScrollPane( lisT );
			     Object[]  obj = { scr }; // リストボックスを配列に
		    	 JOptionPane.showMessageDialog( menu2, obj ); // ダイアログボックスにリストボックスを追加して表示 
		     }
		     else {		    	 
		    	 if(list.length>1) {
		    		 Object ans=JOptionPane.showInputDialog( menu, "削除する項目を選んでください", "了解・取消し",
			    			 JOptionPane.OK_CANCEL_OPTION,null,list,0 );
		    		 try{
		    			 list=value.listRemove(number1,ans.toString(),list);
		    		 }catch(NullPointerException e2){
		    			 JOptionPane.showMessageDialog( menu2, e2+"が発生しました" );
		    		 }
		    		 }
		    	 else {
		    		 JOptionPane.showMessageDialog( menu2, "listの中に単語が一つしかないため削除できません。何か単語を追加して下さい。");
		    	 }
		    	 JList<?> lisT = new JList<Object>(list);
				 JScrollPane scr = new JScrollPane( lisT );
			     Object[]  obj = { scr }; // リストボックスを配列に 
		    	 JOptionPane.showMessageDialog( menu2, obj); // ダイアログボックスにリストボックスを追加して表示
		     }
	}
}