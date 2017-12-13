import java.awt.*;
import java.applet.*;

public class Train{
	
	public Train(Graphics g, Color c, int num) {
		for (int i=0; i<num; i++) { 
			g.setColor(c);
			g.fillRect(40+(i*240), 450, 200, 150);
			g.setColor(Color.black); 
			g.fillOval(50+(i*240), 575, 50, 50);
			g.setColor(Color.black); 
			g.fillOval(180+(i*240), 575, 50, 50);
			if (i == 0) {
				g.setColor(Color.black);
				g.fillRect(50, 410, 20, 40);
			}
			if (i>1 && i<num) {
				g.setColor(Color.black); 
			}
			if (i == num) {
				g.setColor(Color.black); 
			}
		}
			
	}	
}
