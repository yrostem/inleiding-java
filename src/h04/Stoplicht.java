package h04;
import java.applet.Applet;
import java.awt.*;

public class Stoplicht extends Applet {
    public void init(){

    }

    public void paint(Graphics g){
        g.setColor(Color.black);
        g.fillRect(100,50, 100, 200);
        g.setColor(Color.RED);
        g.fillOval(125,60,50,50);
        g.setColor(Color.ORANGE);
        g.fillOval(125, 120, 50,50);
        g.setColor(Color.GREEN);
        g.fillOval(125,180,50,50);
    }
}
