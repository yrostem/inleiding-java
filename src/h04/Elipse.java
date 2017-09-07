package h04;
import java.applet.Applet;
import java.awt.*;

public class Elipse extends Applet{
    public void init(){

    }
    public void paint(Graphics g){
        setBackground(Color.BLUE);
        g.drawOval(100,60,150,200);
        g.setColor(Color.yellow);
        g.fillArc(100, 60, 150, 200, 90, 360);
    }
}
