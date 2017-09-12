package h04;
import java.applet.Applet;
import java.awt.*;

public class Staafdiagram extends Applet {

    public void init(){

    }
    public void paint(Graphics g){
        g.drawLine(20,250,20,50);//Gewicht lijn
        g.drawLine(20, 250, 250, 250); //naam lijn
        g.drawString("20", 5 , 220);
        g.drawString("40", 5 , 180);
        g.drawString("60", 5 , 140);
        g.drawString("80", 5 , 100);
        g.drawString("100", 1 , 60);
        g.setColor(Color.RED);
        g.fillRect(30, 175,30, 76 );//Rode diagram
        g.drawString("Valerie", 30, 270);//Valerie
        g.setColor(Color.BLUE);
        g.fillRect(80, 90, 30, 160);
        g.drawString("Hans", 85, 270);
        g.setColor(Color.GREEN);
        g.fillRect(130, 60, 30, 190);
        g.drawString("Piet", 130, 270);
    }
}
