package botChat;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ActionKazuhiro extends AbstractAction{
	//
	JPanel pane2;
	MakeKazuhiroChatField Area;
	JTextField chatFieldMe;
	JTextField chatFieldKa;
	 ComunicateKazuhiro comunicate;
	 GuiVisible_anotherVisible w;
	 boolean judge=true;
	 static String reply=null;
	public ActionKazuhiro() {
		super();
		}
	public void actionPerformed(ActionEvent e) {
		pane2=new JPanel();
		//Guimenu非表示
		w=new GuiVisible_anotherVisible();
		w.stopGuimenu1();
		//chatField定義
		chatFieldMe=new JTextField();
	    chatFieldKa=new JTextField();
		//label定義
	    JLabel labelMe=new JLabel("あなた");
	    JLabel labelKa=new JLabel("カズヒロ");
	   
	    
		//TextAreaの定義
		Area=new MakeKazuhiroChatField("カズヒロのチャット");
		Area.MakeArea(pane2,chatFieldMe,chatFieldKa,labelMe,labelKa);
		Area.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE);
		Area.setExtendedState(JFrame.MAXIMIZED_BOTH);
		Area.setMinimumSize(new Dimension(400,600));
		Area.setLocation(200,200);
	    Area.setSize(100,100);
	    Area.addWindowListener(new WindowClosing());
	    Area.setVisible( true );
	    //かずひろに接続
	    this.comunicate=new ComunicateKazuhiro();
	    chatFieldKa.setText("----かずひろに接続しています----");
	    
	    //かずひろの一言目
	    chatFieldKa.setText("なんですか\n");
	    //自分のテキストフィールドに文字が入力されたら反応する
	    chatFieldMe.addActionListener( new TextFieldTestAction());
	}
	class TextFieldTestAction implements ActionListener  {
		//入力された単語に対する反応
	    public void actionPerformed( ActionEvent e ){
	    	reply=chatFieldMe.getText();
	    	//自分のテキストフィールドをリセット
	    	chatFieldMe.setText(null);
	    	judge=comunicate.RAComunicate(pane2, chatFieldKa, reply);
	    	if(reply.equals("もうやめたい")||false==judge) {
	    		Area.addWindowListener(new WindowClosing());
	    		 w.onGuimenu1();//入力された単語を識別して、ポジティブワードかネガティブワードを返す
	    	} //もうやめたいが入力されたらチャットルームを閉じる
	    	
	      }
	    }
}
