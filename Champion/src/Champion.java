import java.awt.*;
import java.awt.geom.Line2D;
import javax.swing.*;

import java.applet.*;

public class Champion extends Applet{
	
	public Champion(Graphics g) {     
		paintBackground(g);
		paintCharacter(g);
	}
	
	public void paintBackground(Graphics g) {
		setBackground(new Color(112, 193, 239));
		g.setColor(new Color(56, 196, 103));
		g.fillRect(0, 550, 1400, 300);
	}
	
	public void paintCharacter(Graphics g) {
		g.setColor(Color.black); 
		g.fillOval(375, 382, 50, 50);
		g.fillRect(387, 430, 25, 100);
		int[] legonex = {387, 399, 387, 375};
		int[] legoney = {530, 530, 610, 610};
		g.fillPolygon(legonex, legoney, 4);
		int[] legtwox = {399, 411, 423, 411};
		int[] legtwoy = {530, 530, 610, 610};
		g.fillPolygon(legtwox, legtwoy, 4);
		int[] armonex = {387, 387, 367, 354};
		int[] armoney = {432, 450, 492, 492};
		g.fillPolygon(armonex, armoney, 4);
		int[] armtwox = {412, 412, 432, 445};
		int[] armtwoy = {432, 450, 492, 492};
		g.fillPolygon(armtwox, armtwoy, 4);
	}
	
	public void paintSword(Graphics g) {
		g.setColor(new Color(91, 62, 4));
		int[] handlex = {430, 433, 443, 440};
		int[] handley = {500, 503, 473, 470};
		g.fillPolygon(handlex, handley, 4);
		g.setColor(new Color(119, 121, 124)); 
		g.fillOval(427, 495, 10, 10);
		int[] bladex = {438, 445, 470, 474 ,463};
		int[] bladey = {468, 475, 400, 390, 393};	
		g.fillPolygon(bladex, bladey, 5);
	}
	
	public void paintBow(Graphics g) {
		Graphics2D f = (Graphics2D) g;
		f.setColor(new Color(119, 121, 124)); 
		f.setStroke(new BasicStroke(4));
		f.drawLine(405, 485, 445, 440);
		f.setColor(new Color(79, 42, 0)); 
		f.setStroke(new BasicStroke(4));
		f.drawLine(425, 462, 460, 497);
		f.setColor(new Color(91, 62, 4)); 
		f.setStroke(new BasicStroke(7));
		f.drawArc(395, 435, 60, 60, 230, 180);
		f.setColor(new Color(119, 121, 124));
		int[] spearx = {457, 466, 469};
		int[] speary = {503, 494, 505};
		f.fillPolygon(spearx, speary, 3);
		f.setColor(new Color(244, 77, 58));
		int[] fletchx = {417, 426, 429};
		int[] fletchy = {464, 456, 466};
		f.fillPolygon(fletchx, fletchy, 3);
	}
	
	public void paintQuiver(Graphics g) {
		Graphics2D a = (Graphics2D) g;
		a.setColor(new Color(79, 42, 0)); 
		a.setStroke(new BasicStroke(4));
		a.drawLine(377, 415, 397, 500);
		a.drawLine(372, 410, 392, 495);
		a.drawLine(367, 405, 387, 490);
		g.setColor(new Color(244, 77, 58));
		int[] fletch1x = {372, 381, 377};
		int[] fletch1y = {415, 413, 421};
		g.fillPolygon(fletch1x, fletch1y, 3);
		int[] fletch2x = {367, 376, 372};
		int[] fletch2y = {408, 406, 414};
		g.fillPolygon(fletch2x, fletch2y, 3);
		int[] fletch3x = {362, 371, 367};
		int[] fletch3y = {403, 401, 409};
		g.fillPolygon(fletch3x, fletch3y, 3);
		g.setColor(new Color(198, 161, 81));
		int[] quiverx = {387, 367, 387, 407};
		int[] quivery = {425, 435, 515, 510};
		g.fillPolygon(quiverx, quivery, 4);
	}
}
