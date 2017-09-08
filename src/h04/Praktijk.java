package h04;

import java.applet.Applet;
import java.awt.*;

public class Praktijk extends Applet {
    public void init(){

    }
    public void paint(Graphics g){
        g.drawLine(50,50,160,50); //lijn
        g.drawString("Lijn", 90,70);
        g.drawRect(50,100,200,100); //rechthoek
        g.drawString("Rechthoek", 120,220);
        g.drawRoundRect(50,230,200,100,30,30); //afgeronde hoek
        g.drawString("Afgeronde hoek", 120, 350);
        g.setColor(Color.magenta);
        g.fillRect(290,50,200,100);
        g.setColor(Color.black);
        g.drawOval(290, 50,200,100);
        g.drawString("Gevulde rechthoek met ovaal",320,180);
        g.setColor(Color.magenta);
        g.fillOval(290,200,180,100);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen", 530,180);
        g.drawString("Gevulde ovaal", 340,330);
        g.drawArc(500,50,200,100,0,360);
        g.setColor(Color.magenta);
        g.fillArc(500,50,200,100,0,45);
        g.setColor(Color.black);
        g.drawOval(550,200,100,100);
        g.drawString("Cirkel", 580,320);

    }
}
