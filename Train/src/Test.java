import java.awt.*;
import java.applet.*;

public class Test extends Applet{

	public void init() {
		setSize(new Dimension(1400, 700));
	}
	
	public void Scenery(Graphics g) {
		g.setColor(new Color(112, 193, 239)); 
		g.fillRect(0, 0, 1400, 700);
		g.setColor(new Color(56, 196, 103));
		g.fillRect(0, 550, 1400, 150);
	}
	
	public void paint(Graphics g) {
		init();
		Scenery(g);
		Train c = new Train(g, Color.green, 3);
		
	}
}
