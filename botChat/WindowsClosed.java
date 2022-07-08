package botChat;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class WindowClosing extends WindowAdapter{
    public void windowClosing(WindowEvent e) {
    	GuiVisible_anotherVisible set=new GuiVisible_anotherVisible();
    	StockValue value=new StockValue();
    	set.onGuimenu1();
    	value.wordset();
    }
}