import java.awt.*;
import java.applet.*;

public class House extends Applet{
	
	public void init() {
		setSize(new Dimension(1400, 700));
	}
	
	public void paint(Graphics g) {
		g.setColor(new Color(112, 193, 239)); 
		g.fillRect(0, 0, 1400, 700);
		g.setColor(new Color(56, 196, 103));
		g.fillRect(0, 550, 1400, 150);
		g.setColor(new Color(173, 22, 22));
		g.fillRect(300, 200, 800, 400);
		g.setColor(new Color(163, 109, 17));
		g.fillRect(300, 200, 800, 400);
	}
	
}
