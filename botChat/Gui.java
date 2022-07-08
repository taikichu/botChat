package botChat;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;


public class Gui extends JFrame{
	static JTextArea tfM2;
	static JTextArea tfM3;
	 public Gui() {super();}
	JPanel pane=(JPanel)getContentPane();
  public Gui( String title ){
    super( title );
    
    
    //textArea　作成
//    JTextField tfM1=new JTextField();
//    tfM1.setPreferredSize(new Dimension(Short.MAX_VALUE,50));
//    tfM1.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 20));
//    tfM1.setBorder( new TitledBorder( "検索バー" ) );
    
    tfM2=new JTextArea();
    tfM2.setPreferredSize(new Dimension(500,0));
    //tfM2.setMaximumSize(new Dimension(Short.MAX_VALUE,Short.MAX_VALUE));
    tfM2.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 20));
    tfM2.setEnabled(false);
    tfM2.setBorder( new TitledBorder( "自分のチャット履歴" ) );
    
    tfM3=new JTextArea();
    tfM3.setPreferredSize(new Dimension(500,0));
    //tfM3.setMaximumSize(new Dimension(Short.MAX_VALUE,Short.MAX_VALUE));
    tfM3.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 20));
    tfM3.setEnabled(false);
    tfM3.setBorder( new TitledBorder( "カズヒロのチャット履歴" ) );
    
    //メニューパネル作成
    JPanel menu1=new JPanel();
    menu1.setLayout( new BoxLayout( menu1, BoxLayout.Y_AXIS ) );// レイアウト方法の指定
//    menu1.setPreferredSize(new Dimension(150,50));
//    //メニューボタン作成


      
      JButton mk_bt=new JButton(new ActionKazuhiro());
      mk_bt.setAlignmentX(0.5f);//ボタン位置を中央に
      mk_bt.setPreferredSize(new Dimension(150,50));
      mk_bt.setMaximumSize(new Dimension(Short.MAX_VALUE,Short.MAX_VALUE));
      mk_bt.setText("カズヒロとチャット");
      
      
      JButton pmk_bt=new JButton(new ActionKazuhiroProperty());
      pmk_bt.setText("プロパティ");
      pmk_bt.setAlignmentX(0.5f);//ボタン位置を中央に
      pmk_bt.setPreferredSize(new Dimension(150,50));
      pmk_bt.setMaximumSize(new Dimension(Short.MAX_VALUE,Short.MAX_VALUE/200));

      
      
      
   // ボタンの追加
      menu1.add( mk_bt ); 
      menu1.add(pmk_bt);
      
//    pane.add(tfM1,BorderLayout.PAGE_START);
    pane.add(tfM2,BorderLayout.WEST);
    pane.add(tfM3,BorderLayout.EAST);
    pane.add(menu1,BorderLayout.CENTER);
  }
  public void RetValue(String[] tf2,String[] tf3) {
	  for(String li:tf2) { tfM2.append(li+"\n"); }
	  for(String li:tf3) { tfM3.append(li+"\n"); }
  }
}
