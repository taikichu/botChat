package botChat;

import javax.swing.JFrame;

public class GuiVisible_anotherVisible{
	static Gui w;
	public GuiVisible_anotherVisible(String title){
		w=new Gui(title);
		w.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		w.setExtendedState(JFrame.MAXIMIZED_BOTH);
		w.setLocation(250,250);
		w.setSize( 600, 600 );
		w.setVisible( true );
    }
	public GuiVisible_anotherVisible() {}
	public Gui getGui() {
		return w;
	}
	public void stopGuimenu1() {
		w.setVisible(false);
	}
	public void onGuimenu1() {
		w.setVisible(true);
	}
}
