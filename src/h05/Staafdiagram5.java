package h05;
import java.applet.Applet;
import java.awt.*;

public class Staafdiagram5 extends Applet {
    int Valeriegewicht;
    int Hansgewicht;
    int Jeroengewicht;
    int nullijn;
    public void init(){
        nullijn = 250;
        Valeriegewicht=65;
        Hansgewicht=30;
        Jeroengewicht=52;
    }
    public void paint(Graphics g){
        g.drawLine(20,nullijn,20,50);//Gewicht lijn
        g.drawLine(20, nullijn, 250, 250); //naam lijn
        g.drawString("20", 5 , 220);
        g.drawString("40", 5 , 180);
        g.drawString("60", 5 , 140);
        g.drawString("80", 5 , 100);
        g.drawString("100", 1 , 60);
        g.setColor(Color.RED);
        g.fillRect(30, nullijn-Valeriegewicht*2,30, Valeriegewicht*2 );//Rode diagram
        g.drawString("Valerie", 30, 270);//Valerie
        g.setColor(Color.BLUE);
        g.fillRect(80, nullijn-Hansgewicht*2, 30, Hansgewicht*2);
        g.drawString("Hans", 85, 270);
        g.setColor(Color.GREEN);
        g.fillRect(130, nullijn-Jeroengewicht*2, 30, Jeroengewicht*2);
        g.drawString("Jeroen", 130, 270);
    }
}
