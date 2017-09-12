package h05;

import java.applet.Applet;
import java.awt.*;

public class Praktijk5 extends Applet {
    //declaratie.
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init(){
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 200;
        hoogte = 100;
    }
    public void paint(Graphics g){
        g.drawLine(50,50,160,50); //lijn
        g.drawString("Lijn", 90,70);
        g.drawRect(50,100,breedte,hoogte); //rechthoek
        g.drawString("Rechthoek", 120,220);
        g.drawRoundRect(50,230,breedte,hoogte,30,30); //afgeronde hoek
        g.drawString("Afgeronde hoek", 120, 350);
        g.setColor(opvulkleur);
        g.fillRect(290,50,breedte,hoogte);
        g.setColor(lijnkleur);
        g.drawOval(290, 50,breedte,hoogte);
        g.drawString("Gevulde rechthoek met ovaal",320,180);
        g.setColor(opvulkleur);
        g.fillOval(290,200,breedte,hoogte);
        g.setColor(lijnkleur);
        g.drawString("Taartpunt met ovaal eromheen", 530,180);
        g.drawString("Gevulde ovaal", 340,330);
        g.drawArc(500,50,breedte,hoogte,0,360);
        g.setColor(opvulkleur);
        g.fillArc(500,50,breedte,hoogte,0,45);
        g.setColor(lijnkleur);
        g.drawOval(550,200,breedte,hoogte);
        g.drawString("Cirkel", 580,320);

    }
}
