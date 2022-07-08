package botChat;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MakeKazuhiroChatField extends JFrame{
	public MakeKazuhiroChatField(String title) {
		super(title);
	}
	public void MakeArea(JPanel pane2,JTextField chatFieldMe,JTextField chatFieldKa,JLabel labelMe,JLabel labelKa) {
		
		pane2=(JPanel)getContentPane();
		pane2.setLayout(new BorderLayout());
		
		JPanel paneMe=new JPanel();
		JPanel paneKa=new JPanel();
		
		paneMe.setLayout(new BoxLayout(paneMe,BoxLayout.Y_AXIS));
		paneKa.setLayout(new BoxLayout(paneKa,BoxLayout.Y_AXIS));
		
		 JInternalFrame iframe1 = new JInternalFrame("IFrame1", true, true, true, true);
		 iframe1.setSize(250, 120);
		 iframe1.setLocation(10, 10);
		 iframe1.setVisible(true);
		//chatField作成
		chatFieldMe.setPreferredSize(new Dimension(600,Short.MAX_VALUE));
		chatFieldMe.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 20));
		
		chatFieldKa.setPreferredSize(new Dimension(600,Short.MAX_VALUE));
		chatFieldKa.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 20));
		//ラベル作成
	    labelMe.setPreferredSize(new Dimension(200, 100));
	    labelMe.setVerticalAlignment(JLabel.TOP);
	    labelMe.setHorizontalAlignment(JLabel.RIGHT);
	    
	    labelKa.setPreferredSize(new Dimension(200, 100));
	    labelKa.setVerticalAlignment(JLabel.TOP);
	    labelKa.setHorizontalAlignment(JLabel.RIGHT);
		
	    paneMe.add(labelMe);
	    paneKa.add(labelKa);
	    
	    paneMe.add(chatFieldMe);
	    paneKa.add(chatFieldKa);
	    //contentpane貼り付け
		pane2.add(iframe1);
		pane2.add(paneMe,BorderLayout.LINE_START);
		pane2.add(paneKa,BorderLayout.LINE_END);
	}
	public MakeKazuhiroChatField() {}
}
