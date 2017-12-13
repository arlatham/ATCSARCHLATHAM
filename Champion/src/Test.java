import java.awt.*;
import java.applet.*;

public class Test extends Applet{
	
	public void init() {
		setSize(new Dimension(800, 800));
		setBackground(new Color(112, 193, 239));
	}
	
	public void paint(Graphics g) {
		init();
		Champion x = new Champion(g);
		
		x.paintBow(g);
	}
}
