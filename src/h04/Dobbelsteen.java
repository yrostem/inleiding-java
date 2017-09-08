package h04;

import java.applet.Applet;
import java.awt.*;

public class Dobbelsteen extends Applet{
    public void init(){

    }
    public void paint(Graphics g){
        g.drawRect(80,100,110,110);
        g.setColor(Color.black);//kleur
        g.fillOval(100,120,20,20);
        g.fillOval(100,170,20,20);
        g.fillOval(150,170,20,20);
        g.fillOval(150,120,20,20);
    }
}
